package igadmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exportinterpreters {

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
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(5) > a").click();
		 
		 WebElement ele = c1.findElement(By.cssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div.col-lg-4.col-md-4.col-sm-4.select-usertype.ng-scope > div > label:nth-child(3) > div > ins"));
		 JavascriptExecutor js = (JavascriptExecutor)c1;
		 js.executeScript("arguments[0].click()", ele);
	
		 //time period
/*		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div.col-lg-4.col-md-4.col-sm-4.calendar-filter.ng-scope > button").click();
		 
		 WebElement calendar = c1.findElementByClassName("ranges");
		 List<WebElement> calendarList=calendar.findElements(By.tagName("li"));
		 for (WebElement li : calendarList) {
			 if (li.getText().equals("Last Month")) {
				 li.click();
				 c1.findElementByXPath("/html/body/div[6]/div[3]/div/button[1]").click();
			 }
		 }
				 c1.findElementByXPath("/html/body/div[6]/div[3]/div/button[1]").click();
	*/		 
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > sc-select > div.ng-scope").click();
		 
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > sc-select > div.ng-scope > div > div > div > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > sc-select > div.ng-scope > div > div > div > input").sendKeys("Test");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[4]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 
		 //timeperiod
		 //pdf
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[6]/div/label[1]/div/ins")).click();
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[7]/div/label[1]/div/ins")).click();
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[7]/div/label[2]/div/ins")).click();
		
		 //csv
		 
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[6]/div/label[2]/div/ins")).click();
		 
		 //abacusxml
		 
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[6]/div/label[3]/div/ins")).click();
		 
		 //swiss salary
		 
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[6]/div/label[4]/div/ins")).click();
		 c1.findElementByCssSelector("#exportButton > button").click();
		 
		 
		 
/*	//session
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[2]/div/label[1]/div/ins")).click();
	
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(3) > sc-select > div.ng-scope > div > ul > li > input").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(3) > sc-select > div.ng-scope > div > ul > li > input").sendKeys("7295");
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[3]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();
		 
 //pdf
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[4]/div/label[1]/div/ins")).click();
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[5]/div/label[1]/div/ins")).click();
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[5]/div/label[2]/div/ins")).click();
		 
		 //csv
		 
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/form/div/div[1]/div[4]/div/label[2]/div/ins")).click();
		 c1.findElementByCssSelector("#exportButton > button").click();
	
	*/
	
	
	
	
	
	
	
	
	}
}