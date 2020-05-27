package com.framework.supportio;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.framework.base.BasePage;

public class DriverWait extends BasePage{
	/**
	 * method wait for visibility of element implicitly
	 * @param element
	 * @param i
	 */
	
	public void waitForElement(By element, int i) {
		WebDriverWait wait = new WebDriverWait(driver,i);
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}

}
