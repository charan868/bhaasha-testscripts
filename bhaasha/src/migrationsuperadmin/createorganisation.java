package migrationsuperadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createorganisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://localhost:4200/");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/form/div[1]/span/button[1]")).click();
		c1.findElement(By.xpath("//input[@placeholder='userName']")).sendKeys("admin");
		c1.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/form/div[2]/button[1]")).click();

		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        c1.findElement(By.cssSelector("body > app-root > horizontal-layout > div > main > div > app-organization > div > div > button")).click();
        c1.findElement(By.xpath("//input[@placeholder='Organisation']")).sendKeys("oppo");
   //     c1.findElement(By.id("domainName")).sendKeys("domain.com");
        c1.findElement(By.xpath("//input[@placeholder='firstName']")).sendKeys("vi");
        c1.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("ppo");
        c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        c1.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("13a2@yopmaboyil.com");
       c1.findElement(By.xpath("//input[@placeholder='User Id']")).click();
        c1.findElement(By.xpath("//input[@placeholder='User Id']")).sendKeys("vippo");
        c1.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
    
        c1.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");
        c1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        c1.findElement(By.xpath("//input[@placeholder='City']")).sendKeys("hyderabad");
        c1.findElement(By.xpath("//input[@placeholder='Postal Code']")).sendKeys("77777");
      //  c1.findElement(By.id("telephone")).sendKeys("4562589874");
       Select dropdown1 = new Select(c1.findElement(By.name("country")));
       
    //   c1.findElementByXPath("/html/body/tc-modal/div[2]/div/div[2]/form/div[2]/div[6]/div/div/tc-form-group/tc-select/div[2]/div/div[1]").click();
  //     c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(2) > div > span > div > ins").click();
  //     c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(3) > div > span > div > ins").click();
  //     c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(10) > div:nth-child(4) > div > span > div > ins").click();
        c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
        dropdown1.selectByIndex(3);
        c1.findElement(By.xpath("/html/body/tc-modal/div[2]/div/div[3]/div/button[2]")).click();
	}
	}


