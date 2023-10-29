package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SliderPage extends Page{
	public SliderPage(WebDriver dr) {
		super(dr);
	}	
	public By srollSlider =By.xpath("//*[@id=\"sliderContainer\"]/div[1]/span/div/div[2]");
	public By srollSlider1 =By.xpath("//div[@class='range-slider__tooltip__arrow']");
	public By rangeSlider = By.xpath("//input[@type='range']");
}
