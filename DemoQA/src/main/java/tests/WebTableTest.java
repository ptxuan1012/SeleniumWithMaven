package tests;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.RegistrationFormPage;
import pages.WebTable;

public class WebTableTest extends TestCase{
	@Test
	public void doTC01() { 
		String firstName = "Cie";
		String lastName = "Pham";
		String userEmail = "xuan.pt@gmail.com";
		String age = "20";
		String salary = "10000000";
		String department ="Tang 3";		
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		ElementsPage elementsPage = homePage.clickElements();
		WebTable webTablePage = elementsPage.clickCheckWebTable();
		RegistrationFormPage registration = webTablePage.clickButton();
		Assert.assertEquals(registration.isDiplay(), "Registration Form");
		registration.testBasic.inputText(registration.txtFirsNameResPage, firstName);
		registration.testBasic.inputText(registration.txtLastNameResPage, lastName);
		registration.testBasic.inputText(registration.txtUserEmailResPage, userEmail);
		registration.testBasic.inputText(registration.txtAgeResPage, age);
		registration.testBasic.inputText(registration.txtSalaryResPage, salary);
		registration.testBasic.inputText(registration.txtDepartmentResPage, department);
		WebTable webTable2 =registration.clickSubmitButton();
		webTable2.testBasic.zoomOut();	
		boolean result =webTablePage.isCheckSearchResult(webTablePage.firstName, "Cie");
		assertTrue(result, "True");
		
		
	}

}
