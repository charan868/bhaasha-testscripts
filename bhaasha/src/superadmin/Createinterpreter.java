package superadmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;

public class Createinterpreter {

	public static void main(String[] args) throws InterruptedException {
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
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[3]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[3]/ul/li[1]/a"));
		 actions.moveToElement(subMenu).click();
		 actions.click().build().perform();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
				 WebElement ele = c1.findElement(By.cssSelector("#page-heading > div > button:nth-child(2)"));
				 JavascriptExecutor js = (JavascriptExecutor)c1;
				 js.executeScript("arguments[0].click()", ele);
				 
				 Select dropdown1 = new Select(c1.findElement(By.name("interpreterGroup")));
				 dropdown1.selectByVisibleText("boostint");
				 c1.findElement(By.name("userId")).sendKeys("boo2");
				 c1.findElement(By.name("repassword")).sendKeys("123");
				 c1.findElement(By.id("password")).sendKeys("123");
				 
		//		 c1.findElementByXPath("/html/body/div[9]/div/div/div[2]/form/div[3]/div[1]/div/span/div/ins").click();
				  Select dropdown2 = new Select(c1.findElement(By.name("languageOne_0")));
				 dropdown2.selectByVisibleText("English");
				 	 
				  Select dropdown3 = new Select(c1.findElement(By.name("level_0")));
			 dropdown3.selectByVisibleText("Expert");
				 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				 Select dropdown4 = new Select(c1.findElement(By.name("languageTwo0")));
					 dropdown4.selectByVisibleText("Azeri");
			  Select dropdown5 = new Select(c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.form-group.add-lang-fields.custom-add-lang > div > div.col-xs-2.ng-scope > select")));
					 dropdown5.selectByValue("1");
				
					 // c1.findElement(By.name("emailVerified")).click();
				 c1.findElement(By.name("priority")).clear();
				 c1.findElement(By.name("priority")).sendKeys("2");
			
				 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				 c1.findElement(By.name("firstName")).sendKeys("bumd");
				 c1.findElement(By.name("lastName")).sendKeys("use");
				 c1.findElement(By.name("email")).sendKeys("boo2@gmail.com");
				 c1.findElement(By.name("telephone")).clear();
				 c1.findElement(By.name("telephone")).sendKeys("4563977820");
				 c1.findElement(By.name("sessionCostPerMinVideo")).clear();
				 c1.findElement(By.name("sessionCostPerMinVideo")).sendKeys("200");
				 c1.findElement(By.name("sessionCostPerMinVoice")).clear();
				 c1.findElement(By.name("sessionCostPerMinVoice")).sendKeys("200");
				 c1.findElement(By.name("sessionCostPerHrInperson")).clear();
				 c1.findElement(By.name("sessionCostPerHrInperson")).sendKeys("200");
				 c1.findElement(By.name("sessionCostPerMinMediation")).clear();
				 c1.findElement(By.name("sessionCostPerMinMediation")).sendKeys("200");
				 c1.findElement(By.name("sessionCostperMinCourse")).clear();
				 c1.findElement(By.name("sessionCostperMinCourse")).sendKeys("200");
				 c1.findElement(By.name("minBillingSalaryVideo")).clear();
				 c1.findElement(By.name("minBillingSalaryVideo")).sendKeys("50");
				 c1.findElement(By.name("minBillingSalaryVoice")).clear();
				 c1.findElement(By.name("minBillingSalaryVoice")).sendKeys("50");
				 c1.findElement(By.name("minBillingSalaryInperson")).clear();
				 c1.findElement(By.name("minBillingSalaryInperson")).sendKeys("50");
				 c1.findElement(By.name("minBillingSalaryMediation")).clear();
				 c1.findElement(By.name("minBillingSalaryMediation")).sendKeys("50");
				 c1.findElement(By.name("minBillingSalaryCourse")).clear();
				 c1.findElement(By.name("minBillingSalaryCourse")).sendKeys("50");
				 c1.findElement(By.name("sessionTravelCost")).clear();
				 c1.findElement(By.name("sessionTravelCost")).sendKeys("50");
				 c1.findElement(By.name("billingTravelCost")).clear();
				 c1.findElement(By.name("billingTravelCost")).sendKeys("100");
				 
				 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(19) > div:nth-child(4) > label.toggle").click();
				 c1.findElement(By.xpath("//input[@type='submit']")).click();
				 
	}

}
