package com.app.tests;

import static org.testng.Assert.assertEquals;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.utilities.DBUtility;
import com.app.utilities.DBType;

public class EmployeesDbTest {
	
  @Test
  public void countTest() throws SQLException {
	  //Connect to Oracle database
	  //run following sql queries
	  // select * from employees where job_id = 'IT_PROG'
	  // more than 0 records should be returned
	  DBUtility.establishConnection(DBType.ORACLE);
	  int rowsCount = DBUtility.getRowsCount("select * from employees where job_id='IT_PROG'");
	  Assert.assertTrue(rowsCount>0);
	  DBUtility.closeConnections();
  }
  @Test
  public void nameTestByID() throws SQLException {
	  DBUtility.establishConnection(DBType.ORACLE);
	  List<Map<String,Object>> empData = 
			  DBUtility.runSQLQuery("SELECT first_name,last_name FROM employees WHERE employee_id=105");
	  assertEquals(empData.get(0).get("FIRST_NAME"),"David");
	  assertEquals(empData.get(0).get("LAST_NAME"), "Austin");
  }
}
