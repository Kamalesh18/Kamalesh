package adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	

	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement Location;
	
	@FindBy(id = "hotels")
    private WebElement hotels;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement numbofrooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkin;
	
	@FindBy(id = "datepick_out")
	private WebElement checkout;
	
	@FindBy(id = "adult_room")
	private WebElement adults;
	
	@FindBy(id = "child_room")
	private WebElement children;
	
	@FindBy(id = "Submit")
	private WebElement submits;
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getNumbofrooms() {
		return numbofrooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSubmits() {
		return submits;
	}

	public Search_Page(WebDriver sdriver) {
		this.driver = sdriver;
		PageFactory.initElements(sdriver,this );
		
	}
	
}
