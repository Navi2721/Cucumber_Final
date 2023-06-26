package steps;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.BasePage;
import pages.SetBackgroundPage;

public class StepDefination extends BasePage {
	
	SetBackgroundPage bp;
	BasePage bpg;

	@Before
	public void TechfiosePage() {
		
		bpg.init();
		bp = PageFactory.initElements (driver,SetBackgroundPage.class);
		
	}
	@Given("{string} button exists")
	public void button_exists(String element) {
		if (element.equalsIgnoreCase("SetskyBlueBackground")) {
			bp.UserShouldBeAbeltoClickBackgroundBlue();
		} else if (element.equalsIgnoreCase("SetskyWhiteBackground")) {
			bp.UserShouldBeAbeltoClickBackgroundWhite();
		}
	}

	@When("I click on the button")
	public void i_click_on_the_button() {
		bp.UserShouldBeAbeltoClickBackgroundBlue();

		bp.UserShouldBeAbeltoClickBackgroundWhite();
	}

	@Then("the background color will change to sky blue")
	public void the_background_color_will_change_to_sky_blue() {

		String ExpectedColor = "sky blue";
		String ActualColor = bp.getPageColor();

		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Set SkyBlue Background']")).isDisplayed());
		Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Set SkyBlue Background']")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Set SkyBlue Background']")).isDisplayed());

	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {

		String expectedColor = "white";
		String actualColor = bp.getPageColor();
		Assert.assertTrue(driver.findElement(By.xpath("//* [@id=\"extra\"]/button [2]")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//button[normalize-space()='Set White Background']")).isDisplayed());
	}

	@After
	public void tearDown() {
		driver.close();
	}}

