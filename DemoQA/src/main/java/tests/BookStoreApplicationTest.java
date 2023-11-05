package tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.Utils;
import pages.BookStoreApplicationPage;
import pages.BookStoryPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProfilePage;

public class BookStoreApplicationTest extends TestCase {
	@Test(description = "TC01-Submit data successfully", dataProvider = "LoginData")
	public void SummitLogin(String userName, String pass) throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToElement(homePage.findElementByLocator(homePage.menuBookStore));
		BookStoreApplicationPage BookStore = homePage.clickBookStore();
		BookStore.testBasic.scrollToElement(BookStore.findElementByLocator(BookStore.menuLogin));
		LoginPage loginPage = BookStore.clickMenuLogin();
		loginPage.testBasic.inputText(loginPage.txtuserName, userName);
		loginPage.testBasic.inputText(loginPage.txtPass, pass);
		Thread.sleep(1000);
		loginPage.testBasic.scrollToElement(loginPage.findElementByLocator(loginPage.btnLogin));
		
		 ProfilePage profilePage = loginPage.clickProfilePage(); 
		 testBasic.driver.switchTo().defaultContent();
		 
		 String expected ="Profile";
		 String actualed = profilePage.isDiplay();
		 System.out.println(actualed);
		 assertEquals(actualed, expected);		 
	}

	@DataProvider(name = "LoginData") // giup mapping du lieu voi test case chạy
	public String[][] getFormData() {
		Utils utils = new Utils();
		String[][] dataTable = null;
		try {
			dataTable = utils.readDataFromExcel("testdataLogin.xlsx", "Login");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dataTable;

	}
}
