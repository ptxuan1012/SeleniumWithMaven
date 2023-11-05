package tests;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementsPage;
import pages.HomePage;
import pages.Page;
import pages.TextboxPage;


//import org.testng.asserts.*;
@Test
public class TextBoxTest extends TestCase {

//	public static void main(String[] args) {
//		TestCase testCase = new TestCase();
//		testCase.doTC01();
//	}

	/**
	 * TextBox - TC01
	 */
	public void doTC02() {
		// Click vào phần tử Element trên trang Home
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.zoomOut();
		homePage.scrollToElement(homePage.menuElementsXpath);
		// Click vào phần tử Textbox
		ElementsPage elementsPage = homePage.clickElements();
		elementsPage.clickTextBoxMenu();

		// Input data
		TextboxPage textBox = elementsPage.clickTextBoxMenu();
		String inputFullName = "KhongNga";
		String inputEmail = "KhongNga";
		String inputCurrentAddress = "Ha Noi";
		String inputPermanentAddress = "HaNoi";
		textBox.inputFullName(inputFullName);
		textBox.inputEmail(inputEmail);
		textBox.inputCurrentAddress(inputCurrentAddress);
		textBox.inputPermanentAddress(inputPermanentAddress);

		// Scroll đến cuối trang
		// textBox.scrollToEndPage();

		// Scroll đến một phần tử nào đó
		//textBox.scrollToElement(textBox.findElementByLocator(textBox.btnSubmit));
		// Click button submit
		textBox.clickOnSubmit();
		Assert.assertTrue(textBox.isCheckEmail(textBox.resultEmail));
		System.out.println("Test case pass");
		}
}
