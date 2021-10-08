package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class recalculatesessions {

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
	
		c1.findElementByCssSelector("#top-nav > li:nth-child(9) > a > span:nth-child(2)").click();
		
/*		// recalculate session by sessionid
		
		c1.findElement(By.xpath("//input[@name='sessionid']")).click();
		c1.findElement(By.xpath("//input[@name='sessionid']")).sendKeys("7296");
		c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(1) > div > div.panel-body > form > div > div:nth-child(1) > div.col-sm-4.ng-binding > div > ins").click();
	
		c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(1) > div > div.panel-body > form > div > div.form-group.text-right > div > a").click();
	
		//recalculate session by interpreter
	
	c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).click();
	c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).sendKeys("dub");
	c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/panel[2]/div/div[2]/form/div/div[1]/div[1]/tags-input/div/auto-complete/div/ul/li/ti-autocomplete-match/ng-include/span")).click();
	c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(3) > div > div.panel-body > form > div > div:nth-child(1) > div.col-sm-4.ng-binding > div > ins").click();
	c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(3) > div > div.panel-body > form > div > div.form-group.row.text-right > div > a").click();
*/	
	//recalculate session by organisation
		
		Select dropdown1 = new Select(c1.findElement(By.name("origin")));
		 dropdown1.selectByVisibleText("mamathagrp");
		 Select dropdown2 = new Select(c1.findElement(By.name("userAccount")));
		 dropdown2.selectByVisibleText("charan nunna");
		 
		c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(5) > div > div.panel-body > form > div > div.form-group.row.text-right > div > a > p").click();
		 
		 
		 
	//	c1.findElement(By.xpath("//input[@type='checkbox']")).click();
	//	c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(5) > div > div.panel-body > form > div > div.form-group.row.text-right > div > a").click();
	
		//tva in %
		
//		c1.findElement(By.xpath("//input[@name='tvaInput']")).click();
//		c1.findElement(By.xpath("//input[@name='tvaInput']")).clear();
//		c1.findElement(By.xpath("//input[@name='tvaInput']")).sendKeys("5");
//		c1.findElement(By.name("fromDate")).click();
//		c1.findElement(By.name("fromDate")).clear();
//		c1.findElement(By.name("fromDate")).sendKeys("07/25/2020");
//		c1.findElementByCssSelector("#wrap > div.container-fluid.p10.pt0.main-panel.ng-scope > panel:nth-child(7) > div > div.panel-body > form > div > div.form-group.row.text-right > div > a").click();
		
		
		
		
		
		
	}

}
