package com.main.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase implements Setup {

	protected WebDriver driver;

	public WebDriver intilizationBrowser() {
		
		System.setProperty(CHROME_KEY, CHROME_PATH);

		driver = new ChromeDriver();
		
		return driver;

	}

	public void enterUrl(String url) {

		driver.get(url);
	}

}
