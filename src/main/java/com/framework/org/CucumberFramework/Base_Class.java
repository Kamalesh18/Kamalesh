package com.framework.org.CucumberFramework;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	// Browser Launch-----------

	public static WebDriver browserlaunch(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Kamalesh\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver;
	}

	// Get-------------------

	public static void get(String url) {
		driver.get(url);
	}

	// getTitle---------------

	public static void get_title() {
		System.out.println(driver.getTitle());
	}

	// getCurrentURl----------

	public static void getCurrentURL() {
		System.out.println(driver.getCurrentUrl());
	}

	// sendkeys---------------

	public static void sendkeys(WebElement send, String name) {
		send.sendKeys(name);
	}

	// maximize window--------

	public static void maximize() {
		driver.manage().window().maximize();
	}

	// Close-----------------

	public static void close() {
		driver.close();
	}

	// Quit-------------------

	public static void quit() {
		driver.quit();
	}

	// Navigate To------------

	public static void navigateto(String url) {
		driver.navigate().to(url);
	}

	// Navigate Back----------

	public static void navigateback() {
		driver.navigate().back();
	}

	// Navigate Forward-------

	public static void navigateforward() {
		driver.navigate().forward();
	}

	// Navigate Refresh-------

	public static void navigaterefresh() {
		driver.navigate().refresh();
	}

	// click------------------
	public static void click(WebElement press) {
		press.click();
	}
	
	//clear-------------------
	public static void clear(WebElement erase) {
		erase.clear();
	}
	
	// screenshot-------------

	public static void screenshot(String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("user.dir"+"\\CucumberFramework\\Screenshot"+path+".png");
		FileUtils.copyFile(sourcefile, destFile);
	}

	// DropDown---------------

	public static void dropdown(WebElement element, String options, String value) {
		Select s = new Select(element);

		if (options.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (options.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}

	// Simple Alert&Control Alert----

	public static void control_alert(String refname) {
		if (refname.equalsIgnoreCase("ok")) {
			driver.switchTo().alert().accept();
		} else if (refname.equalsIgnoreCase("cancel")) {
			driver.switchTo().alert().dismiss();
		}
	}

	// Prompt Alert for accept------------

	public static void prompt_ok(String refname) {
		driver.switchTo().alert().sendKeys(refname);
		driver.switchTo().alert().accept();
	}

	// Prompt Alert for dismiss-----------

	public static void prompt_cancel(String refname) {
		driver.switchTo().alert().sendKeys(refname);
		driver.switchTo().alert().dismiss();
	}

	// Actions------------------------

	public static void actions(String options, WebElement target) {

		Actions s = new Actions(driver);

		if (options.equalsIgnoreCase("contextclick")) {
			s.contextClick(target).build().perform();
		} else if (options.equalsIgnoreCase("movetoelement")) {
			s.moveToElement(target).build().perform();
		}
//		else if (options.equalsIgnoreCase("draganddrop")) {
//			s.dragAndDrop(target, target).build().perform();
//		}
		else if (options.equalsIgnoreCase("doubleclick")) {
			s.doubleClick(target).build().perform();
		}

	}

	// DragandDrop---------------------

	public static void draganddrop(String options, WebElement Value1, WebElement Value2) {

		Actions s = new Actions(driver);
		if (options.equalsIgnoreCase("draganddrop")) {
			s.dragAndDrop(Value1, Value2).build().perform();
		}
	}

	// Frames-----------------------*need to create frame using int to pass index
	// value*

	public static void frame(String options, String value) {

		if (options.equalsIgnoreCase("frame")) {
			driver.switchTo().frame(value);
		}

		else if (options.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}

		else if (options.equalsIgnoreCase("defaultcontent")) {
			driver.switchTo().defaultContent();
		}

	}

	// Robot------------------------

	public static void robot(String options, int text) throws AWTException {

		Robot r = new Robot();

		if (options.equalsIgnoreCase("keypress")) {
			r.keyPress(text);
		} else if (options.equalsIgnoreCase("keyrelease")) {
			r.keyRelease(text);
		} else if (options.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);

		}

	}

}