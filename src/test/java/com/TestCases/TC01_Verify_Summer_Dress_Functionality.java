package com.TestCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.GenericFunctions.GenericFunctions;
import com.ScreenFunctions.SignOut;
import com.ScreenFunctions.Signin;
import com.ScreenFunctions.SummerDress;

public class TC01_Verify_Summer_Dress_Functionality extends GenericFunctions{
	 static boolean status = true;
	@Test
	public static void validate_SummaryPage() throws InterruptedException{
		
		/*
		 Vamsi Gollakota-This is used to Launch Application functionality
		 */
		launchApplication("firefox");
		Signin sign=PageFactory.initElements(driver,Signin.class);
		sign.lnk_sign();
		
		Thread.sleep(3000);
		
		/*
		 Vamsi Gollakota-This is used to verify the existing user functionality
		 */
		
		Signin.login_ExistingUser();
		
		System.out.println("User Logged In");
		
		
		//VAMSI GOLLAKOTA-To verify the "My Account" text is visible or not.
		
		SummerDress sumdress=PageFactory.initElements(driver, SummerDress.class);
		sumdress.verify_MyAccount();
		
		//VAMSI GOLLAKOTA - To Verify Dress Link FUnctionality
		
		/*
		 Vamsi Gollakota-This is used to Dress Tab functionality
		 */
		sumdress.Verify_DressTabFunctionality();
		
		/*
		 Vamsi Gollakota-This is used to Summer Dresses Tab functionality
		 */
		
		sumdress.Verify_SummerDresseslinkFunctionality();
		
		
		/*
		 Vamsi Gollakota-This is used to check the Sorting functionality
		 */
	
		
		status=sumdress.Verify_sortingOrder();
		System.out.println(status);
		
		/*
		 * Vamsi Gollakota-This functionality is used to logout from the web.
		 */
		SignOut sing=PageFactory.initElements(driver, SignOut.class);
		sing.user_signOut();
		System.out.println("User is signed out");
		
		status=sing.validate_SignOut();	
		if (status)
		{
			System.out.println("SUccessful");
			logEvent("Pass", "Successful");
		}
		else
		{
			logEvent("Fail", "Faild");
		}
		
	}
	
	
}
