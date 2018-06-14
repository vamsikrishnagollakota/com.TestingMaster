package com.ScreenFunctions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import javax.swing.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.GenericFunctions.GenericFunctions;

public class SummerDress extends GenericFunctions {
	private static final WebDriver WebElement = null;

	boolean status = true;

	/*
	 * Vamsi Gollakota-This is used to identify the "MyAccount" link
	 * functionality
	 */

	@FindBy(how = How.XPATH, using = "//h1[text()='My account']")
	public static WebElement lblVerifyMyAccount;

	/*
	 * Vamsi Gollakota-This is used to identify the "Dress" link functionality
	 */
	@FindBy(how = How.XPATH, using = "//div[@id='block_top_menu']/ul/li[2]/a")
	public static WebElement lnkDresses;

	/*
	 * Vamsi Gollakota-This is used to identify the "Summer Dresses" link
	 * functionality
	 */
	@FindBy(how = How.XPATH, using = "//div[@class='block_content']/ul/li[3]")
	public static WebElement lnkSummerDresses;

	/*
	 * Vamsi Gollakota-This is used to identify the "Sorting" functionality
	 */
	@FindBy(how = How.XPATH, using = "//select[@id='selectProductSort']")
	public static WebElement drpdownlistSortBy;

	/*
	 * Vamsi Gollakota-This is used to check "MyAccount" link functionality
	 */
	public boolean verify_MyAccount() {
		try {
			String expectedName = "My account";
			String ActualValue = SummerDress.lblVerifyMyAccount.getText();
			assertEquals(expectedName.toLowerCase(), ActualValue.toLowerCase());
			System.out.println("Both are same in the display");
		} catch (Exception e) {
			status = false;

		}

		return status;
	}

	/*
	 * Vamsi Gollakota-This is used to identify the "Dress" link functionality
	 */
	public boolean Verify_DressTabFunctionality() {
		boolean status = true;
		String expectedName = "Dresses";
		String ActualValue = SummerDress.lnkDresses.getText();
		assertEquals(expectedName.toLowerCase(), ActualValue.toLowerCase());
		System.out.println("Both are same for Dresses");
		SummerDress.lnkDresses.click();

		return status;

	}

	/*
	 * Vamsi Gollakota-This is used to identify the "Summer Dresses" link
	 * functionality
	 */
	public boolean Verify_SummerDresseslinkFunctionality() {
		boolean status = true;
		String expectedName = "Summer Dresses";
		String ActualValue = SummerDress.lnkSummerDresses.getText();
		assertEquals(expectedName.toLowerCase(), ActualValue.toLowerCase());
		System.out.println("Both are same for Summer Dresses");
		SummerDress.lnkSummerDresses.click();

		return status;

	}

	/*
	 * Vamsi Gollakota-This is used to Sorting functionality
	 */
	public boolean Verify_sortingOrder() {

		boolean status = true;
		String dropdownvalu = getdata("TestData", "Dropdown", 1);
		System.out.println(dropdownvalu);
		selectByText(drpdownlistSortBy, dropdownvalu);

		return status;

	}

}
