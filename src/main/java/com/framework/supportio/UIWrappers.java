package com.framework.supportio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.framework.base.BasePage;

public class UIWrappers  {
	
	
	/**
	 * method to enter input text
	 * @param element
	 * @param textToEnter
	 * @throws InterruptedException 
	 */
	public static void inputText(WebElement element,String textToEnter) throws InterruptedException {
		waitForElement(element,3);
		element.sendKeys(textToEnter);	
	}
	/**
	 * method to enter input text
	 * @param element
	 * @param textToEnter
	 */
	public static void inputText(By element,String textToEnter) {
		BasePage.driver.findElement(element).sendKeys(textToEnter);
	}
	/**
	 * method to clickOnElement
	 * @param element
	 * @throws Exception 
	 */
	public static void clickOnElement(WebElement element) throws Exception {
		element.click();
	}
	public static void clickOnElement(By element) {
		BasePage.driver.findElement(element).click();
	}
	/**
	 * method to select value from dropdown
	 * @param element
	 * @param text
	 */
	
	public static void selectDropDownValue(WebElement element,String text) {
		Select value = new Select(element);
		value.selectByValue(text);
	}
	/**
	 * method to wait for element to be displayed
	 * @throws InterruptedException 
	 */
	public static void waitForElement(WebElement element,int i) throws InterruptedException {
		customSleep(2);
		element.isDisplayed();
	}
	public static void customSleep(int i) throws InterruptedException {
		Thread.sleep(i*1000);
	}

}
