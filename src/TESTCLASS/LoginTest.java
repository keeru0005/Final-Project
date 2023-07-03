package TESTCLASS;




import org.testng.annotations.Test;


import PAGECLASS.LoginPage;



public class LoginTest extends BaseClass {

	

	@Test
	public void testlogin ()
	{
		
		LoginPage ob = new LoginPage(driver);
		ob.Login();
	    ob.setvalues("keerthanavijayankeeru@gmail.com", "143143");
        ob.Login_Button();
        
		
		
	}
	
}
