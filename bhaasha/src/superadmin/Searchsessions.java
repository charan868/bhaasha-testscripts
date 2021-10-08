package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchsessions {

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
	
		c1.findElement(By.xpath("//input[@placeholder='Session ID']")).click();
		c1.findElement(By.xpath("//input[@placeholder='Session ID']")).sendKeys("7295");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();

	//	c1.findElement(By.xpath("//input[@placeholder='Organisation']")).click();
	//	c1.findElement(By.xpath("//input[@placeholder='Organisation']")).sendKeys("mamathagroup");
	//	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[2]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();

	//	c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).click();
	//	c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).sendKeys("test");
	//	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();

		c1.findElement(By.xpath("//input[@placeholder='Method']")).click();
		c1.findElement(By.xpath("//input[@placeholder='Method']")).sendKeys("TELEPHONE");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[2]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();

	//	c1.findElement(By.xpath("//input[@placeholder='Language']")).click();
	//	c1.findElement(By.xpath("//input[@placeholder='Language']")).sendKeys("Azeri");
	//	c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div/div")).click();

		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[4]/div/div/div[1]/button")).click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
