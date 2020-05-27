package com.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

public class BasePage {
	public static WebDriver driver =null;

	@BeforeClass
	public void voidLaunch() {
		System.setProperty("webdriver.chrome.driver", "/Users/treddi/Desktop/chromedriver");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.get("https://www.allmovie.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
}
