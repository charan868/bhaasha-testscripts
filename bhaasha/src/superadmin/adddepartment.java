package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class adddepartment {
	public static void main(String[] args) {
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
/*	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/panel/div/div[2]/div[2]/button")).click();
	c1.findElement(By.name("deptname")).sendKeys("hello");
	c1.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]")).click();
	*/ 
	//update department
	
	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]/i")).click();
	c1.findElement(By.name("deptname")).sendKeys("surgeon");
	c1.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[2]")).click();
	c1.close();
	
					//delete department
	//c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div[2]/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[2]/div/div/a[2]/i")).click();
	c1.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/button[2]")).click();
	
	}
}
