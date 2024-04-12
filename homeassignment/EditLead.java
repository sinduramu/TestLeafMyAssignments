package week2.homeassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Moshika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kalidas");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Automation QA Engineer");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
		
		WebElement country = driver.findElement(By.name("generalCountryGeoId"));
		Select sc = new Select(country);
		sc.selectByVisibleText("India");
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sc1 = new Select(state);
		sc1.selectByVisibleText("TAMILNADU");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543211");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("Automation QA Lead");
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Doing Automation Testing in the Lead Page");
		
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title = driver.getTitle();
		System.out.println("Current Title of the Page is " + title);
		
		
		driver.close();
		

	}

}
