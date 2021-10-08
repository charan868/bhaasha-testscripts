package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Viewbillingrules {

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
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[7]/ul/li[2]/a/span[1]"));
		 actions.moveToElement(subMenu).click();
		 actions.click().build().perform();
		
	 //view billing rules
		 
		 c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]/i").click();
		 JavascriptExecutor js = (JavascriptExecutor)c1;
				 WebElement element =  c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button"));
				 js.executeScript("arguments[0].scrollIntoView();", element);
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button").click();
	
	//delete billing rules
		 
		 c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[3]/i").click();
		 
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
	
	
	
	}

}
