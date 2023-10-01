package StepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;




public class capstoneminiproject {
	 ChromeDriver driver = new ChromeDriver();
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",
	            "C:\\Users\\Donato\\Desktop\\assignmentworkspace\\MOHANA-Maven\\src\\main\\resources\\Drivers\\chromedriver.exe");   
	}

	@And("user is in main page")
	public void user_in_main_page() {
		driver.navigate().to("http://the-internet.herokuapp.com/");
	    
	}

	@When("^user clicks on  (.*)$")
	public void clicks_on(String button) throws InterruptedException {
	driver.findElement(By.linkText("A/B Testing")).click();
	}

	@Then("^navigate to AB homepage")
	public void navigate_to_AB_homepage() {
		System.out.println("Page navigated: " +driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']")).isDisplayed());
	}
    @Then("^navigate to main page")
    public void navigate_to_main_page() {
    driver.navigate().back();
    }
    @When("^user clicks on Dropdown button")
    public void clicks_on_button() throws InterruptedException {
     driver.findElement(By.linkText("Dropdown")).click();
    }
   @When("^user selects option1 from dropdown")
   public void user_selects_from_dropdown() {
   WebElement options = driver.findElement(By.id("dropdown"));
   Select s1 = new Select(options);
   System.out.println("Select value is: " + s1.selectByVisibleText("Option 1"));
   }
   @When("^user clicks on Frames button")
   public void clicks_on_Frames_button() throws InterruptedException {
   driver.findElement(By.linkText("Frames")).click();
   }
   @Then("^verify the page displays link")
   public void verify_the_page_displays_link() {
   List<WebElement> links= driver.findElements(By.tagName("a"));

   for (WebElement link : links) {
   System.out.println(link.getText());
   driver.close();
  }

   }
}
