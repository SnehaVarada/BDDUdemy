package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By getbtn = By.xpath("//button[@class='btn']");
	private By sign = By.partialLinkText("Sign in");
	private By usrnme = By.xpath("//input[@name='username']");
	private By lstnme = By.xpath("//input[@name='password']");
	private By lgn = By.xpath("//input[@type='submit']");
    
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		}
	
	public String getLoginpage() {
		return driver.getTitle();
	}
	
	public void button() {
		driver.findElement(getbtn).click();
		}
	
	public void signin() {
		driver.findElement(sign).click();
		}
	
	public void username() {
		driver.findElement(usrnme).sendKeys("numpysdet84");
	}
	
	public void lastname() {
		driver.findElement(lstnme).sendKeys("sdet84batch");
	}
    
	public void login() {
    	driver.findElement(lgn).click();
    }
}
