package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assigntemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathainterpreter");
		c1.findElement(By.id("password")).sendKeys("1234");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[7]/a/span[1]"));
		 actions.moveToElement(mainMenu).perform();
		 WebElement subMenu = c1.findElement(By.cssSelector("#top-nav > li.ng-scope.hasChild > ul > li:nth-child(3) > a"));
		 actions.moveToElement(subMenu).click().build().perform();
		
		 
		 Select dropdown1 = new Select(c1.findElement(By.id("organization")));
		 dropdown1.selectByValue("0");
		 Select dropdown2 = new Select(c1.findElement(By.id("billing_template")));
		 dropdown2.selectByValue("1");
		 c1.findElementByCssSelector("#wrap > div:nth-child(2) > div > div.form-group.custom-options.clearfix > div.col-sm-3.ng-scope > button").click();
		 
	}

}
