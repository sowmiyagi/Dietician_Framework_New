package com.dietician.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage{
	WebDriver driver;
	//PageFactory implementation//object repository
	
	@FindBy(id="username")WebElement username1;
	@FindBy(id="password")WebElement password1;
	@FindBy(id="signin")WebElement signin;
	@FindBy(linkText ="Forgot") WebElement Forgot;
	@FindBy(linkText ="Not a member") WebElement Not;
	@FindBy(id="email")WebElement email;
	@FindBy(id="password")WebElement password2;
	@FindBy(id="login")WebElement login;
	@FindBy(id="facebook")WebElement facebook;
	@FindBy(id="Google")WebElement google;
	@FindBy(linkText ="Sign up") WebElement Sign;
	@FindBy(id="useraccount")WebElement account;
	@FindBy(xpath = "//input[@class='signin']")WebElement selectsignin; 
	
	public LoginPage(WebDriver driver)//Constructor initializing the page objects
	{
		//this.driver = driver;
		
		PageFactory.initElements(driver, this);//make sure the steps once again
		
		
	}
	
	public void Click_account() 
	{
		account.click();	
	}
	public void select_signin()
	{
		selectsignin.click();
	}
	
	public String loginpageTitle()
	{
		return driver.getTitle();
	}
	
	public  void enterusername(String username)
	{
		username1.sendKeys(username);			
	}
	
	public  void enteruserpassword(String passowrd)
	{
		password1.sendKeys(passowrd);			
	}
	
	
	public  void clicks_signin()
	{
		signin.click();			
	}
	
	
	public  void enteremail(String emailid)
	{
		email.sendKeys(emailid);			
	}
	
	public  void enterpass(String password)
	{
		password2.sendKeys(password);			
	}
	
	public  void ClickLogin()
	{
		login.click();			
	}
	
	public  void clickfacebook()
	{
		facebook.click();			
	}
	
	public  void clickgoogle()
	{
		google.click();			
	}
	
	public void Click_Not_member()
	{
	Not.click();
    }

	public void Click_Forgot()
	{
		Forgot.click();
    }
	
	public void Click_signup()
	{
		Sign.click();
    }
	
	
}

