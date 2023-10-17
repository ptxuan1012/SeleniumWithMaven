package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramePage extends Page {
	public FramePage(WebDriver dr) {
		super(dr);
	}

	public By txtIframe=By.id("sampleHeading");
}
