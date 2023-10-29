package tests;

import org.testng.annotations.Test;

import pages.AutoCompleteAndDatePickerPage;
import pages.HomePage;
import pages.WidgetPage;

public class AutoCompleteAndDatePickerTest extends TestCase {
	@Test
	public void doTC01() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		// --------------------------------------
		AutoCompleteAndDatePickerPage autoComple = widgetPage.clickCompleteanDate(widgetPage.menuComplete);
		autoComple.testBasic.scrollToElement(testBasic.driver.findElement(autoComple.txtMulti));
		autoComple.testBasic.inputText(autoComple.txtMulti, "White");
		autoComple.testBasic.keysEnter(autoComple.txtMulti);
		// ------------------------------------
		autoComple.testBasic.inputText(autoComple.txtSing, "White");
		autoComple.testBasic.keysEnter(autoComple.txtSing);
	}

	//@Test
	public void doTC02() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		WidgetPage widgetPage = homePage.clickWidget();
		widgetPage.testBasic.scrollToEndPage();
		// Select Date--------------------------------------
		AutoCompleteAndDatePickerPage datePicker = widgetPage.clickCompleteanDate(widgetPage.menuDatePicker);
//		datePicker.intBOD("2023", "November", "12");
		// Date And Time--------------------------------------
		datePicker.testBasic.click(datePicker.txtDateandTime);
		datePicker.ClickDOT("2020");
//		datePicker.ClickDOT("October");
//		datePicker.ClickDOT("10");
//		datePicker.selectTime("80:00");
	}
}
