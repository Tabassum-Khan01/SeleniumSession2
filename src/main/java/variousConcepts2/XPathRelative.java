package variousConcepts2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathRelative {
	
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
		//CSS TagName#Value, TagName[attribute = ‘value’], Tagname[attribute = 'value'][attribute = 'value']
				//TagName[href$=‘value’] 
				driver.findElement(By.cssSelector("input#exp-6")).click();
				driver.findElement(By.cssSelector("input[id = 'profession-1']")).click();
				driver.findElement(By.cssSelector("input[name = 'tool'][value = 'QTP']")).click();
				//select checkbox 'Selenium Webdriver'
				driver.findElement(By.cssSelector("input[id = 'tool-2']")).click();
				
				//Absolute xpath to type password 
				//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();
				//relative xpath to type password
				driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("password");
				
				//relative xpath to select 2 attributed
				driver.findElement(By.xpath("//input[@ id = 'exp-4' and @value ='5']")).click();
				
				//xpath for links
				driver.findElement(By.xpath("//strong[text() = 'Link Test : New Page']")).click(); 
				
				//another way for links
				//driver.findElement(By.xpath("//strong[contains(text(), 'Link Test : New Page')]")).click();
				
	}
}
