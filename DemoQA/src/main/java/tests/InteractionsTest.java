package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.InteractionsPage;
import pages.ReziseablePage;
import pages.SelectablePage;
import pages.SortablePage;
import pages.WidgetPage;

public class InteractionsTest extends TestCase {
//	@Test
	public void Sortable() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		InteractionsPage interaction = homePage.clickInteraction();
		interaction.testBasic.scrollToEndPage();
		SortablePage sortablePage = interaction.clickSortable();
		Actions action = new Actions(testBasic.driver);
//		tab1: cach 1
//		WebElement target = sortablePage.elementsList.get(0);
//		WebElement dest = sortablePage.elementsList.get(3);
//		
//		action.click(target).clickAndHold().moveToElement(dest);
//		sortablePage.testBasic.scrollToElement(dest);
//		action.moveByOffset(10, 0).release().build().perform();

//		tab2:
		//Click chuyen tab 2
		sortablePage.testBasic.click(sortablePage.tabGirt);
		WebElement target1 = sortablePage.findLocator("One");
		sortablePage.testBasic.scrollToElement(target1);
		WebElement dest1 = sortablePage.findLocator("Three");
		action.clickAndHold(target1);
		action.moveToElement(dest1);
		action.moveByOffset(10, 0).release().build().perform();

	}
	//@Test
	public void Selectable() {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		InteractionsPage interaction = homePage.clickInteraction();
		interaction.testBasic.scrollToEndPage();
		SelectablePage selectable = interaction.clickSelectable();
		Actions action = new Actions(testBasic.driver);
//		tab1: cach 1
		WebElement target = selectable.elementsList.get(0);
		WebElement dest = selectable.elementsList.get(3);		
		action.click(target).moveByOffset(10, 0).release().build().perform();
		selectable.testBasic.scrollToElement(target);
		action.click(dest).moveByOffset(10, 0).release().build().perform();
		
		//Click chuyen tab 2
		selectable.testBasic.click(selectable.tabGirt);
		WebElement target1 = selectable.findLocator("One");
		WebElement target2 = selectable.findLocator("Five");
		WebElement target3 = selectable.findLocator("Nine");
		WebElement target4 = selectable.findLocator("Three");
		WebElement target5 = selectable.findLocator("Seven");
		selectable.testBasic.scrollToElement(target1);
		action.click(target1).moveByOffset(10, 0).release().build().perform();
		action.click(target2).moveByOffset(10, 0).release().build().perform();
		action.click(target3).moveByOffset(10, 0).release().build().perform();
		action.click(target4).moveByOffset(10, 0).release().build().perform();
		action.click(target5).moveByOffset(10, 0).release().build().perform();
}
	@Test
	public void Resizeable() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		InteractionsPage interaction = homePage.clickInteraction();
		interaction.testBasic.scrollToEndPage();
		ReziseablePage resizeable = interaction.clickReziseable();
		Actions action = new Actions(testBasic.driver);
		//case 1
		WebElement scroll =resizeable.testBasic.findElementByLocator(resizeable.findRese);
		Thread.sleep(1000);
		resizeable.testBasic.scrollToElement(scroll);
		WebElement resize =resizeable.testBasic.findElementByLocator(resizeable.resizeable1);
		action.dragAndDropBy(resize, 150, 150).perform();
		//cas2
		WebElement scroll2 =resizeable.testBasic.findElementByLocator(resizeable.findRese2);
		Thread.sleep(1000);
		resizeable.testBasic.scrollToElement(scroll2);
		WebElement resize2 =resizeable.testBasic.findElementByLocator(resizeable.resizeable2);
		// chưa kéo duoc resize khi tham so khac (resize2,300,200)
		action.dragAndDropBy(resize2, 500, 300).perform();
		
		}
	// bai droppable va drapable chua lam
}
