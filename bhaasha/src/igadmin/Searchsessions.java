package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchsessions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathainterpreter");
		c1.findElement(By.id("password")).sendKeys("mamatha123");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(4) > a").click();
		 
		 //SESSION ID
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(1) > div:nth-child(1) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(1) > div:nth-child(1) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("7295");
		 c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div/div").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
	
		 // USER ACCOUNT
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(1) > div:nth-child(2) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(1) > div:nth-child(2) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("mamuser");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[2]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
	
		 //INTERPRETER
	
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(1) > div:nth-child(3) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(1) > div:nth-child(3) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("Test");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[3]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
		
		 //ORGANISATION
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(1) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(1) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("mamathagrp");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[2]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
		 
		 //LANGUAGE
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(2) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(2) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("Azeri");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[2]/div[2]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
		
		 //USER
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(3) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(3) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("nunna");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[2]/div[3]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
			
		 //METHOD
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(4) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(2) > div:nth-child(4) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("telephone");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[2]/div[4]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.sessions-panel > panel > div > div.panel-body > form > div > div:nth-child(4) > div > div > div:nth-child(1) > button").click();
			
	
	
	}

}
