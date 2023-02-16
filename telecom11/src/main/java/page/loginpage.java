package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage{
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement passward;
	
	@FindBy(name="login")
	private WebElement button;
	
	public loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void login() throws InterruptedException {
		username.sendKeys("9921782046");
		passward.sendKeys("98765432");
		button.click();
		Thread.sleep(2000);
	}
}
