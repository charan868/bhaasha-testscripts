package orgadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class interpreterhome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("Mamathagrp");
		c1.findElement(By.id("password")).sendKeys("123");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(2) > a").click();

//	c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).click();
//	c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).sendKeys("Test");
//	c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div").click();
//	c1.findElementByCssSelector("#wrap > div > div.container-fluid > panel > div > div.panel-body > form > div > div > div.col-sm-12.clearfix.filter-buttons > div > div:nth-child(1) > button").click();
	
	c1.findElement(By.xpath("//input[@placeholder='Language Two']")).click();
	c1.findElement(By.xpath("//input[@placeholder='Language Two']")).sendKeys("Azeri");
	c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div/div[2]/sc-select/div[2]/div/div/ul/li/ul/li/div").click();
	c1.findElementByCssSelector("#wrap > div > div.container-fluid > panel > div > div.panel-body > form > div > div > div.col-sm-12.clearfix.filter-buttons > div > div:nth-child(1) > button").click();
	
	
	}

}
