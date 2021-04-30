import Docker.Conexion.connectURL;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Locale;

public class DBConnector {
    private static connectURL con = new connectURL();
    public static Hashtable<String, ArrayList<String>> metaData = new Hashtable<>();

    public static void retrieveMetaData() {
        metaData = con.getMetaData();
    }

    public static void query(String tableName, String[] columnNames) {
        if (!metaData.containsKey(tableName)) {
            System.out.println("El predicado " + tableName + " no existe en la base de datos.");
            return;
        }

        // Build query
        StringBuilder SQL = new StringBuilder();

        // Build SELECT section
        SQL.append("SELECT ");
        // Find target columns
        for (int i = 0; i < columnNames.length; i++) {
            // Target columns start with ?
            if (columnNames[i].charAt(0) == '?') {
                ArrayList<String> tableColumns = metaData.get(tableName);
                String targetColumnName = tableColumns.get(i);
                SQL.append(targetColumnName + ",");
            }
        }
        // Remove trailing comma
        SQL.deleteCharAt(SQL.length() - 1);

        // Build FROM section
        SQL.append(" FROM " + tableName + " ");

        // Build WHERE section
        SQL.append("WHERE");
        // Find target columns
        for (int i = 0; i < columnNames.length; i++) {
            // Target columns start with ?
            if (columnNames[i].charAt(0) != '?') {
                ArrayList<String> tableColumns = metaData.get(tableName);
                String targetColumnName = tableColumns.get(i);
                SQL.append(" " + targetColumnName + "=" + columnNames[i] + " AND");
            }
        }
        // Remove trailing AND
        SQL.delete(SQL.length() - 4, SQL.length());

        System.out.println(SQL.toString());
        //con.query(SQL.toString());
    }
}
