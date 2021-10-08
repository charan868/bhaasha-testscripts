package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inperson {

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
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(4) > a").click();
		 
		 c1.findElementByCssSelector("#page-heading > div > div > button").click();
		 Select dropdown1 = new Select(c1.findElement(By.name("sessionType")));
		 dropdown1.selectByValue("INPERSON");
		 
		 Select dropdown2 = new Select(c1.findElement(By.name("sessionStatus")));
		 dropdown2.selectByValue("PENDING");
	
		 c1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 WebElement ele = c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div.row > div:nth-child(3) > sc-select > div.ng-scope > div > a > span.select2-chosen.ng-binding"));
		 JavascriptExecutor js = (JavascriptExecutor)c1;
		 js.executeScript("arguments[0].click()", ele);

	c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div > div:nth-child(3) > sc-select > div.ng-scope > div > div > div > input").click();
	c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div > div:nth-child(3) > sc-select > div.ng-scope > div > div > div > input").sendKeys("charan nunna");
	c1.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/div[2]/form/div[1]/div[3]/sc-select/div[2]/div/div/ul/li/ul/li/div")).click();
	
	Select dropdown3 = new Select(c1.findElement(By.name("language")));
	 dropdown3.selectByVisibleText("Azeri");
	c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div > div:nth-child(5) > sc-select > div.ng-scope > div > a")).click();
	c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div > div:nth-child(5) > sc-select > div.ng-scope > div > div > div > input")).click();
	 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div > div:nth-child(5) > sc-select > div.ng-scope > div > div > div > input")).sendKeys("dubb");
	c1.findElementByXPath("/html/body/div[7]/div/div/div[1]/div[2]/form/div/div[5]/sc-select/div[2]/div/div/ul").click();
	c1.findElement(By.xpath("//input[@placeholder='Enter Date']")).click();
	c1.findElement(By.xpath("//input[@placeholder='Enter Date']")).sendKeys("12/12/2020");
	Select dropdown4 = new Select(c1.findElement(By.name("duration")));
	 dropdown4.selectByVisibleText("1 Hour");
	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div:nth-child(1) > div:nth-child(9) > input").click();
	
	 c1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	 c1.findElementByCssSelector("body > div:nth-child(15) > div > div > div.modal-footer.location-map-footer.row.ng-scope > div.col-xs-5.col-sm-4.col-md-3.text-right > button:nth-child(3)").click();
	 c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-body > form > div.row > div:nth-child(9) > div > sc-select > div.ng-scope > div > a > span.select2-chosen.ng-binding")).click();
	 c1.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/div[2]/form/div[1]/div[9]/div/sc-select/div[2]/div/div/ul/li/ul/li[1]/div")).click();
	
	 c1.findElement(By.name("subject")).sendKeys("test1");
	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div.row > div:nth-child(12) > div > sc-select > div.ng-scope > div > a").click();
	 c1.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/div[2]/form/div[1]/div[12]/div/sc-select/div[2]/div/div/ul/li/ul/li[1]/div")).click();
	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div.row > div:nth-child(13) > div > sc-select > div.ng-scope > div > a").click();
	 c1.findElement(By.xpath("/html/body/div[7]/div/div/div[1]/div[2]/form/div[1]/div[13]/div/sc-select/div[2]/div/div/ul/li/ul/li[1]/div")).click();

	 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button.btn.btn-primary.ng-binding.ng-scope").click();
	}

}
