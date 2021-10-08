package userapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class history {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://pmubootstaging.bhaasha.ch/#/");
	c1.findElement(By.xpath("/html/body/div[1]/ion-nav-view/ion-view/ion-content/div[1]/div[4]/button[1]")).click();
		c1.findElement(By.name("email")).sendKeys("mamathauser");
		c1.findElement(By.name("password")).sendKeys("123");
		c1.findElement(By.cssSelector("body > div:nth-child(1) > ion-nav-view > ion-view > ion-content > div.scroll > div:nth-child(3) > div > form > div.btn-login > button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > div > ion-view > div.bar.bar-footer.custom-footer.dashboard-footer > div > div:nth-child(1) > button").click();
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > div > button").click();
		 
		 c1.findElement(By.xpath("//input[@placeholder='Session Id']")).sendKeys("7579");
		 
		c1.findElementByXPath("/html/body/div[5]/div[2]/ion-modal-view/ion-content/div[1]/div/form/div[5]/div/sc-select/div[2]/div/div/ul/li/ul/li/div").click();
		 
		 c1.findElementByCssSelector("#userMessagesView > div.bar.bar-footer.bar-stable.custom-footer > div > a:nth-child(1)").click();
		 
	/*	 
		 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/ion-content/div/div/ul/li[1]/a/div[2]").click();
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > div > ion-view > div.bar.bar-footer.pr0.pl0.custom-footer > div > a:nth-child(2)").click();
	
		 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/div[1]/div/ion-content/div/ul/li[4]").click();
			
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-content > div > div:nth-child(7) > div > sc-select > div:nth-child(2) > div").click();
		 
		 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/form/ion-content/div/div[7]/div/sc-select/div[2]/div/div/ul/li/ul/li[4]/div").click();
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-footer-bar > div").click();
		 
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("body > div.modal-backdrop.active > div.modal-wrapper > ion-modal-view > ion-view > ion-content > div.scroll > div > div.custom-sessions-list.session-btn > a").click();
	
		 
		 */
	}

}
