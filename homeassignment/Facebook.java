package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sindu");
		driver.findElement(By.name("lastname")).sendKeys("Ramachandran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sinduramu@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Moshika@2016");
		
		WebElement day = driver.findElement(By.id("day"));
		Select sc = new Select(day);
		sc.selectByVisibleText("10");
		
		WebElement month = driver.findElement(By.id("month"));
		Select sc1 = new Select(month);
		sc1.selectByIndex(6);
		
		WebElement year = driver.findElement(By.id("year"));
		Select sc2 = new Select(year);
		sc2.selectByValue("1987");
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@value='1']")).click();
		
	}

}
