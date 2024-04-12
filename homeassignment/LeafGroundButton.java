package week2.homeassignment;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
		assertEquals("Dashboard", title);
		
		driver.navigate().back();
		
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
		
		assertFalse(enabled);
		
		WebElement buttonPosition = driver.findElement(By.xpath("//span[text()='Submit']/parent::button"));
		
		Point location = buttonPosition.getLocation();
		int x = location.getX();
		int y = location.getY();
		
		System.out.println("Position X : "+x + " and Y : "+y);
		
		WebElement buttonColor = driver.findElement(By.xpath("//span[text()='Save']/parent::button"));
		String cssValue = buttonColor.getCssValue("background-color");
		System.out.println(cssValue);
		
		
		
		WebElement buttonSize = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]"));
		Dimension size = buttonSize.getSize();
				
		int height = size.getHeight();
		int width = size.getWidth();
		
		System.out.println("Button height "+ height + "  and width is "+width);
		
		driver.close();
		

	}

}
