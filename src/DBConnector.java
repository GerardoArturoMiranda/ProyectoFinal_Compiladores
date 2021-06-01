import Docker.Conexion.connectURL;
import Pojos.Atom;
import Pojos.MetaData;
import Pojos.Condition;
import Pojos.VariableOrLiteral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBConnector {
    private static connectURL con = new connectURL();
    public static MetaData metaData = new MetaData();

    public static void retrieveMetaData() {
        metaData = con.getMetaData();
    }
    // Example: ?- Employee(1, ?x, ?y) ?x > 100 .
    public static void query(String tableName, VariableOrLiteral[] varOrLit, Condition[] conditionals) {
        if (!metaData.columns.containsKey(tableName)) {
            System.out.println("El predicado " + tableName + " no existe en la base de datos.");
            return;
        }
        if(conditionals.length > 0){
            for (Condition cond : conditionals) {
                System.out.println("La condicional es:" + cond.toString());
            }
        }

        // Build query
        StringBuilder SQL = new StringBuilder();

        // Build SELECT section
        SQL.append("SELECT ");
        // Find target columns
        for (int i = 0; i < varOrLit.length; i++) {
            if (varOrLit[i].getType().equals(VariableOrLiteral.VARIABLE)) {
                ArrayList<String> tableColumns = metaData.columns.get(tableName);
                String targetColumnName = tableColumns.get(i);
                SQL.append(targetColumnName + ",");
                // Save for later use
                varOrLit[i].setColumnName(targetColumnName);
            }
        }
        // Remove trailing comma
        SQL.deleteCharAt(SQL.length() - 1);

        // Build FROM section
        SQL.append(" FROM " + metaData.schema.get(tableName) + "." + tableName + " ");

        // If there are no literals and no conditions, WHERE clause is not needed
        VariableOrLiteral[] literals = Arrays.stream(varOrLit)
                .filter(lit -> lit.getType().equals(VariableOrLiteral.LITERAL))
                .toArray(VariableOrLiteral[]::new);
        if (literals.length == 0 && conditionals.length == 0) {
            System.out.println("QUERY: " + SQL.toString());
            con.query(SQL.toString());
            return;
        }

        // Build WHERE section
        SQL.append("WHERE");

        // Find target rows
        for (int i = 0; i < varOrLit.length; i++) {

            // Target columns start with ?
            if (varOrLit[i].getType().equals(VariableOrLiteral.LITERAL)) {
                ArrayList<String> tableColumns = metaData.columns.get(tableName);
                String targetColumnName = tableColumns.get(i);
                SQL.append(" " + targetColumnName + "='" + varOrLit[i].getKey() + "' AND");
                // Save for later use
                varOrLit[i].setColumnName(targetColumnName);
            }

        }

        for (VariableOrLiteral vl : varOrLit) {
            System.out.println("La variable o literal es: " + vl);
        }

        // Add relational conditions
        for (int i = 0; i < conditionals.length; i++) {
            String variable = conditionals[i].getVariable();
            String targetColumnName = Arrays.stream(varOrLit)
                    .filter(vl -> vl.getKey().equals(variable))
                    .findFirst()
                    .get()
                    .getColumnName();
            SQL.append(" " + targetColumnName + conditionals[i].getOperador() + "'" + conditionals[i].getValor() + "' AND");
        }

        // Remove trailing AND
        SQL.delete(SQL.length() - 4, SQL.length());

        System.out.println("QUERY: " + SQL.toString());
        con.query(SQL.toString());
    }



    public static void ruleQuery(Atom headAtom, Atom[] bodyAtoms){
        String innerJoinVariable = "";
        /*

         Hermano(?x,?y):-Employee(?x), EmployeeAdrress(?y) .
                                       {Todas las Columnas} {}
              // Join (Rule) con la misma tabla

              Número de atributos de la nueva tabla  = número de columnas de la tabla * cantidad de bodyAtoms
                                                                            { metadata.columnNames de bodyAtoms[] }
              // Join (Rule) entre distintas tablas
                                                                           = número de columnas de la tabla * cantidad de bodyAtoms
                                                                            { metadata.columnNames de bodyAtoms[] }
             WITH Hermano (nombreE{I} columnName2Tabla1, nombre, columnName2Tabla2)
            AS
            (
                SELECT * FROM Parent as Pa1
                INNER JOIN
                Parent as Pa2
                    ON Pa1.Nombre= Pa2.Nombre
            )

            // D A T A     L O G
            ?- Hermano(?x,?y) , ?x = "Maria" .

            SELECT *
            WHERE Hermano.h1 = Maria
            FROM Hermano





         */
        StringBuilder SQL = new StringBuilder();


        SQL.append("WITH ");
        SQL.append(headAtom.getTableName() + " (");
        //  Build SELECT "TableRule" section
        int k = 0;
        for (Atom bodyAtomInstance: bodyAtoms) {
            for(int i = 0; i < bodyAtomInstance.getAttributesOrLiterals().size(); i++) {
                if (bodyAtomInstance.getAttributesOrLiterals().get(i).getType().equals(VariableOrLiteral.VARIABLE)) {
                    ArrayList<String> tableColumns = metaData.columns.get(bodyAtomInstance.getTableName());
                    String targetColumnName = tableColumns.get(i);
                    SQL.append(targetColumnName+(k) + ",");
                    // Save for later use
                    bodyAtomInstance.getAttributesOrLiterals().get(i).setColumnName(targetColumnName);
                }
                k++;
            }
        }
        // Remove trailing comma
        SQL.deleteCharAt(SQL.length() - 1);




        SQL.append(")");
        SQL.append(" AS( ");
        // Build SELECT section
        SQL.append("SELECT * ");

        // Find possibleJoin

        for(int i = 0; i < bodyAtoms.length; i++){
            System.out.println(bodyAtoms[i].toString());
        }

        String colToJoin = null;
        for (int i = 0; i < bodyAtoms.length; i++) {
            for (int j = i + 1; j < bodyAtoms.length; j++) {
                colToJoin = bodyAtoms[i].canBeJoined(bodyAtoms[j]);
                if (colToJoin != null) {
                    break;
                }
            }
            if (colToJoin != null) {
                break;
            }
        }

        if(colToJoin != null){
            for (Atom atomToCheck: bodyAtoms) {
                for (int j = 0; j < atomToCheck.getAttributesOrLiterals().size(); j++) {
                    if (atomToCheck.getAttributesOrLiterals().get(j).getType().equals(VariableOrLiteral.VARIABLE)) {
                        ArrayList<String> tableColumns = metaData.columns.get(atomToCheck.getAttributesOrLiterals().get(j).getColumnName());
                        String targetColumnName = tableColumns.get(j);
                        SQL.append(targetColumnName + ",");
                        // Save for later use
                        atomToCheck.getAttributesOrLiterals().get(j).setColumnName(targetColumnName);
                    }
                }
            }
            // Remove trailing comma
            SQL.deleteCharAt(SQL.length() - 1);

            // Parte del ALÍAS

            // Fin parte Alías

            // Parte del Inner Join
            SQL.append("INNER JOIN ON ");
            for (Atom atomToCheck: bodyAtoms) {
                SQL.append(atomToCheck.getTableName() + "." + innerJoinVariable + "=");
            }
            // Remove trailing equal
            SQL.deleteCharAt(SQL.length() - 1);
        }else{
            System.out.println("There's no variable for joining the tables.");
        }

        // Query Section
        SQL.append(") SELECT * FROM ");
        SQL.append(headAtom.getTableName());
    }
}
