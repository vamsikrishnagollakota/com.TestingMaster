package com.TestCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class TC_008FaildTestCase {

	@Test
	public void runFaildTestngXml()
	{
		TestNG runner=new TestNG();

		// Create a list of String 
		List<String> suitefiles=new ArrayList<String>();

		// Add xml file which you have to execute
		suitefiles.add("C:\\Users\\S3\\git\\com.TestingMaster\\test-output\\testng-failed.xml");

		// now set xml file for execution
		runner.setTestSuites(suitefiles);

		// finally execute the runner using run method
		runner.run();
		
	}
}
