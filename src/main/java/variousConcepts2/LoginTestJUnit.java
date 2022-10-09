package variousConcepts2;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestJUnit {

	WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class JUnit.");
	}

	@AfterClass
	public static void AfterClass() {
		System.out.println("After Class JUnit.");
	}

	@Before
	public void init() {
		System.out.println("init method");

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=login/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() {
		System.out.println("Login test.");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}

	@Test
	public void negLoginTest() {
		System.out.println("Negative login test.");
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("ulala");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
