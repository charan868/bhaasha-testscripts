package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Statisticshome {

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
		c1.findElementByCssSelector("#top-nav > li:nth-child(7) > a").click();
		
		Select dropdown1 = new Select(c1.findElement(By.id("selector1")));
		 dropdown1.selectByVisibleText("Sessions");
		 Select dropdown2 = new Select(c1.findElement(By.id("chart")));
		 dropdown2.selectByVisibleText("mamatha interpreter");
		// Select dropdown3 = new Select(c1.findElement(By.id("chart")));
		// dropdown3.selectByVisibleText("mamathagrp");
	
		 // sessions/hours evolution
		 
//	c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > span:nth-child(1) > div > panel > div > div.panel-body > div.row.mb20.session-hours-evolution.ng-scope > div.col-lg-4.col-md-4.col-sm-5.col-xs-5.text-right > div > button:nth-child(1)").click();
//	c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > span:nth-child(1) > div > panel > div > div.panel-body > div.row.mb20.session-hours-evolution.ng-scope > div.col-lg-4.col-md-4.col-sm-5.col-xs-5.text-right > div > button:nth-child(2)").click();
//	c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > span:nth-child(1) > div > panel > div > div.panel-body > div.row.mb20.session-hours-evolution.ng-scope > div.col-lg-4.col-md-4.col-sm-5.col-xs-5.text-right > div > button:nth-child(4)").click();
	
	c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > span:nth-child(1) > div > panel > div > div.panel-body > div.row.mb20.session-hours-evolution.ng-scope > div.col-lg-4.col-md-4.col-sm-3.col-xs-3.text-left > div > button:nth-child(1)").click();
	
			//statistics of session types
	
	 Select dropdown4 = new Select(c1.findElement(By.id("chart")));
	 dropdown4.selectByVisibleText("mamatha interpreter");
	 c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > span.ng-scope > div:nth-child(1) > div.pull-right.mr10.custom-calendar > button > span").click();
	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	// c1.findElement(By.xpath("/html/body/div[9]/div[3]/ul/li[3]")).click();
	 c1.findElementByCssSelector("body > div:nth-child(13) > div.ranges > div > button.applyBtn.btn.btn-small.btn-sm.btn-success").click();

	c1.findElement(By.xpath("/html/body/div[9]/div[3]/div/button[1]")).click();
	
	}

}
