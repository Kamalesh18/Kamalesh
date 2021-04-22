package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import adactin.pom.Last_Page;
import adactin.pom.Login_Page;
import adactin.pom.Payment_Page;
import adactin.pom.Search_Page;
import adactin.pom.Selection_Page;

public class PageObjectManager {
	
	public static WebDriver driver;
	private Login_Page lp;
	private Search_Page sp;
	private Selection_Page ssp;
	private Payment_Page ppp;
	private Last_Page llp;
	 public PageObjectManager(WebDriver driverp) {
		 this.driver = driverp;
		 PageFactory.initElements(driverp,this);
	}
	public Login_Page getlp() {
		 
		 Login_Page lp = new Login_Page(driver);
         return lp;
	}
	 
     public Search_Page Searchpage() {
    	 Search_Page sp = new Search_Page(driver);
    	 return sp;

	}
      public Selection_Page Selectionpage() {
    	  Selection_Page ssp = new Selection_Page(driver);
    	  return ssp;

	}
      public Payment_Page paymentpage() {
    	  Payment_Page ppp = new Payment_Page(driver);
    	  return ppp;

	}
      public Last_Page Lastpage() {
        Last_Page llp = new Last_Page(driver);
        return llp;
	}
      
}
