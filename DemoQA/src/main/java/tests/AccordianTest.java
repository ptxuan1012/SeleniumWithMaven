package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AccordianPages;
import pages.AlertFramwWindowPages;
import pages.HomePage;
import pages.WidgetPage;

public class AccordianTest extends TestCase{
	@Test
	public void doTC01() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
	//case1----------------------------------------------------------
		AccordianPages accordianPage= widgetPage.clickAccordian();
		//Assert.(accordianPage.isCollapseShow(accordianPage.accorFirst));
		String actualFirst = accordianPage.testBasic.getText(accordianPage.textFirst);
		Assert.assertTrue(actualFirst.contains("electronic typesetting, remaining essentially unchanged"));
	}

}
