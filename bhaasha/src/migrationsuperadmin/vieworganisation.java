package migrationsuperadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class vieworganisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://localhost:4200/");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/nz-spin/div/form/div[1]/span/button[1]")).click();
		c1.findElement(By.xpath("//input[@placeholder='userName']")).sendKeys("admin");
		c1.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/nz-spin/div/form/div[2]/button[1]")).click();

		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-organization > nz-table > nz-spin > div > div > nz-table-inner-scroll > div > div > table > thead > tr > th:nth-child(1) > nz-table-filter > nz-filter-trigger").click();
		c1.findElementByXPath("//input[@placeholder='Search']").sendKeys("mamathagrp");
	//		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[1]/tc-form-group/tc-select")).click();
		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[1]/tc-form-group/tc-select/div[2]/div[1]/tc-input/div/div/input")).sendKeys("mamathagrp");
		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[1]/tc-form-group/tc-select/div[2]/div[2]/div")).click();
		c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/main/div/app-organization/form/tc-card/div/div/div[2]/button")).click();
	
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-organization > tc-card > div > tc-table > div > table > tbody > tr > td:nth-child(5) > div > a").click();
	
	//edit organisation
		
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-view-organization > div:nth-child(1) > div > tc-card > div.card-content > div:nth-child(3) > div > button").click();
		c1.findElementByCssSelector("body > tc-modal > div.modal-window-wrap > div > div.modal-footer.ng-star-inserted > div > button.tc-btn.btn-info").click();
	
	}

}
