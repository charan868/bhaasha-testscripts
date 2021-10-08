package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sessionsoptions {

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
		c1.findElement(By.xpath("/html/body/nav/div[2]/ul/li[6]/a")).click();
		
	//	c1.findElementByCssSelector("#folders > a.inbox-menu-item.ng-binding.ng-scope.active").click();
		c1.findElementByCssSelector("#folders > a:nth-child(2)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(3)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(4)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(5)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(6)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(7)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(8)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(9)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(10)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(11)").click();
		c1.findElementByCssSelector("#folders > a:nth-child(12)").click();
	}

}
