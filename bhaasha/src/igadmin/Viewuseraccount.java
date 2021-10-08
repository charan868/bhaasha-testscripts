package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Viewuseraccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathainterpreter");
		c1.findElement(By.id("password")).sendKeys("1234");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 c1.findElementByCssSelector("#top-nav > li:nth-child(3) > a").click();
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/div/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]/i")).click();

	// ADD USER
	/*	 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 c1.findElementByCssSelector("#wrap > div > div.panel-body > div > div:nth-child(1) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button").click();
		 c1.findElement(By.name("firstName")).sendKeys("cherry");
		 c1.findElement(By.name("lastName")).sendKeys("lol");
		 c1.findElement(By.name("telephone")).sendKeys("5236235412");
		 c1.findElement(By.name("email")).sendKeys("emai@yopmail.com");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(1)").click();
		 
	// edit user
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[1]/i")).click();
		 c1.findElement(By.name("lastName")).clear();
		 c1.findElement(By.name("lastName")).sendKeys("lol");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(2)").click();
		 
	//delete user
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[2]/i")).click();
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
		 
		//ADD MEDICAL PROFESSIONAL
		 
		 c1.findElementByCssSelector("#wrap > div > div.panel-body > div > div:nth-child(2) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button").click();
		 c1.findElement(By.name("firstName")).sendKeys("doct");
		 c1.findElement(By.name("lastName")).sendKeys("cardio");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(1)").click();
	
		 //update medical professional
		 
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[1]/i")).click();
		c1.findElement(By.name("lastName")).clear();
		c1.findElement(By.name("lastName")).sendKeys("cardiac");
		c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(2)").click();
	
		 //delete medical professional
	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[2]/i")).click();	 
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
	
	*/
	
	//ADD Other PROFESSIONAL
		 
		 c1.findElementByCssSelector("#wrap > div > div.panel-body > div > div:nth-child(3) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button").click();
		 c1.findElement(By.name("firstName")).sendKeys("dct");
		 c1.findElement(By.name("lastName")).sendKeys("cardio");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(1)").click();
	
		 //update other professional
	 
	//	c1.findElementByCssSelector("#\\31 615955469138-0-uiGrid-00BY-cell > a:nth-child(1) > i").click();
		 
	    c1.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[3]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[1]/i")).click();
		c1.findElement(By.name("lastName")).clear();
		c1.findElement(By.name("lastName")).sendKeys("cardiac");
		c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(2)").click();
	
		 //delete other  professional
		  
	c1.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[3]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[2]")).click();	 
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
	
	/*
		 //ADD PATIENT
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 c1.findElementByCssSelector("#wrap > div > div.panel-body > div > div:nth-child(3) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button").click();
		 c1.findElement(By.name("firstName")).sendKeys("pat");
		 c1.findElement(By.name("lastName")).sendKeys("hardy");
		 c1.findElement(By.name("dob")).sendKeys("12/02/1997");
		 c1.findElement(By.name("ippnumber")).sendKeys("52369");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer.no-border > button:nth-child(1)").click();
	
		 //update patient
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[3]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[1]/i")).click();
		 c1.findElement(By.name("lastName")).clear();
		 c1.findElement(By.name("lastName")).sendKeys("haaardy");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer.no-border > button:nth-child(2)").click();
		 
		 //delete patient
		 
	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[3]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[2]/i")).click();	 
	c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();	 
		 

		 	//ADD LOCATION
	c1.findElementByCssSelector("#wrap > div > div.panel-body > div > div:nth-child(4) > div > panel > div > div.panel-body > div.btn-toolbar.custom-button.ng-scope > button").click();
	 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.location-map-footer.row.ng-scope > div.col-xs-5.col-sm-4.col-md-3.text-right > button:nth-child(1)").click();
	
		 //update location
		 
	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[4]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[1]/i")).click();	 
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.location-map-footer.row.ng-scope > div.col-xs-5.col-sm-4.col-md-3.text-right > button:nth-child(2)").click();
	
	
		 //delete location
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[4]/div/panel/div/div[2]/div[1]/div[1]/div[3]/div/div[2]/div/div/div/div/a[2]/i")).click();
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
	
	
	 */
		 
	}

}
