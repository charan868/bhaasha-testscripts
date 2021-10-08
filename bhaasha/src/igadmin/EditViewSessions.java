package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditViewSessions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\selenium java\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://admin.staging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathainterpreter");
		c1.findElement(By.id("password")).sendKeys("1234");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(4) > a").click();
		 c1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("#folders > a:nth-child(3)").click();

		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div[1]/div/div/a[2]/i")).click();
	
		 c1.findElement(By.cssSelector("#body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button:nth-child(2)")).click();
		
		 Select dropdown1 = new Select(c1.findElement(By.name("sessionType")));
		 dropdown1.selectByValue("INTERCULTURALMEDIATION");
		
		 Select dropdown2 = new Select(c1.findElement(By.name("duration")));
		 dropdown2.selectByValue("30");
		
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div:nth-child(1) > div.modal-body > form > div:nth-child(1) > div:nth-child(9) > input").click();
		 c1.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		 
		 c1.findElementByCssSelector("body > div:nth-child(14) > div > div > div.modal-footer.location-map-footer.row.ng-scope > div.col-xs-5.col-sm-4.col-md-3.text-right > button:nth-child(3)").click();
		 
		 c1.findElement(By.name("personInvolvedInConversation")).sendKeys("test");
		 c1.findElement(By.name("otherInvolvedPositions")).sendKeys("test");
		 c1.findElement(By.name("reasonForConversation")).sendKeys("test");
		 c1.findElement(By.name("goalOfConversation")).sendKeys("test");
		 c1.findElement(By.name("expectationOfMediation")).sendKeys("test");
		 
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > button.btn.btn-primary.ng-binding").click();
		 
		
		
	}

}
