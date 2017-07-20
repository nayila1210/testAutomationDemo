package com.selenium.gitPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gitPractice {
	WebDriver driver;
	@Test
	public void openBrowser() {
		driver=new ChromeDriver();
		driver.get("http://www.google.com");
		
	}
	

}
