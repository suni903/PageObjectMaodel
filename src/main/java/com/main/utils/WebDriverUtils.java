package com.main.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtils {

	WebDriver driver;

	public WebDriverUtils(WebDriver driver) {

		this.driver = driver;
	}

	public void click(By prop) {

		driver.findElement(prop).click();
	}

	public void enterTest(By prop, String testdata) {
		
		new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(prop));

		driver.findElement(prop).sendKeys(testdata);

		

	}

	public void selectValue(By prop, String value) {

		Select selectobj = new Select(driver.findElement(prop));

		selectobj.selectByValue(value);
	}
	
	public void findElement(By prop){
		
		driver.findElement(prop).isDisplayed();
	}

}
