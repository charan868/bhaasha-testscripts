package orgadmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Statisticshome {

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
		
		 c1.findElementByCssSelector("#top-nav > li:nth-child(6) > a").click();
		 
		 Select dropdown2 = new Select(c1.findElement(By.id("selector1")));
		 dropdown2.selectByValue("Sessions");
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > div.col-md-12.text-right.mb10 > button").click();
		 WebElement calendar = c1.findElementByClassName("ranges");
		 List<WebElement> calendarList=calendar.findElements(By.tagName("li"));
		 for (WebElement li : calendarList) {
			 if (li.getText().equals("This Month")) {
				 li.click();
				 c1.findElementByCssSelector("body > div:nth-child(32) > div.ranges > div > button.applyBtn.btn.btn-small.btn-sm.btn-success").click();
			 
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
		 
		 
//	c1.findElementByCssSelector("#wrap > div > div.container-fluid > div > div > div.col-md-12.text-right.mb10 > button").click();
//	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	c1.findElement(By.xpath("/html/body/div[26]/div[3]/ul/li[3]")).click();
//	c1.findElementByCssSelector("body > div:nth-child(32) > div.ranges > div > button.applyBtn.btn.btn-small.btn-sm.btn-success").click();
	
		 
		 
		 
	}

}
