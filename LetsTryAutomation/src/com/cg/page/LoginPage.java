package com.cg.page;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement home;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	List<WebElement> sliders;
	@FindBy(tagName="img")
	List<WebElement> arrivals;
	@FindBy(xpath="//a[contains(text(),'Description')]")
	WebElement description;
	@FindBy(xpath="//a[contains(text(),'Reviews (0)')]")
	WebElement review;
	
	public LoginPage()
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void clickShop()
	{
		shop.click();
	}
	
	public void clickHome()
	{
		home.click();
	}
	
	public String checkSliderCount()
	{
		sliders.size();
		for(WebElement s:sliders)
		{
			
		}
		return "s";
	}
	public void checkArrivalCount()
	{
			System.out.println(arrivals.size());
		
	}
	
	public void openTab()
	{
		for(WebElement arr:arrivals)
		{
			arr.click();
			arr.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
		}
		ArrayList<String> array = new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<array.size();i++)
		{
			driver.switchTo().window(array.get(i));
			System.out.println(driver.getTitle());
		}
	}
	
	public void viewDescription()
	{
		description.click();
		description.submit();
	}
	
	public void viewReviews()
	{
		review.click();
		System.out.println(review.getText());
	}
}
