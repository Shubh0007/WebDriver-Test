package regression;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test(priority = 1)
	public void doUserReg() {
		System.out.println("Executing User registration");
		Assert.fail("User unable to register");
	}
	
	
	@Test(priority=2, dependsOnMethods= "doUserReg")
	public void loginapp() {
		System.out.println("Login into app"); // this will skip bcoz it is dependent on first method
	}
	
	@Test(priority = 3, dependsOnMethods="doUserReg", alwaysRun=true)
	public void thirdtest() {
		System.out.println("Executing third test");
	}
	// but I want thirdtest should be pass rather than being dependent, we will use alwaysRun=true
	
	
	@Test(priority = 4, dependsOnMethods="doUserReg")
	public void fourthtest() {
		System.out.println("executing fourth test");
	}
	


}
