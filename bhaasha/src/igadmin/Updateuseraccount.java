package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Updateuseraccount {

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
		 
		 c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/div/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[2]/i").click();
		 
		 Select dropdown2 = new Select(c1.findElement(By.name("department")));
		 dropdown2.selectByValue("0");
		  c1.findElement(By.name("lastName")).sendKeys("charlie");
		  c1.findElement(By.name("email")).clear();
		  c1.findElement(By.name("email")).sendKeys("dubb@yopmail.com");
		  c1.findElement(By.name("telephone")).sendKeys("9595999555");
		 c1.findElement(By.name("addressKey")).sendKeys("56210");
		 c1.findElement(By.name("billedTravelCost")).sendKeys("25");
		 c1.findElement(By.name("billingName")).sendKeys("bush");
		 c1.findElement(By.name("billingAddressZipcode")).sendKeys("56210");
	//	 c1.findElement(By.name("email")).sendKeys("email25@yopmail.com");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > input:nth-child(2)").click();
		 
		 
	}

}
