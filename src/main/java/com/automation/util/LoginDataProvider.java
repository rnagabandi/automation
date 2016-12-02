package com.automation.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.testng.annotations.DataProvider;

import com.csvreader.CsvReader;

public class LoginDataProvider {

	@DataProvider
	public Object[][] loginTestsData() {
		
		try {
			CsvReader reader = new CsvReader(new InputStreamReader(new FileInputStream(""), "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}
	
}
