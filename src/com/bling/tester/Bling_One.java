package com.bling.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bling_One {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://dash.bling-center.com/platform/signIn.html");
		
		driver.findElement(By.xpath("//button[@class='forget-password-btn']")).click();
		
	}

}
