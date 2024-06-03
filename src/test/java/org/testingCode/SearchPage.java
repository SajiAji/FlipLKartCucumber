package org.testingCode;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.pojo.HomePagePojo;
import org.pojo.SearchPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchPage extends BaseClass {
	
	HomePagePojo find;
	
	@Given("open chrome browser")
	public void open_chrome_browser() {
		chromeBrowser();
	   
	}

	@When("launch flipkart url")
	public void launch_flipkart_url() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("pass and enter value in search text box")
	public void pass_and_enter_value_in_search_text_box() throws AWTException {
	find = new HomePagePojo();
	
	WebElement srch = find.getSearch();
	passValue(srch, "samsung m31");
	robotPressKey(KeyEvent.VK_ENTER);
	robotPressKey(KeyEvent.VK_ENTER);
	
	}

	@When("select the particular search")
	public void select_the_particular_search() {
		WebElement product1 = find.getProduct();
		clickItem(product1);
		
	}

	@When("to click the add to cart button")
	public void to_click_the_add_to_cart_button() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String nexttab : child) {
			if (!nexttab.equals(parent)) {
				driver.switchTo().window(nexttab);
					
			}
		}
		WebElement element = driver.findElement(By.xpath("//div[text()='You might be interested in']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		
	   
	}

	@Then("close the browser")
	public void close_the_browser() {
	   
	}
	
	
	@When("tuch the Fashion field")
	public void tuch_the_Fashion_field() {
		SearchPojo sp = new SearchPojo();
		Actions action = new Actions(driver);
//		WebElement fash = driver.findElement(By.xpath("(//div[@class='YBLJE4'])[3]"));
		WebElement fas = sp.getFashion();
		action.moveToElement(fas).perform();
	   
	}

	@When("again tuch the Men footwear field")
	public void again_tuch_the_Men_footwear_field() {
	   
	}

	@When("to click men's casual shoes")
	public void to_click_men_s_casual_shoes() {
	   
	}

}
