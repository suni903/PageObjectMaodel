package com.automationpratice.pages;

import org.openqa.selenium.WebDriver;

import com.datarepository.CreationBean;
import com.main.utils.WebDriverUtils;
import com.pageobjectmoodel.bojectepository.CreateAccountPageProperties;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProperties {

	WebDriver driver;

	CreationBean bean;

	public CreateAccountPage(WebDriver driver) {

		super(driver);

		this.driver = driver;
	}

	public void enterFirstName() {

		bean = new CreationBean();

		bean.setEnterFirstName("selenium");

		enterTest(FIRST_NAME_LOCATOR, bean.getEnterFirstName());
	}

	public void enterLastName() {

		bean.setEnterLastName("selenium");

		enterTest(LAST_NAME_LOCATOR, bean.getEnterLastName());
	}

	public void enterPassword() {

		bean.setEnterPassword("test123");

		enterTest(PASSWORD_LOCATOR, bean.getEnterPassword());
	}

	public void selectDateOfBirthday() {

		selectValue(SELECT_VALUE_DAYS_LOCATOR, "5");

		selectValue(SELECT_VALUE_MONTHS_LOCATOR, "5");

		selectValue(SELECT_VALUE_YEARS_LOCATOR, "1962");
	}

	public void enterCompany() {

		bean.setEnterCompany("hyd");

		enterTest(ENTER_COMPANY_LOCATOR, bean.getEnterCompany());
	}

	public void enterAddress() {

		bean.setEnterAddress("hyd");

		enterTest(ENTER_ADDRESS_LOCATOR, bean.getEnterAddress());
	}

	public void enterCity() {

		bean.setEnterCity("hyd");

		enterTest(ENTER_CITY_LOCATOR, bean.getEnterCity());
	}

	public void selectState() {

		// bean = new CreationBean();

		bean.setSelectState("5");

		selectValue(SELECT_STATE_LOCATOR, bean.getSelectState());
	}

	public void enterZipCode() {

		// bean = new CreationBean();

		bean.setEnterZipCode("00000");

		enterTest(ENTER_ZIPCODE_LOCATOR, bean.getEnterZipCode());
	}

	public void enterMobileNumber() {

		// bean = new CreationBean();

		bean.setEnterMobileNumber("123456789");

		enterTest(ENTER_MOBILENUMBER_LOCATOR, bean.getEnterMobileNumber());

	}

	public void enterAlias() {

		// bean = new CreationBean();

		bean.setEnterAlias("hyd");

		enterTest(ENTER_ALIAS_LOCATOR, bean.getEnterAlias());
	}

	public void enterRegisterButton() {

		click(CLICK_REGISTER_BUTTON_LOCATOR);

	}

}
