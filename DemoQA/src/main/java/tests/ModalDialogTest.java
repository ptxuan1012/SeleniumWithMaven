package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AlertFramwWindowPages;
import pages.HomePage;
import pages.ModalDialogPage;

public class ModalDialogTest extends TestCase {
	//@Test
	public void doTC01() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		ModalDialogPage modalDialog = alertFramWin.clickModalDialog();
		modalDialog.testBasic.click(modalDialog.btnshowSmallModal);
		//heard Modal		
		String expectedHeardModal ="Small Modal";
		String actualHeardModal = modalDialog.testBasic.getText(modalDialog.txtHeardModal);
		//System.out.println(actualHeardModal);
		assertEquals(actualHeardModal, expectedHeardModal);

		//body Modal
		String expectedBodyModal ="This is a small modal. It has very less content";
		String actualBodyModal = modalDialog.testBasic.getText(modalDialog.txtModalBody);
		assertEquals(actualBodyModal, expectedBodyModal);
		//close button x
		Thread.sleep(50);
		modalDialog.testBasic.click(modalDialog.btnClose);
	}
	@Test
	public void doTC02() throws Exception {
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToEndPage();
		AlertFramwWindowPages alertFramWin = homePage.clickAlertsFrWin();
		alertFramWin.testBasic.scrollToEndPage();
		ModalDialogPage modalDialog = alertFramWin.clickModalDialog();
		modalDialog.testBasic.click(modalDialog.btnshowLargeModal);
		//hear modal
		String expectedHeard ="Large Modal";
		String actualHeard =modalDialog.testBasic.getText(modalDialog.txtLargeHeardModal);
		assertEquals(actualHeard, expectedHeard);
		//Body
		String actualBoday =modalDialog.testBasic.getText(modalDialog.txtLargeModalBody);
		assertTrue(actualBoday.contains("Lorem Ipsum is simply dummy text of the printing"));
		//close
		modalDialog.testBasic.click(modalDialog.btnCloseLarge);
	}
}
