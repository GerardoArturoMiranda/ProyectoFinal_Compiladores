package Docker.Conexion;
//=====================================================================
//
//  File:    connectURL.java      
//  Summary: This Microsoft JDBC Driver for SQL Server sample application
//	     demonstrates how to connect to a SQL Server database by using
//	     a connection URL. It also demonstrates how to retrieve data 
//	     from a SQL Server database by using an SQL statement.
//
//---------------------------------------------------------------------
//
//  This file is part of the Microsoft JDBC Driver for SQL Server Code Samples.
//  Copyright (C) Microsoft Corporation.  All rights reserved.
//
//  This source code is intended only as a supplement to Microsoft
//  Development Tools and/or on-line documentation.  See these other
//  materials for detailed information regarding Microsoft code samples.
//
//  THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF 
//  ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO 
//  THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
//  PARTICULAR PURPOSE.
//
//===================================================================== 
import java.sql.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import Pojos.MetaData;

public class connectURL {

	public void query(String SQL) {
		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
				"databaseName=AdventureWorks;integratedSecurity=false;";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd;

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl,"sa","Compiladores@2021");

			// Create and execute an SQL statement that returns some data.
			// String SQL = leeArchivo(args[0]);

			// Get metadata
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			rsmd = rs.getMetaData();
			for(int i = 1; i <= rsmd.getColumnCount(); i++) {

				System.out.printf("%40s", rsmd.getColumnLabel(i));
			}
			System.out.println();
			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				for(int i = 1; i <= rsmd.getColumnCount(); i++) {

					System.out.printf("%40s",rs.getString(i));
				}
				System.out.println();
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
			if (stmt != null) try { stmt.close(); } catch(Exception e) {}
			if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}

	public MetaData getMetaData() {
		MetaData metaData = new MetaData();

		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
				"databaseName=AdventureWorks;integratedSecurity=false;";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd;

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl,"sa","Compiladores@2021");

			// Get metadata
			String SQL = "select * from INFORMATION_SCHEMA.COLUMNS";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			rsmd = rs.getMetaData();

			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				String schemaName = rs.getString(2);
				String tableName = rs.getString(3);
				String columnName = rs.getString(4);
				// If columns key, val pair don't exist, initialize them
				if (!metaData.columns.containsKey(tableName)) {
					metaData.columns.put(tableName, new ArrayList<>());
				}
				metaData.columns.get(tableName).add(columnName);
				metaData.columns.get(tableName).add("\n");
				metaData.schema.put(tableName, schemaName);
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
			if (stmt != null) try { stmt.close(); } catch(Exception e) {}
			if (con != null) try { con.close(); } catch(Exception e) {}
		}

		return metaData;
	}

	public static String leeArchivo(String archivo) {
		StringBuilder sb = new StringBuilder();
		try {
			File a = new File(archivo);
			Scanner sc = new Scanner(a);
			while (sc.hasNextLine()) {
				sb.append(sc.nextLine() + "\n");
			}
			sc.close();
		}
		catch(FileNotFoundException e) {
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		// Create a variable for the connection string.
		String connectionUrl = "jdbc:sqlserver://localhost:1433;" +
				"databaseName=AdventureWorks;integratedSecurity=false;";

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd;

		try {
			// Establish the connection.
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionUrl,"sa","Compiladores@2021");

			// Create and execute an SQL statement that returns some data.
			// String SQL = leeArchivo(args[0]);

			// Get metadata
			String SQL = "SELECT * FROM Sales.SpecialOffer";
			System.out.println(SQL);
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			rsmd = rs.getMetaData();
			for(int i = 1; i <= rsmd.getColumnCount(); i++) {
				System.out.printf("%40s", rsmd.getColumnLabel(i));
			}
			System.out.println();
			// Iterate through the data in the result set and display it.
			while (rs.next()) {
				for(int i = 1; i <= rsmd.getColumnCount(); i++) {
					System.out.printf("%40s",rs.getString(i));
				}
				System.out.println();
			}
		}

		// Handle any errors that may have occurred.
		catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			if (rs != null) try { rs.close(); } catch(Exception e) {}
			if (stmt != null) try { stmt.close(); } catch(Exception e) {}
			if (con != null) try { con.close(); } catch(Exception e) {}
		}
	}
}
