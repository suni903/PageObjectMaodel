package com.automationpratice.pages;

import org.openqa.selenium.WebDriver;

import com.main.utils.WebDriverUtils;
import com.pageobjectmoodel.bojectepository.LoginPageProperties;

public class LoginPages extends WebDriverUtils implements LoginPageProperties {

	WebDriver driver;

	public LoginPages(WebDriver driver) {

		super(driver);

		this.driver = driver;
	}

	public LoginPages clickSingIn() {

		LoginPages loginpage = new LoginPages(driver);

		click(CLICKSIGNIN_LOCATOR);

		return loginpage;

	}

}
