package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Page {
	 
	public Payment_Page(WebDriver pdriver) {
		this.driver = pdriver;
		PageFactory.initElements(pdriver,this);
	}

	public static WebDriver driver;
	
	@FindBy(id = "first_name")
    private WebElement fn;
	
	@FindBy(id = "last_name")
	private WebElement LN;
	
	@FindBy(id = "address")
	private WebElement ADD;
	
	@FindBy(id = "cc_num")
	private WebElement ccnumb;
	
	@FindBy(id = "cc_type")
	private WebElement type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement month;
	
	@FindBy(id = "cc_exp_year")
	private WebElement year;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;

	public WebElement getFn() {
		return fn;
	}

	public WebElement getLN() {
		return LN;
	}

	public WebElement getADD() {
		return ADD;
	}

	public WebElement getCcnumb() {
		return ccnumb;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
