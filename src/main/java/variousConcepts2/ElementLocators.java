package variousConcepts2;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementLocators {
	
	WebDriver driver;
	
	@Before
	public void init(){
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	//	driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void testLocators() {		
		driver.findElement(By.name("firstname")).sendKeys("Sunflower");
		driver.findElement(By.id("sex-0")).click();//By is a class, id is a method
		
		//upload file 
		//if the tag is anything else than INPUT then use a class called Robot
		//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\lolon\\OneDrive\\Documents\\TechFiosNew\\Selenium\\2022-09-17--Session 1.pptx");
	
		//link text, don't run link & partial link test on the same test case
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//partial link text 
		//driver.findElement(By.partialLinkText("OS-API")).click(); 
		
		//CSS TagName#Value, TagName[attribute = ‘value’], Tagname[attribute = 'value'][attribute = 'value']
		//TagName[href$=‘value’] 
		driver.findElement(By.cssSelector("input#exp-6")).click();
		driver.findElement(By.cssSelector("input[id = 'profession-1']")).click();
		driver.findElement(By.cssSelector("input[id = 'tool-2']")).click();
		driver.findElement(By.cssSelector("input[name = 'tool'][value = 'QTP']")).click();
		driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
	
	
	}
}
