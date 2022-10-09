//go to cnn.com, identify 1st url on the left column that always changes 

package variousConcepts2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

WebDriver driver;
	
	@Before
	public void init(){
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	//	driver.manage().window().maximize();
		driver.get("https://cnn.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	
	@Test	
	public void testLocators() {	
		
		//xpath axes or dynamic web element 
		//ul[@class = '']/descendant::strong[1]
		driver.findElement(By.xpath("//article[@class = 'cd cd--card cd--article cd--idx-1 cd--large cd--vertical cd--has-siblings cd--has-media cd--media__image']/descendant::span[1]")).click();
		
		//Below is same as above
	//	driver.findElement(By.xpath("//article[@class = 'cd cd--card cd--article cd--idx-1 cd--large cd--vertical cd--has-siblings cd--has-media cd--media__image']/descendant::a[2]/child::*")).click();

		
	}
}
