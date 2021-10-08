package interpreterapp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FollowupSession {

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
		 
	//	 c1.findElementByCssSelector("body > div:nth-child(2) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > div.bar.bar-footer.bar-stable.custom-footer.dashboard-footer > div > a.tab-item.active").click();
		
		 c1.findElement(By.xpath("/html/body/div[2]/ion-nav-view/div/ion-nav-view[1]/ion-view/div[3]/div/a[3]")).click();

		 c1.findElement(By.cssSelector("#home-ion-content > div.scroll > div.custom-sessions-list.session-list > ul > div > li:nth-child(1) > a > div.session-desc.item.row")).click();
			
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > div > ion-view > div.bar.bar-footer.bar-stable.custom-detail-footer > div > a:nth-child(4)").click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-content > div.scroll > div:nth-child(2) > div > div").click();
		 
		 c1.findElementByCssSelector("body > div.popup-container.ion-datetime-picker-popup.popup-showing.active > div > div.popup-body > div > div:nth-child(6) > div:nth-child(6) > div").click();
		 
		 c1.findElementByCssSelector("body > div.popup-container.ion-datetime-picker-popup.popup-showing.active > div > div.popup-buttons > button.button.ng-binding.button-positive").click();
		 
		 Select dropdown1 = new Select(c1.findElement(By.name("duration")));
		 dropdown1.selectByValue("number:15");
		 
		// c1.findElement(By.xpath("//input[@placeholder='Comments']")).click();
			 
		 c1.findElementByXPath("/html/body/div[1]/ion-nav-view/div/ion-nav-view[1]/ion-view/form/ion-content/div[1]/div[6]/label[2]/textarea").sendKeys("bye");
			 
		 c1.findElementByCssSelector("body > div:nth-child(1) > ion-nav-view > div > ion-nav-view.left-bar.view-container > ion-view > form > ion-footer-bar > div").click();
		 
		 c1.findElementByCssSelector("body > div.popup-container.popup-showing.active > div > div.popup-buttons > button").click();
		 
	}

}
