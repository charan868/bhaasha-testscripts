package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adduseraccount {

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

		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//		c1.findElementByCssSelector("#wrap > div > div.panel-body > div > div:nth-child(2) > div:nth-child(1) > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button").click();
		c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[1]/panel/div/div[2]/div[2]/button").click();
		Select dropdown1 = new Select(c1.findElement(By.name("department")));
	        c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	        dropdown1.selectByValue("0");
		c1.findElement(By.name("lastName")).clear();
		c1.findElement(By.name("lastName")).sendKeys("hello");
		
		c1.findElement(By.name("userId")).clear();
		c1.findElement(By.name("userId")).sendKeys("helouser");
		 c1.findElement(By.name("repassword")).sendKeys("123");
		 c1.findElement(By.name("password")).sendKeys("123");
		 
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > input").click();
		
	}

}
