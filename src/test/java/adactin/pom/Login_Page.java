package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(name = "username")
	private WebElement Username;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(name = "login")
	private WebElement loginbutton;

	public Login_Page(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(ldriver, this);
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
