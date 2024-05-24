package firstproj.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class herokuapp {
	static WebDriver driver;
	@Given("Launch the url")
	public void LaunchtheUrl() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhara\\Downloads\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://the-internet.herokuapp.com/login");

}
	@Then("Check presence of username field, password field, login button")
	public void CheckPresenceOfField() {
		
	}
	@And("Enter username")
	public void enterUsername() {
		WebElement usernameTxt = driver.findElement(By.id("username"));
		usernameTxt.sendKeys("tomsmith");
}
	@And("Enter password")
	public void password() {
		WebElement passwordTxt = driver.findElement(By.id("password"));
		passwordTxt.sendKeys("SuperSecretPassword!");
}
	@And ("Click on login button")
	public void clickLogin() {
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
		loginBtn.click();
}
	@Then("Verify the presence of ‘You logged into a secure area!’")
	public void verifyPresenceOfSecureArea() {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///*[@id=\"content\"]/div/h4")));
	}
}
