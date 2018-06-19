package com.TestCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Hello {

	@Test
	public void testing()
	{
		int a=10;
		int b=30;
		assertEquals(a, b);
	
		System.out.println("Hello");
	}

}
