package firstproj.step;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class helloworld {
	static WebDriver driver;
	@Given("Launch the browser")
	public void Launchthebrowser() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhara\\Downloads\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
	@Given("Load the url")
	public void Loadtheurl() {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
}
	@Given ("Click on StartButton")
	public void clickStart() {
		WebElement startBtn = driver.findElement(By.xpath("//button[text()='Start']"));
		startBtn.click();

	}
	@Then("Verify if loading appears and check if Hello world is visible after loading")
	public void VerifyLoading() {
	
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text(),'Hello World']")));
		
	}
}


