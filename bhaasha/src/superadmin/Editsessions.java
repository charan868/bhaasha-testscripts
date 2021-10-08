package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editsessions {

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
		
		c1.findElementByCssSelector("#folders > a:nth-child(3)").click();
		
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	c1.findElementByCssSelector("#\\31 597731144528-0-uiGrid-02YO-cell > a > i.fa.fa-fw.fa-edit.m5.ng-scope").click();
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a/i[2]")).click();
		c1.findElement(By.name("totalSessionMin")).click();
		c1.findElement(By.name("totalSessionMin")).clear();
		c1.findElement(By.name("totalSessionMin")).sendKeys("45");
		c1.findElement(By.name("createdHour")).click();
		c1.findElement(By.name("bookingHour")).click();
		c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button.btn.btn-primary.ng-binding.ng-scope").click();
		
		
	}

}
