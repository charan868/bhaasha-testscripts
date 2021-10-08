package interpreterapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Feedbackoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://appbootstaging.bhaasha.ch/#/");
	c1.findElement(By.xpath("/html/body/div[1]/ion-nav-view/ion-view/ion-content/div[1]/div[4]/button[1]")).click();
		c1.findElement(By.name("email")).sendKeys("mamathainterpreter2");
		c1.findElement(By.name("password")).sendKeys("123");
		c1.findElement(By.cssSelector("body > div:nth-child(1) > ion-nav-view > ion-view > ion-content > div.scroll > div:nth-child(3) > div > form > div.btn-login > button")).click();
		 
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > div.bar.bar-header.bar-stable.dashboard-header > a").click();
		 
		 c1.findElement(By.name("message")).sendKeys("hello");
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > div > ion-view > form > ion-content > div.scroll > div.mid-content.user-support-mid-content.text-center > a.button.button-block.theme-btn.text-left.support-submit.text-center").click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
