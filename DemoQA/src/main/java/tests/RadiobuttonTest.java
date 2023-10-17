package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadiobuttonTest extends TestCase{
	@Test
	public void doExe() {
		HomePage homePage = new HomePage(testBasic.driver);	
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		ElementsPage elementsPage = homePage.clickElements();
		elementsPage.testBasic.scrollToEndPage();
		RadioButtonPage radioBTN =elementsPage.clickMenuRadioBTN();
		String rdoRadioPage ="Yes";		
		//check luong thuc hien thanh cong
		Assert.assertEquals(radioBTN.isDiplay(radioBTN.titleRadioBTN), "Do you like the site?");
		//Assert.assertEquals(radioBTN.clickRadioButtonByLabel("Yes"), rdoRadioPage);
		radioBTN.testBasic.clickRadioButtonByLabel(rdoRadioPage);
		String actualResult = "You have selected " + rdoRadioPage;
		Assert.assertEquals(radioBTN.isDiplay(radioBTN.titleResultRDO),actualResult);
	}

}
