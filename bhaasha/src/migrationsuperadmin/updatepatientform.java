package migrationsuperadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class updatepatientform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://localhost:4200/");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/form/div[1]/span/button[1]")).click();
		c1.findElement(By.xpath("//input[@placeholder='userName']")).sendKeys("admin");
		c1.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/form/div[2]/button[1]")).click();

		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-organization > form > tc-card > div > div > div.col-12.col-md-4 > tc-form-group > tc-select > div.select-box.ng-tns-c291-2 > div.placeholder.ng-tns-c291-2.ng-star-inserted").click();
	//	c1.findElementByXPath("//input[@placeholder='Organisation']").click();
	//		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[1]/tc-form-group/tc-select")).click();
		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[1]/tc-form-group/tc-select/div[2]/div[1]/tc-input/div/div/input")).sendKeys("mamathagrp");
		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[1]/tc-form-group/tc-select/div[2]/div[2]/div")).click();
		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[2]/button")).click();
	
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-organization > tc-card > div > tc-table > div > table > tbody > tr > td:nth-child(5) > div > a").click();
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-view-organization > div:nth-child(6) > div > tc-card > div.card-content > nz-table > nz-spin > div > div > div > div > table > tbody > tr:nth-child(5) > td:nth-child(5) > label").click();
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-view-organization > div:nth-child(6) > div > tc-card > div.card-content > nz-table > nz-spin > div > div > div > div > table > tbody > tr:nth-child(5) > td:nth-child(1) > label > span.ant-checkbox > input").click();
	
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-view-organization > div:nth-child(6) > div > tc-card > div.card-content > div.row.ng-star-inserted > div > button").click();
		
	}

}
