package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import common.TestBasic;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pages.FormResultPage;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;

@Test
public class PracticeformTest extends TestCase {
	public void doTC1() throws Exception {
		// doc tu file excel
		String firstName = "Xuan";
		String lastName = "Pham";
		String userEmail = "xuan.pt@gmail.com";
		String subjects = "History";
		String address = "Gia hoa Gia vien";
		String sdt = "0987654321";
		String stage = "NCR";
		String city = "Delhi";
		String inputYear ="1992";
		String inputMonth ="November";
		String inputDay ="10";
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToElement(homePage.findElementByLocator(homePage.menuForm));
		FormsPage formPage = homePage.clickForm();
		Thread.sleep(2000);
		PracticeFormPage practiceFormPage = formPage.clickPracticeFormMenu();
		Thread.sleep(2000);

		practiceFormPage.testBasic.inputText(practiceFormPage.tbFistName, firstName);
		practiceFormPage.testBasic.inputText(practiceFormPage.tbLastName, lastName);
		practiceFormPage.testBasic.inputText(practiceFormPage.tbUserEmail, userEmail);
		practiceFormPage.testBasic.scrollToEndPage();
		practiceFormPage.testBasic.clickRadioButtonByLabel("Male");
		practiceFormPage.testBasic.inputText(practiceFormPage.tbuserNumber, sdt);
		
		practiceFormPage.intBOD(inputYear, inputMonth, inputDay);

		practiceFormPage.testBasic.inputText(practiceFormPage.txbSubjects, subjects);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.txbSubjects);

		practiceFormPage.testBasic.clickCheckBoxMulti("Sports");
		practiceFormPage.testBasic.clickCheckBoxMulti("Reading");
		practiceFormPage.testBasic.upLoadFile(practiceFormPage.uploadFilexpath);
//		JavascriptExecutor js = (JavascriptExecutor) testBasic.driver;
//		js.executeScript("document.body.style.zoom = '50%';");

		practiceFormPage.testBasic.inputText(practiceFormPage.txtMulti, address);
		practiceFormPage.testBasic.inputText(practiceFormPage.mnState, stage);
		;
		// practiceFormPage.testBasic.inputDrow("NCR");
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnState);
		practiceFormPage.testBasic.inputText(practiceFormPage.mnCity, city);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnCity);
		FormResultPage formResult = practiceFormPage.clickSubmitButton();

		Assert.assertEquals(formResult.isDiplay(), "Thanks for submitting the form");
		
		String actualname = firstName + " " + lastName;
		String actualHobbies ="Sports, Reading";
		String actualPicture ="Xuan.jpg";
		String actualStateandCity =stage +" "+ city;
		//Assert.assertEquals(formResult.getValueByLabel("Student Name"), actualname);
		Assert.assertEquals(formResult.getValuebylabel1("Student Name"), actualname);
		Assert.assertEquals(formResult.getValuebylabel1("Student Email"), userEmail);
		Assert.assertEquals(formResult.getValuebylabel1("Gender"), "Male");
		Assert.assertEquals(formResult.getValuebylabel1("Mobile"), sdt);
		Assert.assertEquals(formResult.getValuebylabel1("Date of Birth"), "10 November,1992");
		Assert.assertEquals(formResult.getValuebylabel1("Subjects"), "History");
		Assert.assertEquals(formResult.getValuebylabel1("Hobbies"), actualHobbies);
		Assert.assertEquals(formResult.getValuebylabel1("Picture"), actualPicture);
		Thread.sleep(4000);
		Assert.assertEquals(formResult.getValuebylabel1("Address"), address);
		Thread.sleep(4000);
		Assert.assertEquals(formResult.getValuebylabel1("State and City"), actualStateandCity);
		Thread.sleep(4000);
		
	}
}
