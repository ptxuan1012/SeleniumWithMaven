package tests;

import org.testng.annotations.Test;

import pages.BookStoreApplicationPage;
import pages.BookStoryPage;
import pages.HomePage;
import pages.LoginPage;

public class BookStoreApplicationTest extends TestCase {
	//@Test
	public void SummitLogin() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToElement(homePage.findElementByLocator(homePage.menuBookStore));
		BookStoreApplicationPage BookStore = homePage.clickBookStore();
		BookStore.testBasic.scrollToElement(BookStore.findElementByLocator(BookStore.menuLogin));
		LoginPage loginPage = BookStore.clickMenuLogin();
		loginPage.testBasic.inputText(loginPage.txtuserName, "Autotest");
		loginPage.testBasic.inputText(loginPage.txtPass, "Az12345@");
		loginPage.testBasic.scrollToElement(loginPage.findElementByLocator(loginPage.btnLogin));
		loginPage.testBasic.click(loginPage.btnLogin);
		// Az12345@
	}

	@Test
	public void BookStory() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToElement(homePage.findElementByLocator(homePage.menuBookStore));
		BookStoreApplicationPage BookStore = homePage.clickBookStore();
		BookStore.testBasic.scrollToElement(BookStore.findElementByLocator(BookStore.menuLogin));
		BookStoryPage bookPage = BookStore.clickMenuBookStory();
	}
}
