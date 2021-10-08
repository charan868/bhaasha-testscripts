package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Updateinterpreter {

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
		 WebElement mainMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[3]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("//*[@id=\"top-nav\"]/li[3]/ul/li[1]/a/span[1]"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();
		 
		// c1.findElement(By.xpath("//*[@id=\"1597030760176-0-uiGrid-019Y-cell\"]/a[3]")).click();
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div/panel/div/div[2]/div/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[3]")).click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Select dropdown1 = new Select(c1.findElement(By.name("interpreterGroup")));
		 dropdown1.selectByValue("1");
		 c1.findElement(By.name("userId")).sendKeys("1");
		// c1.findElement(By.name("emailVerified")).click();
		 c1.findElement(By.name("priority")).clear();
		 c1.findElement(By.name("priority")).sendKeys("2");
		// c1.findElement(By.xpath("//input[@class='addLanguage ng-binding']")).click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// c1.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[5]/a")).click();
		 c1.findElement(By.name("firstName")).sendKeys("2");
		 c1.findElement(By.name("lastName")).sendKeys("use");
		 c1.findElement(By.name("telephone")).clear();
		 c1.findElement(By.name("telephone")).sendKeys("4563987820");
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
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// c1.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/form/div[19]/div[5]/label[2]/div")).click();
		 c1.findElement(By.cssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-footer.ng-scope > input:nth-child(2)")).click();
		 
		 

		 
		 
		 
	}

}
