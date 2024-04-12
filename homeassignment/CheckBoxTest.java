package week2.homeassignment;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();

		
		driver.findElement(By.xpath("//span[text()='Ajax']/parent::div")).click();
		
		String notificationText = driver.findElement(By.xpath("//div[contains(@class,'ui-growl-message')]/span")).getText();
		System.out.println(notificationText);
		
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String toggleText = driver.findElement(By.xpath("//div[contains(@class,'ui-growl-message')]/span")).getText();
		System.out.println(toggleText);
		
		
		WebElement check = driver.findElement(By.xpath("//span[text()='Disabled']/ancestor::div[contains(@class,'formgrid')]//input"));
		
		boolean enabled = check.isEnabled();
		System.out.println(enabled);
		if(!enabled)
		{
			System.out.println("Checkbox is disabled as expected");
		}
		
		driver.findElement(By.xpath("(//div[contains(@class,'selectcheckboxmenu')])[2]")).click();
		Thread.sleep(1000);
		
		WebElement option1 = driver.findElement(By.xpath("(//li[@data-item-value='Paris']//div)[3]"));
		option1.click();
		String option1Check = option1.getAttribute("class");
		WebElement option2 = driver.findElement(By.xpath("(//li[@data-item-value='London']//div)[3]"));
		option2.click();
		String option2Check = option1.getAttribute("class");
		WebElement option3 = driver.findElement(By.xpath("(//li[@data-item-value='Berlin']//div)[3]"));
		option3.click();
		String option3Check = option1.getAttribute("class");
		if((option1Check.contains("state-active"))&&(option2Check.contains("state-active"))&&(option3Check.contains("state-active")))
				{
			System.out.println("All the selected Check boxes are checked successfully");
				}
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(@class,'circle-close')]")).click();
		Thread.sleep(1000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.close();
		
		
		

	}

}
