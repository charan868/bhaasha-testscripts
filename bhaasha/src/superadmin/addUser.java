package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class addUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div[1]/button[1]")).click();
		c1.findElement(By.id("username")).sendKeys("admin");
		c1.findElement(By.id("password")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div/div[1]/sc-select/div[2]/div/ul/li/input")).click();
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div/div[1]/sc-select/div[2]/div/ul/li/input")).sendKeys("mamathagrp");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div")).click();
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div/div[2]/div/div[1]/button")).click();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div/div/div/div/a[1]/i")).click();
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]/i")).click();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//add user
		
	/*	c1.findElement(By.cssSelector("#wrap > div > div.panel-body > div > div:nth-child(1) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button")).click();
		 Select dropdown1 = new Select(c1.findElement(By.id("prefix")));
	      c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	       dropdown1.selectByIndex(1);
	       Alert alt = c1.switchTo().alert();
	       alt.accept();
		c1.findElement(By.name("firstName")).sendKeys("user54");
		c1.findElement(By.name("lastName")).sendKeys("user");
		c1.findElement(By.id("telephone")).sendKeys("8562085620");
		c1.findElement(By.name("email")).sendKeys("1user@yopmail.com");
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElement(By.xpath("/html/body/div[13]/div/div/div[3]/button[1]")).click();
		
		//update user
		//c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]/i")).click();
		//c1.findElement(By.name("firstName")).clear();
		//c1.findElement(By.name("firstName")).sendKeys("rahuloo");
		// c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//c1.findElement(By.xpath("/html/body/div[8]/div/div/div[3]/button[2]")).click();
		
		//delete user
		//c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[2]/i")).click();
		//c1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[2]")).click();
	*/	
	//	add medical professional
		
		c1.findElement(By.cssSelector("#wrap > div > div.panel-body > div > div:nth-child(2) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button")).click();
		Select dropdown1 = new Select(c1.findElement(By.id("prefix")));
	      c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	       dropdown1.selectByIndex(1);
	       Alert alt = c1.switchTo().alert();
	       alt.accept();
	       c1.findElement(By.name("firstName")).sendKeys("docy");
	       c1.findElement(By.name("lastName")).sendKeys("doc");
	       c1.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/button[1]")).click();
	       
		//add patient
	       c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[3]/div/panel/div/div[2]/div[2]/button")).click();
	     
	
	}

}
