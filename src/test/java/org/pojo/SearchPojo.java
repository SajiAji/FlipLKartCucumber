package org.pojo;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPojo extends BaseClass {
	
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='YBLJE4'])[3]")
	WebElement fashion;

	public WebElement getFashion() {
		return fashion;
	}

}
