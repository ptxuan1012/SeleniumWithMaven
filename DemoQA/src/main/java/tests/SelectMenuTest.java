package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.MenuPage;
import pages.SelectMenuPage;
import pages.WidgetPage;

public class SelectMenuTest extends TestCase{
	@Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		SelectMenuPage selectMenuPage = widgetPage.clickSelectMenuPage();
		//selectMenuPage.testBasic.scrollToEndPage();
		selectMenuPage.testBasic.inputText(selectMenuPage.txtSelectValue, "Group 2, option 1");
		selectMenuPage.testBasic.keysEnter(selectMenuPage.txtSelectValue);
		
	
	
	}

}
