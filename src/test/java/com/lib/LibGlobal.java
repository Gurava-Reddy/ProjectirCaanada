package com.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {

	public static WebDriver driver;

	public static WebDriver getDriver() {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Gurava Reddy\\Selenium\\EclipsePractice\\FacebookwithCucumberandPOM\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;

	}

	public static String getUrl() {
		return driver.getCurrentUrl();

	}

	public static String getAttributeValue(WebElement element) {
		return element.getAttribute("value");

	}

	public static void loadUrl(String Url) {
		driver.get(Url);

	}

	public static void type(WebElement element, String name) {

		element.sendKeys(name);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void selectDD(WebElement element, String string) {

		Select DOBDD = new Select(element);

		DOBDD.selectByVisibleText(string);

	}

	public static void selectRB(WebElement element) {

		element.click();

	}

	public static void quitBrowser() {
		driver.quit();

	}

}
