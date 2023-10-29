package tests;

import static org.testng.Assert.assertEquals;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.TestBasic;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import pages.FormResultPage;
import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormPage;
import test.model.FormData;

public class PracticeformTest extends TestCase {
	@Test(description = "TC01-Submit data successfully", dataProvider = "FormData")
	public void submitDataSuccessFully(String firstName, String lastName, String userEmail, String inputGender,
			String sdt, String inputDay, String inputMonth, String inputYear, String subjects, String inputCheckbox1,
			String inputCheckbox2, String address, String stage, String city) {
		// doc tu file excel
		HomePage homePage = new HomePage(testBasic.driver);
		homePage.testBasic.maxmize();
		homePage.testBasic.scrollToElement(homePage.findElementByLocator(homePage.menuForm));
		FormsPage formPage = homePage.clickForm();
		PracticeFormPage practiceFormPage = formPage.clickPracticeFormMenu();
		practiceFormPage.testBasic.inputText(practiceFormPage.tbFistName, firstName);
		practiceFormPage.testBasic.inputText(practiceFormPage.tbLastName, lastName);
		practiceFormPage.testBasic.inputText(practiceFormPage.tbUserEmail, userEmail);
		practiceFormPage.testBasic.scrollToEndPage();
		practiceFormPage.testBasic.clickRadioButtonByLabel(inputGender);
		practiceFormPage.testBasic.inputText(practiceFormPage.tbuserNumber, sdt);
		practiceFormPage.intBOD(inputYear, inputMonth, inputDay);
		practiceFormPage.testBasic.inputText(practiceFormPage.txbSubjects, subjects);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.txbSubjects);
		practiceFormPage.testBasic.clickCheckBoxMulti(inputCheckbox1);
		practiceFormPage.testBasic.clickCheckBoxMulti(inputCheckbox2);
		practiceFormPage.testBasic.inputText(practiceFormPage.txtMulti, address);
		practiceFormPage.testBasic.inputText(practiceFormPage.mnState, stage);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnState);
		practiceFormPage.testBasic.inputText(practiceFormPage.mnCity, city);
		practiceFormPage.testBasic.keysEnter(practiceFormPage.mnCity);
		FormResultPage formResult = practiceFormPage.clickSubmitButton();
		Assert.assertEquals(formResult.isDiplay(), "Thanks for submitting the form");
		String actualname = firstName + " " + lastName;
		String actualHobbies = "Sports, Reading";
		String actualPicture = "Xuan.jpg";
		String actualStateandCity = stage + " " + city;
		Assert.assertEquals(formResult.getValuebylabel1("Student Name"), actualname);
		Assert.assertEquals(formResult.getValuebylabel1("Student Email"), userEmail);
		Assert.assertEquals(formResult.getValuebylabel1("Gender"), "Male");
		Assert.assertEquals(formResult.getValuebylabel1("Mobile"), sdt);
		Assert.assertEquals(formResult.getValuebylabel1("Date of Birth"), "10 November,1992");
		Assert.assertEquals(formResult.getValuebylabel1("Subjects"), "History");
		Assert.assertEquals(formResult.getValuebylabel1("Hobbies"), actualHobbies);
		Assert.assertEquals(formResult.getValuebylabel1("Picture"), actualPicture);

		Assert.assertEquals(formResult.getValuebylabel1("Address"), address);

		Assert.assertEquals(formResult.getValuebylabel1("State and City"), actualStateandCity);

	}

	@DataProvider(name="FormData")
	public String[][] getFormData() {
		// cach2
		FormData formData = new FormData();
		formData.firstName = "Pham";
		formData.lastName = "Xuan";
		formData.userEmail = "xuan.pt@gmail.com";
		formData.inputGender = "Male";
		formData.sdt = "0987654321";
		formData.inputDay = "10";
		formData.inputMonth = "November";
		formData.inputYear = "1990";
		formData.subjects = "History";
		formData.inputCheckbox1 = "Sports";
		formData.inputCheckbox2 = "Reading";
		formData.address = "Ninh Binh";
		formData.stage = "NCR";
		formData.city = "Delhi";		
		String [][]listData = new String[1][14];
		listData[0][0] = formData.firstName;
		listData[0][1] = formData.lastName;
		listData[0][2] = formData.userEmail;
		listData[0][3] = formData.inputGender;
		listData[0][4] = formData.sdt;
		listData[0][5] = formData.inputDay;
		listData[0][6] = formData.inputMonth;
		listData[0][7] = formData.inputYear;
		listData[0][8] = formData.subjects;
		listData[0][9] = formData.inputCheckbox1;
		listData[0][10] = formData.inputCheckbox2;
		listData[0][11] = formData.address;
		listData[0][12] = formData.stage;
		listData[0][13] = formData.city;
		return listData;
	}
}
