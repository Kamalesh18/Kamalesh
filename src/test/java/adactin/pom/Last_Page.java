package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Last_Page {
	
	public Last_Page(WebDriver kdriver) {
		this.driver = kdriver;
		PageFactory.initElements(kdriver,this);
	}

	public static WebDriver driver;
	
	@FindBy(xpath =  "/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")
	private WebElement LOUT;

	public WebElement getLOUT() {
		return LOUT;
	}
	
	
	

}
