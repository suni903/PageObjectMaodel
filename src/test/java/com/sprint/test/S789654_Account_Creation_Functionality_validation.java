package com.sprint.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationpratice.pages.CreateAccountPage;
import com.automationpratice.pages.LoginPages;
import com.automationpratice.pages.SignPage;
import com.main.utils.TestBase;

public class S789654_Account_Creation_Functionality_validation extends TestBase {

	LoginPages loginpage;

	SignPage signpage;

	CreateAccountPage createaccount;

	@BeforeMethod

	public void beforemethod() {

		WebDriver driver = intilizationBrowser();

		enterUrl(AUTOMATION_URL);

		loginpage = new LoginPages(driver);

		signpage = new SignPage(driver);

		createaccount = new CreateAccountPage(driver);

	}

	@Test

	public void createaccount() {

		loginpage.clickSingIn();

		signpage.enterEmailaddress();

		signpage.clickCrateaccountbutton();

		createaccount.enterFirstName();

		createaccount.enterLastName();

		createaccount.enterPassword();

		createaccount.selectDateOfBirthday();

		createaccount.enterAddress();

		createaccount.enterCity();

		createaccount.selectState();

		createaccount.enterZipCode();

		createaccount.enterMobileNumber();

		createaccount.enterAlias();

		createaccount.enterRegisterButton();

	}
}
