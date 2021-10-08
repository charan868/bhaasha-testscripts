package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Otherbillingrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div[1]/button[1]")).click();
		c1.findElement(By.id("username")).sendKeys("admin");
		c1.findElement(By.id("password")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[10]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[10]/ul/li[1]/a/span[1]"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();
		 
		 //view billing rule
	//	 c1.findElement(By.xpath("//input[@title='view']")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	 c1.findElementByCssSelector("#\\31 597290267015-0-uiGrid-01LV-cell > a:nth-child(1)").click();
	//	 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]")).click();
	//	 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	 JavascriptExecutor js = (JavascriptExecutor)c1;
	//	 WebElement element =  c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button"));
	//	 js.executeScript("arguments[0].scrollIntoView();", element);
	//	 c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button")).click();
		 
		//delete billing rule
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	 c1.findElement(By.cssSelector("#\\31 597312115568-2-uiGrid-00K0-cell > a:nth-child(3)")).click();
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[3]/i")).click();
		 c1.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button[2]")).click();
	}

}
