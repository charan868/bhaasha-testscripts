package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sessionhome {

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
	//	c1.findElementByCssSelector("#top-nav > li.ng-scope.active > a").click();
		c1.findElement(By.xpath("/html/body/nav/div[2]/ul/li[6]/a")).click();
		
		// NEW SESSION
		
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElementByCssSelector("#page-heading > div > div > button").click();
		Select dropdown1 = new Select(c1.findElement(By.name("sessionType")));
		 dropdown1.selectByVisibleText("TELEPHONE");
		 
		 Select dropdown2 = new Select(c1.findElement(By.name("sessionStatus")));
		 dropdown2.selectByVisibleText("CONFIRMED");
		 //	 c1.findElementByClassName("form-control ui-select-container select2 select2-container ng-valid ng-touched").click();;
	
		 c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[3]/sc-select/div[2]/div/a/span[1]")).click();
	c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div.row > div:nth-child(3) > sc-select > div.ng-scope > div > div > div > input").click();
	c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div.row > div:nth-child(3) > sc-select > div.ng-scope > div > div > div > input").sendKeys("charan nunna");
	c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[3]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();

	Select dropdown3 = new Select(c1.findElement(By.name("language")));
	 dropdown3.selectByVisibleText("Azeri");
	c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[5]/sc-select/div[2]/div/a/span[1]")).click();
	c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[5]/sc-select/div[2]/div/div/ul/li/ul/li[1]/div/div")).click();
	c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[6]/div/span/button")).click();
	c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[6]/div/ul/li[1]/div/table/tbody/tr[3]/td[3]/button")).click();
	Select dropdown4 = new Select(c1.findElement(By.name("duration")));
	 dropdown4.selectByVisibleText("1 Hour");
	 c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-body > form > div.row > div:nth-child(9) > div > sc-select > div.ng-scope > div > a > span.select2-chosen.ng-binding")).click();
	 //c1.findElement(By.cssSelector("#ui-select-choices-row-10-1")).click();
	 c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[1]/div[9]/div/sc-select/div[2]/div/div/ul/li/ul/li[2]")).click();
	 c1.findElement(By.name("subject")).sendKeys("test1");
//	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div:nth-child(3) > sc-select > div.ng-scope > div > a > span.select2-chosen.ng-binding").click();
//	 c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[3]/sc-select/div[2]/div/div/ul/li/ul/li[1]/div")).click();
//	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div:nth-child(4) > sc-select > div.ng-scope > div > a > span.select2-chosen.ng-binding").click();
//	 c1.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[2]/form/div[4]/sc-select/div[2]/div/div/ul/li/ul/li/div")).click();
	 
	 c1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/button[1]")).click();
	 
	
	
	}

}
