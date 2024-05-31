package firstproj.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class demoguru {
	static WebDriver driver;
	@Given("Launch the Url")
	public void launchTheUrl() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhara\\Downloads\\chromedriver\\chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.get("https://demo.guru99.com/test/newtours/");
}
	@Then("Verify Home, Flights,Hotels,CarRentals,Cruises,destinations,Vacations Link is present")
	public void verifyLinkIsPresent() {
		String homelinkName = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a")).getText();
		String flightlink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")).getText();
		String hotelLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[3]/td[2]/a")).getText();
		String carRentalslink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a")).getText();
		String cruisesLink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[5]/td[2]/a")).getText();
		String destinationlink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[6]/td[2]/a")).getText();
		String Vacationslink = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[7]/td[2]/a")).getText();
		if((homelinkName.equals("Home"))&&(flightlink.equals("flight"))&&(hotelLink.equals("hotel"))&&(carRentalslink.equals("carRentals"))&&(cruisesLink.equals("cruises"))&&(destinationlink.equals("destination"))&&(Vacationslink.equals("vacation"))) {
			System.out.println("Link is Present");
		}
			else {
				System.out.println("Link is not Present");
			}
				
		}
	}

