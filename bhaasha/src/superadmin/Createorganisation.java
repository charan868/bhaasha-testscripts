package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createorganisation {

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
        c1.findElement(By.xpath("//*[@id=\"page-heading\"]/div/button")).click();
        c1.findElement(By.id("organizationName")).sendKeys("oppo");
   //     c1.findElement(By.id("domainName")).sendKeys("domain.com");
        c1.findElement(By.id("firstName")).sendKeys("vi");
        c1.findElement(By.id("lastName")).sendKeys("ppo");
        c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        c1.findElement(By.id("email")).sendKeys("13a2@yopmaboyil.com");
       c1.findElement(By.name("userId")).click();
        c1.findElement(By.name("userId")).sendKeys("vippo");
        c1.findElement(By.id("confirmpassword")).sendKeys("abc123");
    
        c1.findElement(By.id("password")).sendKeys("abc123");
        c1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        c1.findElement(By.id("city")).sendKeys("hyderabad");
        c1.findElement(By.id("zipcode")).sendKeys("77777");
      //  c1.findElement(By.id("telephone")).sendKeys("4562589874");
       Select dropdown1 = new Select(c1.findElement(By.id("origin")));
       
       c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(1) > div > span > div > ins").click();
       c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(2) > div > span > div > ins").click();
       c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(3) > div > span > div > ins").click();
       c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(4) > div > span > div > ins").click();
        c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        dropdown1.selectByIndex(3);
        c1.findElement(By.xpath("/html/body/div[5]/div/div/div[3]/button[1]")).click();
	}

}
