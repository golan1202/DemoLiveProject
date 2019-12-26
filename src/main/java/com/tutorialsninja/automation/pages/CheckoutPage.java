package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;

public class CheckoutPage {
	
	public CheckoutPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	@FindBy(id="button-payment-address")
	public static WebElement continueButtonBillingDetailsSection;
	
	@FindBy(id="button-shipping-address")
	public static WebElement continueButtonDeliveryDetailsSection;
	
	@FindBy(id="button-shipping-method")
	public static WebElement continueButtonDeliveryMethodSection;
	
	@FindBy(name="agree")
	public static WebElement termsAndConditionsCheckbox;
	
	@FindBy(id="button-payment-method")
	public static WebElement continueButtonPaymentMethodSection;

	@FindBy(id="button-confirm")
	public static WebElement confirmOrderButton;
	
	public static void placeAnOrder() {
		
		Elements.click(continueButtonBillingDetailsSection);
	    Elements.click(continueButtonDeliveryDetailsSection);
	    Elements.click(continueButtonDeliveryMethodSection);
	    Elements.click(termsAndConditionsCheckbox);
	    Elements.click(continueButtonPaymentMethodSection);
	    Elements.click(confirmOrderButton);
	}
}
