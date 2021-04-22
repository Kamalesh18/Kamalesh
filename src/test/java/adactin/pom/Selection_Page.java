package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection_Page {
	
	public Selection_Page(WebDriver hdriver) {
		this.driver = hdriver;
		PageFactory.initElements(hdriver,this);
	}

	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
    private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement button;

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getButton() {
		return button;
	}
	
	
	
	
	
	
	
	
	
	
}
