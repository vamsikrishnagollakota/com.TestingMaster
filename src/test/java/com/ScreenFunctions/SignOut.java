package com.ScreenFunctions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.GenericFunctions.GenericFunctions;

public class SignOut extends GenericFunctions{
	boolean status=true;
	
	 @FindBy(how = How.XPATH, using = "//a[@class='logout']")

		public static WebElement lnkSignOut;
	 
	 @FindBy(how = How.XPATH, using = "//a[@class='login']")

	 	public static WebElement userSignIn;

	 
	 public static void user_signOut(){
			
		 hoverAndClick(lnkSignOut);
	 }
	 
	 public static boolean validate_SignOut(){
		assertEquals(userSignIn.getText(), "Sign in");
		 return true;
	 }
	 

}
