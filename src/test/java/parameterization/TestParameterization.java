package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParameterization {
	
	@Test(dataProvider = "getData")
	public void doLogin(String Username, String password) {
		System.out.println(Username+"---- "+ password);
		
	}

	
	
	@DataProvider
	public Object[][] getData() { // if it is providing data to test the method should not be in void
	    Object[][] data = new Object[3][2];
	    
	    data[0][0] = "trainer@automation.com";
	    data[0][1] = "spdpdp";
	    
	    data[1][0] = "java@automation.com";
	    data[1][1] = "sdfgh";
	    
	    data[2][0] = "core@automation.com";
	    data[2][1] = "qwerf";
	    
	    
	    
	    
	    return data;
	
	
	
	
	}
	
	
	
	
}
