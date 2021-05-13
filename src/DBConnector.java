import Docker.Conexion.connectURL;
import Pojos.Atom;
import Pojos.MetaData;
import Pojos.Variable;

import java.util.ArrayList;
import java.util.List;

public class DBConnector {
    private static connectURL con = new connectURL();
    public static MetaData metaData = new MetaData();

    public static void retrieveMetaData() {
        metaData = con.getMetaData();
    }
    // Example: ?- Employee(1, ?x, ?y) ?x > 100 .
    public static void query(String tableName, String[] columnNames, Variable[] variables) {
        if (!metaData.columns.containsKey(tableName)) {
            System.out.println("El predicado " + tableName + " no existe en la base de datos.");
            return;
        }

        for (String s : columnNames) {
            System.out.println("La columna es: " + s);
        }

        for (Variable var : variables) {
            System.out.println("La variable es:" + var.toString());
        }
        // Build query
        StringBuilder SQL = new StringBuilder();

        // Build SELECT section
        SQL.append("SELECT ");
        // Find target columns
        for (int i = 0; i < columnNames.length; i++) {
            // Target columns start with ?
            if (columnNames[i].charAt(0) == '?') {
                ArrayList<String> tableColumns = metaData.columns.get(tableName);
                String targetColumnName = tableColumns.get(i);
                SQL.append(targetColumnName + ",");
            }
        }
        // Remove trailing comma
        SQL.deleteCharAt(SQL.length() - 1);

        // Build FROM section
        SQL.append(" FROM " + metaData.schema.get(tableName) + "." + tableName + " ");

        // Build WHERE section
        SQL.append("WHERE");


        // Find target columns
        for (int i = 0; i < columnNames.length; i++) {

            // Target columns start with ?
            if (columnNames[i].charAt(0) != '?') {
                ArrayList<String> tableColumns = metaData.columns.get(tableName);
                String targetColumnName = tableColumns.get(i);
                SQL.append(" " + targetColumnName + "='" + columnNames[i] + "' AND");
            }

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
