package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import page.loginpage;

public class logintest {
	public WebDriver driver;
	@BeforeClass
	public void initialbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\vikas\\OneDrive\\Desktop\\New folder\\SE\\chromedriver.exe");
	 driver= (WebDriver) new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	@Test
	public void login() throws InterruptedException {
		 loginpage lp=new loginpage(driver);
		 lp.login();
	}
	@AfterClass
	public void teardown() throws InterruptedException {
		driver.close();
		Thread.sleep(1000);
	}
}
