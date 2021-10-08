package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exporthome {

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
		
		//user accounts
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		c1.findElement(By.cssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div.col-lg-4.col-md-4.col-sm-4.calendar-filter.ng-scope > button")).click();
		Select dropdown1 = new Select(c1.findElement(By.name("userAccount")));
		 dropdown1.selectByVisibleText("mamuser users");
	//c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > div > label:nth-child(1) > div > ins").click();
		 //c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > div > label.ng-scope.icheck-label > div > ins").click();
		 c1.findElementByCssSelector("#wrap > div > div.container-fluid.p10.pt0.main-panel.export-session > div > div > panel > div > div.panel-body > form > div > div.form-group.row.export > div:nth-child(4) > div > label:nth-child(2) > div > ins").click();
		c1.findElementByCssSelector("#exportButton > button").click();
	
		 
	}

}
