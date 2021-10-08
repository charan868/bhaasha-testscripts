package superadmin;

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
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div[1]/button[1]")).click();
		c1.findElement(By.id("username")).sendKeys("admin");
		c1.findElement(By.id("password")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElement(By.xpath("/html/body/nav/div[2]/ul/li[2]/a/span[1]")).click();
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div/panel/div/div[2]/div/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[2]/i")).click();
		 Select dropdown1 = new Select(c1.findElement(By.name("department")));
	        c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	        dropdown1.selectByValue("0");
		c1.findElement(By.name("lastName")).clear();
		c1.findElement(By.name("lastName")).sendKeys("hello");
		c1.findElement(By.name("email")).clear();
		c1.findElement(By.name("email")).sendKeys("ho@yopmail.com");
		c1.findElement(By.name("userId")).clear();
		c1.findElement(By.name("userId")).sendKeys("hellouser");
		  c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  c1.findElement(By.xpath("//input[@type='submit']")).click();
	//	c1.findElement(By.xpath("/html/body/div[6]/div/div/div[3]/input")).click();
	
	}

}
