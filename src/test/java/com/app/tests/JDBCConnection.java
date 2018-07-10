package com.app.tests;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

public class JDBCConnection {

	String oracleDbUrl = "jdbc:oracle:thin:@ec2-13-59-17-24.us-east-2.compute.amazonaws.com:1521:xe";
	String oracleDbUsername = "hr";
	String oracleDbPassword = "hr";

	@Test(enabled=true)
	public void oracleJDBC() throws SQLException {
		Connection connection = DriverManager.getConnection(oracleDbUrl, oracleDbUsername, oracleDbPassword);
		//	Statement  statement = connection.createStatement();
		Statement  statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet resultSet =statement.executeQuery("select * from countries");

		//		while(resultSet.next()) {
		//			System.out.println(resultSet.getString(1)+"-"+resultSet.getString("country_name")+"-"+resultSet.getInt("region_id"));
		//		}
		resultSet.last();
		int rowsCount = resultSet.getRow();
		System.out.println("Number of rows: " + rowsCount);

		resultSet.beforeFirst();
		while(resultSet.next()) {
			System.out.println(resultSet.getString(1)+"-"+resultSet.getString("country_name")+"-"+resultSet.getInt("region_id"));
		}

		resultSet.close();
		statement.close();
		connection.close();
	}

	@Test
	public void jdbcMetadata() throws Exception{
		Connection connection = DriverManager.getConnection(oracleDbUrl, oracleDbUsername, oracleDbPassword);
		//	Statement  statement = connection.createStatement();
		Statement  statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//	String sql = "select employee_id, last_name, job_id, salary from employees";
		String sql = "select * from employees";
		ResultSet resultSet = statement.executeQuery(sql);

		//Database metadata
		//gives you info about database
		DatabaseMetaData dbMetadata = connection.getMetaData();
		System.out.println("User: " + dbMetadata.getUserName());
		System.out.println("Database type: " + dbMetadata.getDatabaseProductName());

		//resultSet metadata
		//gives you info about table
		ResultSetMetaData rsMedata = resultSet.getMetaData();
		System.out.println("Colomns count: " + rsMedata.getColumnCount());
		System.out.println(rsMedata.getColumnName(1));

		for(int i = 1; i <= rsMedata.getColumnCount(); i++) {
			System.out.println(i + " -> " + rsMedata.getColumnName(i));
		}

		//Throw resultSet into a List of Maps
		//Create a List of Maps
		List<Map<String,Object>> list = new ArrayList<>();
		ResultSetMetaData rsMdata = resultSet.getMetaData();

		int colCount = rsMdata.getColumnCount();

		while(resultSet.next()) {
			Map<String,Object> rowMap = new HashMap<>();

			for(int col = 1; col <= colCount; col++) {
				rowMap.put(rsMdata.getColumnName(col), resultSet.getObject(col));
			}
			list.add(rowMap);
		}

		for(Map<String,Object> emp : list) {
			System.out.println(emp.get("EMPLOYEE_ID"));
		}

		resultSet.close();
		statement.close();
		connection.close();
	}


}
