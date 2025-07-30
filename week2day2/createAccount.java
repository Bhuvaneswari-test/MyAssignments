package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class createAccount {

	public static void main(String[] args) {
		// chrome options 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//load url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Maximize the browser
				driver.manage().window().maximize();
				//enter username 
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				//enter password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//click login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//click on CRM
				driver.findElement(By.partialLinkText("CRM")).click();
				//click on "Accounts"
				driver.findElement(By.linkText("Accounts")).click();
				//create Account
				driver.findElement(By.linkText("Create Account")).click();
				//enter account name
				driver.findElement(By.id("accountName")).sendKeys("BhuvanaC");
				//enter description
				driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
				//select dropdown and select as computer industry
				WebElement element = driver.findElement(By.name("industryEnumId"));
//create object
				Select dropdown=new Select(element);
				dropdown.selectByContainsVisibleText("Computer Software");
				//select dropdown as "s-corporation by visibletext"
				WebElement element2 = driver.findElement(By.name("ownershipEnumId"));
				//select - create an object
				Select ownership=new Select(element2);
				//use method
				ownership.selectByContainsVisibleText("S-Corporation");
				//select dropdown and click employee as source-by value
				WebElement element3 = driver.findElement(By.id("dataSourceId"));
				//create object
				Select source=new Select(element3);
				//use method
				source.selectByValue("LEAD_EMPLOYEE");
				//select ecommerce in marketing campaign
				WebElement element4 = driver.findElement(By.id("marketingCampaignId"));
				//create object
				Select marketing=new Select(element4);
				//use method
				marketing.selectByIndex(6);
				//select drop down menu and click texas
				WebElement element5 = driver.findElement(By.id("generalStateProvinceGeoId"));
				//create object
				Select state=new Select(element5);
				//use method
				state.selectByValue("TX");
				driver.findElement(By.className("smallSubmit")).click();
				
				
				
	}

}
