package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Searchinterpreter {

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
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[3]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[3]/ul/li[1]/a/span[1]"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();
		
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 c1.findElement(By.xpath("//*[@id=\"wrap\"]/div/div[2]/panel/div/div[2]/form/div/div/div[1]/sc-select/div[2]/div/ul/li/input")).click();
		c1.findElement(By.xpath("//input[@placeholder='Interpreters']")).sendKeys("charan chowdary");
		 c1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		c1.findElement(By.cssSelector("#ui-select-choices-row-4-0 > div > div")).click();
	//	 c1.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/panel/div/div[2]/form/div/div[1]/div[1]/sc-select/div[2]/div/div/ul/li/ul/li/div")).click();
	}

}
