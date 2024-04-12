package week2.homeassignment;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		
		driver.findElement(By.linkText("Create Account")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("accountName")).sendKeys("IOBOne");
		String accountName = driver.findElement(By.id("accountName")).getAttribute("value");
		System.out.println(accountName);
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select sc = new Select(industry);
		sc.selectByVisibleText("Computer Software");
		
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select sc1 = new Select(ownership);
		sc1.selectByVisibleText("S-Corporation");
		
		WebElement source = driver.findElement(By.name("dataSourceId"));
		Select sc2 = new Select(source);
		sc2.selectByValue("LEAD_EMPLOYEE");
		
		
		WebElement market = driver.findElement(By.name("marketingCampaignId"));
		Select sc3 = new Select(market);
		sc3.selectByIndex(6);
		
		
		WebElement country = driver.findElement(By.id("generalCountryGeoId"));
		Select sc4 = new Select(country);
		sc4.selectByValue("USA");
		
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sc5 = new Select(state);
		sc5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		String accountName1 = driver.findElement(By.xpath("//span[text()='Account Name']//following::span")).getText();
		System.out.println(accountName1);
		if(accountName.contains(accountName1))
		{
			System.out.println("Account Name is matched");
		}
		
		

	}

}
