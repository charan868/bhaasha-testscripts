package userapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class interpreters {

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
	
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > div > ion-view > div.bar.bar-footer.custom-footer.dashboard-footer > div > div:nth-child(3) > button").click();

	c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > ion-content > div.scroll > div > div:nth-child(2) > div.col.col-33.popular > button").click();
	
	c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > ion-content > div.scroll > div > ul > li > a").click();
	
	c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/div[2]/div/a[3]").click();
		c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

 
//	 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > div.bar.bar-footer.pr0.pl0.custom-footer > div > a:nth-child(4)").click();
	 
	 c1.findElementByCssSelector("#schedule-session-New > div > ul > li:nth-child(4)").click();
	 
	 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-content > div > div:nth-child(3) > div > sc-select > div:nth-child(2) > div > a").click();
	 
	 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/form/ion-content/div/div[3]/div/sc-select/div[2]/div/div/ul/li/ul/li[2]/div").click();
	 
	 
	 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-content > div > div:nth-child(4) > div > label.item-input > input").sendKeys("tst");

	 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-content > div > div:nth-child(7) > div > sc-select > div:nth-child(2) > div").click();
	 
	 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/form/ion-content/div/div[7]/div/sc-select/div[2]/div/div/ul/li/ul/li[4]/div").click();
	 
	 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-footer-bar > div").click();
	 
	 c1.findElementByCssSelector("body > div.modal-backdrop.active > div.modal-wrapper > ion-modal-view > ion-view > ion-content > div.scroll > div > div.custom-sessions-list.session-btn > a").click();
	 
	
	
	}

}
