package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Updateinterpretergroup {

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
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[4]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[4]/ul/li[2]/a/span[1]"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();
		 
/*		 			// view interpreter group
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]/i")).click();
		 JavascriptExecutor js = (JavascriptExecutor)c1;
		 WebElement element =  c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer > button:nth-child(3)"));
		 js.executeScript("arguments[0].scrollIntoView();", element);
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer > button:nth-child(3)").click();
		
		*/
		 
	    //update interpreter group	 
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[2]")).click();
		 //c1.findElement(By.xpath("//*[@id=\"1597049127580-0-uiGrid-00TD-cell\"]/a[2]")).click();
		// c1.findElement(By.cssSelector("#\\31 597049127580-0-uiGrid-00TD-cell > a:nth-child(2)")).click();
		// c1.findElementByCssSelector("#\\31 597049127580-0-uiGrid-00TD-cell > a:nth-child(2)").click();
		 c1.findElement(By.name("grpname")).sendKeys("5");
		 c1.findElement(By.name("firstName")).sendKeys("s");
		 c1.findElement(By.name("lastName")).sendKeys("s");
		 c1.findElement(By.name("email")).clear();
		 c1.findElement(By.name("email")).sendKeys("tess@gmail.com");
		 c1.findElement(By.name("address")).sendKeys("s");
		 c1.findElement(By.name("city")).sendKeys("s");
		 c1.findElement(By.name("zipcode")).sendKeys("8");
		 c1.findElement(By.name("telephone")).clear();
		 c1.findElement(By.name("telephone")).sendKeys("8546200142");
		 Select dropdown1 = new Select(c1.findElement(By.name("origin")));
		 dropdown1.selectByIndex(10);
		 c1.findElement(By.name("costPerHrInperson")).clear();
		 c1.findElement(By.name("costPerHrInperson")).sendKeys("200");
		 c1.findElement(By.name("costPerMinTelephone")).clear();
		 c1.findElement(By.name("costPerMinTelephone")).sendKeys("200");
		 c1.findElement(By.name("costPerMinVideo")).clear();
		 c1.findElement(By.name("costPerMinVideo")).sendKeys("200");
		 c1.findElement(By.name("costPerHrMediation")).clear();
		 c1.findElement(By.name("costPerHrMediation")).sendKeys("200");
		 c1.findElement(By.name("costPerHrCourse")).clear();
		 c1.findElement(By.name("costPerHrCourse")).sendKeys("200");
		 c1.findElement(By.name("minBillingTimeInMinInperson")).clear();
		 c1.findElement(By.name("minBillingTimeInMinInperson")).sendKeys("15");
		 c1.findElement(By.name("minBillingTimeInMinVoice")).clear();
		 c1.findElement(By.name("minBillingTimeInMinVoice")).sendKeys("15");
		 c1.findElement(By.name("minBillingTimeInMinVideo")).clear();
		 c1.findElement(By.name("minBillingTimeInMinVideo")).sendKeys("15");
		 c1.findElement(By.name("minBillingTimeInMinMediation")).clear();
		 c1.findElement(By.name("minBillingTimeInMinMediation")).sendKeys("15");
		 c1.findElement(By.name("minBillingTimeInMinCourse")).clear();
		 c1.findElement(By.name("minBillingTimeInMinCourse")).sendKeys("15");
		 c1.findElement(By.name("minBillingCostInperson")).clear();
		 c1.findElement(By.name("minBillingCostInperson")).sendKeys("20");
		 c1.findElement(By.name("minBillingCostVoice")).clear();
		 c1.findElement(By.name("minBillingCostVoice")).sendKeys("20");
		 c1.findElement(By.name("minBillingCostVideo")).clear();
		 c1.findElement(By.name("minBillingCostVideo")).sendKeys("20");
		 c1.findElement(By.name("minBillingCostMediation")).clear();
		 c1.findElement(By.name("minBillingCostMediation")).sendKeys("20");
		 c1.findElement(By.name("minBillingCostCourse")).clear();
		 c1.findElement(By.name("minBillingCostCourse")).sendKeys("20");
		 Select dropdown2 = new Select(c1.findElement(By.name("roundOffTimeInMinInPerson")));
		 dropdown2.selectByIndex(1);
		 Select dropdown3 = new Select(c1.findElement(By.name("roundOffTimeInMinVoice")));
		 dropdown3.selectByIndex(1);
		 Select dropdown4 = new Select(c1.findElement(By.name("roundOffTimeInMinVideo")));
		 dropdown4.selectByIndex(1);
		 Select dropdown5 = new Select(c1.findElement(By.name("roundOffTimeInMinMediation")));
		 dropdown5.selectByIndex(1);
		 Select dropdown6 = new Select(c1.findElement(By.name("roundOffTimeInMinCourse")));
		 dropdown6.selectByIndex(1);
		 c1.findElement(By.name("urgentCostInPercentInperson")).clear();
		 c1.findElement(By.name("urgentCostInPercentInperson")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentVoice")).clear();
		 c1.findElement(By.name("urgentCostInPercentVoice")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentVideo")).clear();
		 c1.findElement(By.name("urgentCostInPercentVideo")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentMediation")).clear();
		 c1.findElement(By.name("urgentCostInPercentMediation")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentCourse")).clear();
		 c1.findElement(By.name("urgentCostInPercentCourse")).sendKeys("15");
		 c1.findElement(By.name("urgentSalaryInPercentInperson")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentInperson")).sendKeys("15");
		 c1.findElement(By.name("urgentSalaryInPercentVoice")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentVoice")).sendKeys("15");
		 c1.findElement(By.name("urgentSalaryInPercentVideo")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentVideo")).sendKeys("15");
		 c1.findElement(By.name("urgentSalaryInPercentMediation")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentMediation")).sendKeys("15");
		 c1.findElement(By.name("urgentSalaryInPercentCourse")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentCourse")).sendKeys("15");
		 c1.findElement(By.name("weekendFromTimeInHr")).clear();
		 c1.findElement(By.name("weekendFromTimeInHr")).sendKeys("8");
		 c1.findElement(By.name("weekendToTimeInHr")).clear();
		 c1.findElement(By.name("weekendToTimeInHr")).sendKeys("8");
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 JavascriptExecutor js1 = (JavascriptExecutor)c1;
				 WebElement element =  c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer > button:nth-child(2)"));
				 js1.executeScript("arguments[0].scrollIntoView();", element);
		 c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer > button:nth-child(2)")).click();
		 
		 
		 //delete interpreter group
		 
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[3]/i")).click();
		 c1.findElementByCssSelector("body > div.bootbox.modal.fade.bootbox-confirm.in > div > div > div.modal-footer > button.btn.btn-primary").click();
		 
		 
	
	
	}

}
