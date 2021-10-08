package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mappinghome {

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
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[5]/a"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[5]/ul/li/a"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();

		 Select dropdown1 = new Select(c1.findElement(By.id("organization")));
		 dropdown1.selectByVisibleText("mamathagrp");
		 Select dropdown2 = new Select(c1.findElement(By.id("bhaashagroup")));
		 dropdown2.selectByVisibleText("mamathabhaasha");
		 c1.findElement(By.xpath("//*[@id=\"wrap\"]/div[2]/div/div[1]/div[3]/div/span/button")).click();
		 c1.findElementByClassName("ng-binding").click();
		 
	
	}

}
