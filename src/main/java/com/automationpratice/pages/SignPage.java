package com.automationpratice.pages;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import com.main.utils.WebDriverUtils;
import com.pageobjectmoodel.bojectepository.SignPageProperties;

public class SignPage extends WebDriverUtils implements SignPageProperties {

	WebDriver driver;

	public SignPage(WebDriver driver) {

		super(driver);

		this.driver = driver;
	}

	public void enterEmailaddress() {

		enterTest(ENTEREMAILADDRESS_LOCATOR, RandomStringUtils.randomAlphabetic(10)+"@mailinator.com");
	}

	public void clickCrateaccountbutton() {

		click(CLICKCREATEBUTTON_LOCATOR);
	}

}
