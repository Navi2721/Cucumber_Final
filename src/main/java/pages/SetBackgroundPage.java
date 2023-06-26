package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class SetBackgroundPage  {

	public WebDriver driver;

	public SetBackgroundPage(WebDriver driver) {
		this.driver = driver;
		
	}

	/*@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]") // #extra >
																							// button:nth-child(13) sky
																							// white
	WebElement SET_SKYBLUE_BACKGROUND_ELEMENT;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]") // #extra >
																							// button:nth-child(12) sky
																							// blue
	WebElement SET_WHITE_BACKGROUND_ELEMENT;

	@FindBy(how = How.CSS, using = "body")
	WebElement WHITE_BACKGROUND_COLOR;

	@FindBy(how = How.XPATH, using = "/html/body")
	WebElement BLUE_BACKGROUND_COLOR;*/
	@FindBy (how = How. XPATH, using = "//button[normalize-space()='Set SkyBlue Background']")
	WebElement SkyBlueColor_ELEMEMT;
	@FindBy (how = How. XPATH, using = "//button[normalize-space()='Set White Background']")
	WebElement SkywhiteColor_ELEMENT;
	public void clickontheskyblueButton() {
	SkyBlueColor_ELEMEMT.click();
	}
	public void UserShouldBeAbeltoClickBackgroundBlue() {

		SkyBlueColor_ELEMEMT.click ();
		try {
			Thread.sleep(3000);} 
		catch (InterruptedException e) {
		e.printStackTrace();
	}
		}
	public void UserShouldBeAbeltoClickBackgroundWhite() {

		SkywhiteColor_ELEMENT.click();
		try {
		Thread. sleep (3000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}}
	public String getPageColor() {
		return driver.getTitle();
	}
}