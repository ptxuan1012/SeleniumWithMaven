package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MenuPage;
import pages.WidgetPage;

public class MenuTest extends TestCase{
	@Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		MenuPage menuPage = widgetPage.clickMenuPage(widgetPage.menuMenu);
		
	Actions action = new Actions(testBasic.driver);
	WebElement mainMenu2= menuPage.testBasic.driver.findElement(menuPage.menuM2);
	menuPage.testBasic.scrollToElement(mainMenu2);
	action.moveToElement(mainMenu2).perform();
	
	WebElement mainSubMenu2= menuPage.testBasic.driver.findElement(menuPage.menuSubM2);
	action.moveToElement(mainSubMenu2).perform();
	Thread.sleep(1000);
	menuPage.testBasic.click(menuPage.menuSubofSubM2);
	
	}

}
