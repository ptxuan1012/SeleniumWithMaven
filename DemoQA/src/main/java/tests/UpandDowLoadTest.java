package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.UpandDowLoadFile;

public class UpandDowLoadTest extends TestCase {
	@Test
	public void doEXE() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		ElementsPage elementsPage = homePage.clickElements();
		elementsPage.scrollToElement(elementsPage.menuForm);
		UpandDowLoadFile upandDow = elementsPage.clickMenuUpandDow();
		upandDow.testBasic.click(upandDow.btnDow);
		String expected = "sampleFile.jpeg";
		Assert.assertEquals(upandDow.getAtriBute(upandDow.btnDow,"download"), expected);
		upandDow.testBasic.upLoadFile(upandDow.btnUpfile);
		//String localDir = System.getProperty("user.dir");
		//chua biet lay tu dong
		String expectedUpLoaw = "C:\\fakepath\\Xuan.jpg";
		Assert.assertEquals(upandDow.textResultUpdate, expectedUpLoaw);
	}
}
