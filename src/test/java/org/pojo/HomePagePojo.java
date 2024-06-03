package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePojo extends BaseClass {
	
	public HomePagePojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@class='Pke_EE']")
	private WebElement search;

	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//div[text()='SAMSUNG Galaxy M31s (Mirage Blue, 128 GB)']")
	private WebElement product;

	public WebElement getProduct() {
		return product;
	}
	@FindBy(xpath="//button[text()='Add to cart']")
	private WebElement addCart;

	public WebElement getAddCart() {
		return addCart;
	}
	
	@FindBy(xpath="(//a[@title='Login'])[1]")
	private WebElement log;

	public WebElement getLog() {
		return log;
	}
	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement reqOtp;

	public WebElement getReqOtp() {
		return reqOtp;
	}
	

}
