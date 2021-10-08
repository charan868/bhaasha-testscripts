package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Addnewinterpreter {

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
		 
		 c1.findElementByCssSelector("#top-nav > li:nth-child(2) > a").click();
		 c1.findElementByCssSelector("#page-heading > div > button:nth-child(3)").click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c1.findElement(By.name("userId")).clear();
		 c1.findElement(By.name("userId")).sendKeys("ntbausr");
		
		 c1.findElement(By.name("repassword")).sendKeys("charan86");
		 c1.findElement(By.id("password")).sendKeys("charan86");
		 c1.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		 
//		 c1.findElementByClassName("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-body > form > div:nth-child(3) > div > div > span > div > input").click();
		 
		 c1.findElement(By.name("firstName")).sendKeys("notaser");
		 c1.findElement(By.name("email")).sendKeys("unu@yop.com");
		 c1.findElement(By.id("telephoneCountryCode")).sendKeys("+91");
		 c1.findElement(By.name("telephone")).sendKeys("8576892534");
		 Select dropdown1 = new Select(c1.findElement(By.name("languageOne_0")));
		 dropdown1.selectByVisibleText("English");
		 Select dropdown2 = new Select(c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-body > form > div.form-group.add-lang-fields.custom-add-lang > div > div.col-xs-3.ng-scope > select")));
		 dropdown2.selectByValue("5");
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
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-body > form > div:nth-child(23) > div:nth-child(4) > label.toggle").click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-body > form > div:nth-child(23) > div:nth-child(5) > label.toggle").click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div > div.modal-footer > input:nth-child(2)").click();
		 
		 
	}

}
