package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bhaashainterpretergroup {

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
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[4]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[4]/ul/li[1]/a"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();
	
		// c1.findElement(By.name("groupName")).sendKeys("stagingroom");
		// c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/form/div/span/button")).click();
	
		 //update bhaasha interpreter group
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]")).click();
		 c1.findElement(By.name("grpname")).clear();
		 c1.findElement(By.name("grpname")).sendKeys("staging2");
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button:nth-child(2)").click();
		// c1.findElement(By.xpath("/html/body/div[6]/div/div/div/div[2]/button[4]")).click();
		 
		 // delete bhaasha interpreter group
		 
	//	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[2]")).click(); 
		//c1.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/button[2]")).click();
		 
		 
		 
		 
	}

}
