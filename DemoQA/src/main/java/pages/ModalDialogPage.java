package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogPage extends Page{
	public ModalDialogPage(WebDriver dr) {
		super(dr);
	}
	public By btnshowSmallModal =By.id("showSmallModal");
	//cssSelector("modal-header") >> getText ra toan bo sccSelector co
	public By txtHeardModal = By.xpath("//div[text()='Small Modal']");
	public By txtModalBody = By.cssSelector(".modal-body");
	public By iconClose = By.xpath("//span[text()='Close']");
	public By btnClose = By.id("closeSmallModal");
	
	public By btnshowLargeModal =By.id("showLargeModal");
	public By txtLargeHeardModal = By.xpath("//div[text()='Large Modal']");
	public By txtLargeModalBody = By.cssSelector(".modal-body");
	public By btnCloseLarge = By.id("closeLargeModal");
	

	
}
