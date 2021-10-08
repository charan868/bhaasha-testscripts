package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Viewsessions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathainterpreter");
		c1.findElement(By.id("password")).sendKeys("1234");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(4) > a").click();
	//	 c1.findElementByCssSelector("#folders > a:nth-child(3)").click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
/*		//view session
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[2]")).click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button.btn.btn-secondary.ng-binding").click();
	
		 //CANCELL SESSION
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		 c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[3]").click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button.btn.btn-primary.ng-binding").click();
	*/	 
		 
		 //EDIT SESSION
		
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[4]")).click();
		c1.findElement(By.name("totalSessionHour")).clear();
		c1.findElement(By.name("totalSessionHour")).sendKeys("1");
			c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button.btn.btn-primary.ng-binding").click();
	
		 //delete session
		 
		 c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[5]/i[1]").click();
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
		 
		 // change interpreter
		 
	c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[5]/i[3]").click();	 
	Select dropdown1 = new Select(c1.findElement(By.name("interpreter")));
	 dropdown1.selectByValue("1");
//		c1.findElementByXPath("/html/body/div[10]/div/div/div/div[2]/form/div[1]/div[2]/label/div/ins").click();
		c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > button.btn.btn-primary.ng-binding.ng-scope").click();
	
		 
		 // followup session
		 
	c1.findElementByXPath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[4]/i[2]").click();	 
		
	Select dropdown2 = new Select(c1.findElement(By.name("duration")));
	dropdown2.selectByValue("00:45:00");
	c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button.btn.btn-primary.ng-binding.ng-scope").click();
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
