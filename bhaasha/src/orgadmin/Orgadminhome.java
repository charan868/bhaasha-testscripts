package orgadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orgadminhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathagrp");
		c1.findElement(By.id("password")).sendKeys("mamatha123");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		 c1.findElementByCssSelector("#wrap > div > div:nth-child(2) > div > div:nth-child(1) > div > div.session-type.ng-binding").click();
//		 c1.findElementByCssSelector("#wrap > div > div:nth-child(2) > div > div:nth-child(2) > div > div.session-type.ng-binding").click();
//		 c1.findElementByCssSelector("#wrap > div > div:nth-child(2) > div > div:nth-child(3) > div > div:nth-child(3)").click();
		 c1.findElementByCssSelector("#wrap > div > div.container.date-picker-container > div.row > div:nth-child(1) > div > div.session-type.ng-binding").click();
//		 c1.findElementByCssSelector("#wrap > div > div.container.date-picker-container > div.row > div:nth-child(2) > div > div.session-type.ng-binding").click();
//		 c1.findElementByCssSelector("#wrap > div > div.container.date-picker-container > div.row > div:nth-child(3) > div > div.session-type.ng-binding").click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
