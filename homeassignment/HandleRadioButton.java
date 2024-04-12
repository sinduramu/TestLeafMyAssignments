package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Chrome']/parent::td/div")).click();
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//label[text()='Chennai']/parent::div/div"));
		ele.click();
		Thread.sleep(1000);
		System.out.println("Radio button is selected or not "+ ele.isSelected());
		Thread.sleep(1000);
		ele.click();
		Thread.sleep(1000);
		System.out.println("Radio button is moved to unselected "+ ele.isSelected());
		
		String attribute = driver.findElement(By.xpath("(//label[text()='21-40 Years']/parent::div//div)[3]")).getAttribute("class");
		
		if(attribute.contains("active"))
		{
			System.out.println("Already the Age Group radio button is selected");
		}
		else
		{
			driver.findElement(By.xpath("//label[text()='21-40 Years']/parent::div/div")).click();
		}
		
		
		}
		

	}


