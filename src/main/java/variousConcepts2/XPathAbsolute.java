package variousConcepts2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAbsolute { 
	
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
				
				//Absolute xpath 
				//type in a password
				driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("password");
				//click on a link
				driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a/strong")).click();
				//another way to locate same element, the element 'link test' is under <a> tag.
				//driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[1]/a")).click();
				
	}
}
