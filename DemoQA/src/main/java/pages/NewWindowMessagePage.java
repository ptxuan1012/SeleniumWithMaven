package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class NewWindowMessagePage extends Page{
	public NewWindowMessagePage(WebDriver dr) {
		super(dr);
		// TODO Auto-generated constructor stub
	}
public By textMessWinDow =By.xpath("//body[contains(text(),'Knowledge increases by sharing')]");
}
