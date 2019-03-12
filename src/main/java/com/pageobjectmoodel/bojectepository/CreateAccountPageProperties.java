package com.pageobjectmoodel.bojectepository;

import org.openqa.selenium.By;

public interface CreateAccountPageProperties {

	By FIRST_NAME_LOCATOR = By.id("customer_firstname");

	By LAST_NAME_LOCATOR = By.id("customer_lastname");

	By PASSWORD_LOCATOR = By.id("passwd");

	By SELECT_VALUE_DAYS_LOCATOR = By.id("days");

	By SELECT_VALUE_MONTHS_LOCATOR = By.id("months");

	By SELECT_VALUE_YEARS_LOCATOR = By.id("years");

	By ENTER_COMPANY_LOCATOR = By.id("company");

	By ENTER_ADDRESS_LOCATOR = By.id("address1");
	
	By ENTER_CITY_LOCATOR = By.id("city");
	
	By SELECT_STATE_LOCATOR = By.id("id_state");
	
	By ENTER_ZIPCODE_LOCATOR = By.id("postcode");
	
	By ENTER_MOBILENUMBER_LOCATOR = By.id("phone_mobile");
	
	By ENTER_ALIAS_LOCATOR = By.id("alias");
	
	By CLICK_REGISTER_BUTTON_LOCATOR = By.id("submitAccount");
	
	

}
