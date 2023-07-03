package TESTCLASS;

import org.testng.annotations.Test;

import PAGECLASS.HomePage;

public class HomeTest extends BaseClass {

	@Test
	public void testhomepage()
	{
		HomePage ob = new HomePage(driver);
		ob.search();
		ob.search_button();
		ob.StartCourse();
		
	}
	
	
}
