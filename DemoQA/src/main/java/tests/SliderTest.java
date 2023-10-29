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

		Actions action = new Actions(testBasic.driver);
	// case 2---------------------
		action.dragAndDropBy(sliderPage.findElementByLocator(sliderPage.rangeSlider), 1000, 0).build().perform();
		
		// case 1---------------------
//		action.moveToElement(element, 50, 0); // this will make it to start at 0,0 of the slider
//		action.clickAndHold(); // don't pass the element, now it will click current mouse location which is
//		Thread.sleep(20);
//		action.moveByOffset(100, 0); // move by 30 pixel from 0
//		Thread.sleep(20);
//		action.build().perform();
	}
}
