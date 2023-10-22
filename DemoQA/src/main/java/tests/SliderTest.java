package tests;

import java.awt.Desktop.Action;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.SliderPage;
import pages.WidgetPage;

public class SliderTest extends TestCase {
	@Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		SliderPage sliderPage = widgetPage.clickSliderPage(widgetPage.menuSlider);
		WebElement element = sliderPage.findElementByLocator(sliderPage.srollSlider1);
		// WebElement eTarget = sliderPage.findElementByLocator(sliderPage.srollSlider);
		Actions action = new Actions(testBasic.driver);
		//action.moveToElement(element, 50, 0).perform();
		//case 1--------------------->> lần đầu chạy ok các lần sau k trượt 
//		action.clickAndHold(element);		
//		Thread.sleep(1000);
//		action.moveByOffset(50, 0);
//		Thread.sleep(1000);
//		action.perform();
//.................
		action.moveToElement(element,50,0); //this will make it to start at 0,0 of the slider
		action.clickAndHold(); //don't pass the element, now it will click current mouse location which is (0,0)
		Thread.sleep(20);
		action.moveByOffset(20,0); // move by 30 pixel from 0
		Thread.sleep(20);
		action.build().perform();
		//assert như nào??
	}
}
