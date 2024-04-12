package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.name("phoneCountryCode")).clear();
		
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneNumber")).sendKeys("9876543211");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//String text = driver.findElement(By.xpath("")).getText();
//		System.out.println(text);
		
		
		//driver.close();
		

	}

}
