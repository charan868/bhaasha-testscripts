package superadmin;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Interpreterexport {

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
		c1.findElementByCssSelector("#top-nav > li:nth-child(8) > a").click();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
	 WebElement ele = c1.findElement(By.cssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div.col-lg-4.col-md-4.col-sm-4.select-usertype.ng-scope > div > label.ng-binding.icheck-label"));
	 JavascriptExecutor js = (JavascriptExecutor)c1;
	 js.executeScript("arguments[0].click()", ele);
	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 WebElement ele1 = c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[3]/sc-select/div[2]/div/a"));
	 JavascriptExecutor js1 = (JavascriptExecutor)c1;
	 js1.executeScript("arguments[0].click()", ele1);
	 
	 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(3) > sc-select > div.ng-scope > div > div > div > input").sendKeys("charan");
	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[3]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
//	 c1.findElement(By.xpath("//*[@id=\"ui-select-choices-row-2-0\"]")).click();
//	 c1.findElementByCssSelector("#ui-select-choices-row-13-0 > div > div").click();
	 
	 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	 c1.findElement(By.cssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > div > label:nth-child(1) > div")).click();
//	 c1.findElement(By.name("pdf")).click();
		
	//	 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > div > label:nth-child(2) > div > ins").click();
		 c1.findElementByCssSelector("#exportButton > button").click();
		 
		 
	}

}
