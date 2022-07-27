package db.validation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.Assert;

public class EmpSql {
	
	 static String getEmploysql="Select * from Employ";
	
	 public static void verifyEmpName(ResultSet rs, String exp) throws SQLException {
		 
		 Assert.assertEquals(rs.getString("EmpName"), exp,"employee name mismatch");
		 
	 }
	
     public static void verifyEmpNo(ResultSet rs, int exp) throws SQLException {
    	 
    	 Assert.assertEquals(rs.getInt("EmpNo"), exp,"employee No mismatch");
	 }
	
 
     public static void verifyDomain(ResultSet rs, String exp) throws SQLException {
    	 
    	 Assert.assertEquals(rs.getString("Domain"), exp,"employee Domain mismatch");
	 
     }
     
    public static void verifyCompany(ResultSet rs, String exp) throws SQLException {
    	
    	Assert.assertEquals(rs.getString("Company"), exp,"employee Company mismatch");
	 }

}
