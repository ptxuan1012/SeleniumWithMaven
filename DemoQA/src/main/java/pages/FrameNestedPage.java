package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FrameNestedPage extends Page{
public FrameNestedPage(WebDriver dr) {
	super(dr);
	// TODO Auto-generated constructor stub
}
public By childFrame =By.tagName("p");
public By parenFrame =By.tagName("body");

}
