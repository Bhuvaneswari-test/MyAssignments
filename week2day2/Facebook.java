package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();

		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Bhuvana");
		driver.findElement(By.name("lastname")).sendKeys("Neelakandan");
		driver.findElement(By.name("reg_email__")).sendKeys("8976541098");
		driver.findElement(By.id("password_step_input")).sendKeys("hellofb");
		//dropdown
		WebElement element = driver.findElement(By.id("day"));
		Select Day=new Select(element);
		Day.selectByIndex(25);
		WebElement element2 = driver.findElement(By.id("month"));
		Select Month=new Select(element2);
	Month.selectByVisibleText("Aug");
	WebElement element3 = driver.findElement(By.id("year"));
	Select Year=new Select(element3);
	Year.selectByContainsVisibleText("2011");
	driver.findElement(By.id("sex")).click();
	
	
	
		
		

	}

}
