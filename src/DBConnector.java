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

        for (Condition cond : conditionals) {
            System.out.println("La condicional es:" + cond.toString());
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
        List<String> tableNameOfAtomsSchemas = new ArrayList<String>();
        
        /*
        WITH DirectReports (ManagerID, EmployeeID, Title, DeptID, Level)
                        AS
                        (
                            SELECT e.ManagerID, e.EmployeeID, e.Title, edh.DepartmentID,
                                0 AS Level
                            FROM HumanResources.Employee AS e
                            INNER JOIN HumanResources.EmployeeDepartmentHistory AS edh
                                ON e.EmployeeID = edh.EmployeeID AND edh.EndDate IS NULL
                            WHERE ManagerID IS NULL
                            UNION ALL
                         }
                SELECT ManagerID as ManagerID, EmployeeID as EmployeeID, Title as Title, Level as Level
                FROM DirectReports
                INNER JOIN HumanResources.Department AS dp
                    ON DirectReports.DeptID = dp.DepartmentID
                WHERE dp.GroupName = N'Research and Development' OR Level = 0;


                SQL.append(" FROM " + metaData.schema.get(tableName) + "." + tableName + " ");
         */

        // Starting the construction for the String
        /*
        StringBuilder SQL = new StringBuilder();
        SQL.append("WITH" + headAtom.getTableName());
        SQL.append("(");
        for(int i = 0; i < headAtom.getAtributes().size(); i++){
            SQL.append(headAtom.getAtributes().get(i));
            SQL.append(",");
        }
        SQL.deleteCharAt(SQL.length() - 1);
        SQL.append(")");
        SQL.append("AS (");
        for(int i = 0; i < bodyAtoms.length; i++){
            tableNameOfAtomsSchemas.add(metaData.schema.get(bodyAtoms[i].getTableName()));
        }
        // SELECT e.ManagerID, e.EmployeeID, e.Title, edh.DepartmentID,
        SQL.append("SELECT");
        for(int i = 0; i < bodyAtoms.length; i)
        SQL.append(tableNameOfAtomsSchemas.);

         */

    }
}
