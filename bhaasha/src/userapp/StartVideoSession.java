package userapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartVideoSession {

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
	
		 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/div/ion-view/div[1]/div/div[2]/button").click();

		 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/ion-pane/ion-scroll/div/ul/li[2]").click();

		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > div > button").click();
	
		 c1.findElementByXPath("//input[@placeholder='Search']").sendKeys("9383");
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > ion-pane > div > div.slider-slides > ion-slide:nth-child(2) > div > ion-content > div > div.custom-sessions-list > ul > li > a > div.session-desc.session-list-desc.item.row").click();
	
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > div > ion-view > ion-content > div.scroll > div:nth-child(3) > div > div.col-80 > a").click();

		 c1.findElementByCssSelector("body > div.popup-container.popup-showing.active > div > div.popup-buttons > button").click();
	}

}
