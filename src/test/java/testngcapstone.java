import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testngcapstone {
	ChromeDriver driver = new ChromeDriver();
  @Test
  public void Application() { 
	  driver.manage().window().maximize();
	  
	  driver.get("http://the-internet.herokuapp.com/");
      System.out.println("title Page navigated: " + driver.getTitle());
  }
    @Test(priority=0)
  public void pagelogo() {
      
      WebElement link1 = driver.findElement(By.linkText("A/B Testing"));
      link1.click();
      System.out.println("Page navigated: " +driver.findElement(By.xpath("//h3[text()='A/B Test Variation 1']")).isDisplayed());
  }
 
}
