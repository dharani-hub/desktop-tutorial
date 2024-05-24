package firstproj.step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class google {
 static WebDriver driver;
 @Given("Google is open in the browser")
 public void GoogleIsopen() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhara\\Downloads\\chromedriver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.google.co.uk/");
	 
 }
 @When("User searches for Lambda Test")
 public void UserSearchLambdaTest() {
	 WebElement lambdaTest = driver.findElement(By.id("user-name"));
	 lambdaTest.sendKeys("standard_user");
	 
 }
 @Given("Press enter key")
	public void PressEnterKey() {
	Actions act = new Actions(driver);
	driver.findElement(By.id("user-name")).sendKeys(Keys.chord(Keys.ENTER));

	}
}


