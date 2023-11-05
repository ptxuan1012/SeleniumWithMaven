package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import common.TestBasic;

public class TestCase {
	//Inheritance - has A
	public TestBasic testBasic = new TestBasic();
	@BeforeMethod(alwaysRun = true)
	public void openWebsite() {
		testBasic.openWebsite("https://demoqa.com/");
	}
	@AfterMethod
	public void closeBrowser() {
		testBasic.closeBrowser();
	}

}
