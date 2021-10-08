package orgadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viewsessions {

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

		 c1.findElementByCssSelector("#top-nav > li:nth-child(4) > a").click();
		
		 //view
		 
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[1]/i")).click();
	//	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button.btn.btn-secondary.ng-binding").click();

		 //update
	
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[2]/i")).click();
		 c1.findElementByName("totalSessionHour").sendKeys("2");
		 c1.findElementByName("totalSessionMin").sendKeys("45");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button.btn.btn-primary.ng-binding.ng-scope").click();
	
	}

}
