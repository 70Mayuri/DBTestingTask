package db.validation;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.Utilities;

public class EmpTest {
	@BeforeClass
	public void startup() {
		
		Utilities.setConnection();
	}

	@AfterClass
	public void teardown() throws SQLException  {
	
		Utilities.closeConnection();
	}
	@Test
	 public void getEmpTest() throws SQLException {
		 
		 ResultSet rs=Utilities.getValues(EmpSql.getEmploysql);
		 rs.next();
		 EmpSql.verifyEmpName(rs, "Javed Akhtar");
		 EmpSql.verifyDomain(rs, "QA");
		 
	}
	
}
