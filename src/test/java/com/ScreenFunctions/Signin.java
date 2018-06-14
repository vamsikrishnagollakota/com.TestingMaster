package com.ScreenFunctions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class Signin extends GenericFunctions{
 boolean status=true;
 
 @FindBy(how = How.XPATH, using = "//a[@title='Log in to your customer account']")

	public static WebElement lnkSignin;
 
 @FindBy(how=How.ID, using ="email")
    public static WebElement txtboxUserName;
 
 @FindBy(how=How.ID, using ="passwd")
    public static WebElement txtPwd;
 
 @FindBy(how=How.XPATH, using ="//button[@id='SubmitLogin']")
    public static WebElement btnSubmit;
 
 
 public boolean lnk_sign(){
	 boolean status;
	 status=hoverAndClick(lnkSignin);
	 return status;
	 
 }

 public static void login_ExistingUser(){
	
	 String email=getCommontestdata("Username");
	 txtboxUserName.sendKeys(email);
	 
	 
	 String password=getCommontestdata("Password");
	 txtPwd.sendKeys(password);
	 
	 hoverAndClick(btnSubmit);
 }

}
