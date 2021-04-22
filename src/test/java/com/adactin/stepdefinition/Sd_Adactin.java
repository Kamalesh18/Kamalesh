package com.adactin.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.PageObjectManager;
import com.adactin.runner.Runner;
import com.framework.org.CucumberFramework.Base_Class;

import adactin.pom.Last_Page;
import adactin.pom.Login_Page;
import adactin.pom.Payment_Page;
import adactin.pom.Search_Page;
import adactin.pom.Selection_Page;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class Sd_Adactin extends Base_Class {

	public static WebDriver driver = Runner.driver;
	//Login_Page lp = new Login_Page(driver);
	PageObjectManager pom = new PageObjectManager(driver);

	@Given("^User launches application$")
	public void user_launches_application() throws Throwable {
		get("https://adactinhotelapp.com");
	}

	@When("^User enters username \"([^\"]*)\"$")
	public void user_enters_username(String arg1) throws Throwable {
		sendkeys(pom.getlp().getUsername(), arg1);

	}

	@When("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
      sendkeys(pom.getlp().getPassword(), arg1);
	}

	@Then("^User clicks login button$")
	public void user_clicks_login_button() throws Throwable {
     click(pom.getlp().getLoginbutton());
     Assert.assertEquals("abc", "ABC");
     
	}
   // Search_Page cp = new Search_Page(driver);
    
    @Given("^User enter location$")
    public void user_enter_location() throws Throwable {
    dropdown(pom.Searchpage().getLocation(), "value", "Sydney");      
    }

    @When("^User enters hotel name$")
    public void user_enters_hotel_name() throws Throwable {
    	dropdown(pom.Searchpage().getHotels(), "value", "Hotel Sunshine");
      
    }

    @When("^User enters room type$")
    public void user_enters_room_type() throws Throwable {
    	dropdown(pom.Searchpage().getRoomtype(), "value", "Super Deluxe");
       
    }

    @When("^User enters number of rooms$")
    public void user_enters_number_of_rooms() throws Throwable {
    	dropdown(pom.Searchpage().getNumbofrooms(), "value", "1");
       
    }

    @When("^User enters checkin date$")
    public void user_enters_checkin_date() throws Throwable {
    	clear(pom.Searchpage().getCheckin());
    	sendkeys(pom.Searchpage().getCheckin(), "18/08/2021");
    	
      
    }

    @When("^User enters checkout date$")
    public void user_enters_checkout_date() throws Throwable {
    	clear(pom.Searchpage().getCheckout());
    	sendkeys(pom.Searchpage().getCheckout(), "20/08/2021");
     
    }

    @When("^User enters adults per room$")
    public void user_enters_adults_per_room() throws Throwable {
    	dropdown(pom.Searchpage().getAdults(), "value", "2");
     
    }

    @When("^User enters children per room$")
    public void user_enters_children_per_room() throws Throwable {
    	dropdown(pom.Searchpage().getChildren(), "value", "0");
     
    }

    @Then("^User click search button$")
    public void user_click_search_button() throws Throwable {
    	click(pom.Searchpage().getSubmits());
     
    }
   // Selection_Page sp = new Selection_Page(driver);

    @Given("^User selects the hotel$")
    public void user_selects_the_hotel() throws Throwable {
    	click(pom.Selectionpage().getRadiobutton());
      
    }

    @When("^User clicks the submit button$")
    public void user_clicks_the_submit_button() throws Throwable {
    	click(pom.Selectionpage().getButton());
      
    }

    @Then("^something should be asserted$")
    public void something_should_be_asserted() throws Throwable {
       
    }
    
    //Payment_Page pp = new Payment_Page(driver);

    @Given("^User enters first name$")
    public void user_enters_first_name() throws Throwable {
    	sendkeys(pom.paymentpage().getFn(), "kamalesh");
    }

    @When("^User enters last name$")
    public void user_enters_last_name() throws Throwable {
    	sendkeys(pom.paymentpage().getLN(), "parthasarathy");
    }

    @When("^User enters address$")
    public void user_enters_address() throws Throwable {
    	sendkeys(pom.paymentpage().getADD(), "dubai road, dubai");
    }

    @When("^User enters credit card number$")
    public void user_enters_credit_card_number() throws Throwable {
    	sendkeys(pom.paymentpage().getCcnumb(), "1231231231231231");
    }

    @When("^User selects credit card type$")
    public void user_selects_credit_card_type() throws Throwable {
    	dropdown(pom.paymentpage().getType(), "value", "VISA");
    }

    @When("^User selects expiry date and year$")
    public void user_selects_expiry_date_and_year() throws Throwable {
    	dropdown(pom.paymentpage().getMonth(), "value", "8");
    	dropdown(pom.paymentpage().getYear(), "value", "2013");
    }

    @When("^User enters CVV number$")
    public void user_enters_CVV_number() throws Throwable {
    	sendkeys(pom.paymentpage().getCvv(), "909");
    }

    @Then("^User clicks submit button$")
    public void user_clicks_submit_button() throws Throwable {
    	click(pom.paymentpage().getBook());
    }

   // Last_Page op = new Last_Page(driver);
    
    @Given("^user verifies the details$")
    public void user_verifies_the_details() throws Throwable {
    }

    @When("^User clicks the logout button$")
    public void user_clicks_the_logout_button() throws Throwable {
    	click(pom.Lastpage().getLOUT());
    }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
