package tests;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.HomePage;
import pages.Page;


@Test
public class CheckBoxTest extends TestCase{
	
	public void doCheckBox() {
		HomePage homePage = new HomePage(testBasic.driver);
		// Click Element
		ElementsPage elementsPage = homePage.clickElements();
	// Click Checkbox menu
		elementsPage.clickCheckBoxMenu();
		
		CheckBoxPage checkBoxPage = elementsPage.clickCheckBoxMenu();
		Assert.assertTrue(checkBoxPage.isCheckBoxUnchecked(checkBoxPage.cbHomeCheckBox));
		
		checkBoxPage.clickOnHomeCheckBox();
		
		String expectedHomeStr = "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		String actualHomeStr = checkBoxPage.getHomeStr();
		AssertJUnit.assertEquals(expectedHomeStr, actualHomeStr);
		checkBoxPage.clickOnIconExpand();
		//check hien thi listItem
		String expectedListItem ="Desktop Documents Downloads";
		String actualListItem =checkBoxPage.displayListCB();
		AssertJUnit.assertEquals(expectedListItem, actualListItem);
		//check all checkbox
		
	}

}
