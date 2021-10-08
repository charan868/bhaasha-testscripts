package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class createInterpretergroup {

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

		 //add a new interpreter group
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement ele = c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[1]/div/button"));
		 JavascriptExecutor js = (JavascriptExecutor)c1;
		 js.executeScript("arguments[0].click()", ele);
		 
		 c1.findElement(By.name("grpname")).sendKeys("bootburd");
		 c1.findElement(By.name("firstName")).sendKeys("snow");
		 c1.findElement(By.name("lastName")).sendKeys("jn");
		 c1.findElement(By.name("email")).clear();
		 c1.findElement(By.name("email")).sendKeys("tds@gmail.com");
		 c1.findElement(By.name("userId")).clear();
		 c1.findElement(By.name("userId")).sendKeys("tdcom");
		 c1.findElement(By.name("repassword")).clear();
		 c1.findElement(By.name("repassword")).sendKeys("teds");
		 c1.findElement(By.name("password")).clear();
		 c1.findElement(By.name("password")).sendKeys("teds");
		 c1.findElement(By.name("address")).sendKeys("bezawada");
		 c1.findElement(By.name("city")).sendKeys("vijayawada");
		 c1.findElement(By.name("zipcode")).sendKeys("520301");
		 c1.findElement(By.name("telephone")).clear();
		 c1.findElement(By.name("telephone")).sendKeys("8443100000");
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
		 c1.findElement(By.name("minTravelDuration")).clear();
		 c1.findElement(By.name("minTravelDuration")).sendKeys("25");
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
		 c1.findElementByXPath("/html/body/div[5]/div/div/div[2]/form/div[15]/div/div/div/label[1]/div/ins").click();
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
		 c1.findElement(By.name("urgentThresholdInHr")).clear();
		 c1.findElement(By.name("urgentThresholdInHr")).sendKeys("23");
		 c1.findElement(By.name("urgentThresholdInMin")).clear();
		 c1.findElement(By.name("urgentThresholdInMin")).sendKeys("15");
		 
		 c1.findElement(By.name("urgentCostInPercentInperson")).clear();
		 c1.findElement(By.name("urgentCostInPercentInperson")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentCostInPercentInperson")).clear();
		 c1.findElement(By.name("remainingUrgentCostInPercentInperson")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentVoice")).clear();
		 c1.findElement(By.name("urgentCostInPercentVoice")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentCostInPercentVoice")).clear();
		 c1.findElement(By.name("remainingUrgentCostInPercentVoice")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentVideo")).clear();
		 c1.findElement(By.name("urgentCostInPercentVideo")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentCostInPercentVideo")).clear();
		 c1.findElement(By.name("remainingUrgentCostInPercentVideo")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentMediation")).clear();
		 c1.findElement(By.name("urgentCostInPercentMediation")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentCostInPercentMediation")).clear();
		 c1.findElement(By.name("remainingUrgentCostInPercentMediation")).sendKeys("15");
		 c1.findElement(By.name("urgentCostInPercentCourse")).clear();
		 c1.findElement(By.name("urgentCostInPercentCourse")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentCostInPercentCourse")).clear();
		 c1.findElement(By.name("remainingUrgentCostInPercentCourse")).sendKeys("15");
		 
		 c1.findElement(By.name("urgentSalaryInPercentInperson")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentInperson")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentSalaryInPercentInperson")).clear();
		 c1.findElement(By.name("remainingUrgentSalaryInPercentInperson")).sendKeys("15");
		  
		 c1.findElement(By.name("urgentSalaryInPercentVoice")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentVoice")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentSalaryInPercentVoice")).clear();
		 c1.findElement(By.name("remainingUrgentSalaryInPercentVoice")).sendKeys("15");
		  
		 c1.findElement(By.name("urgentSalaryInPercentVideo")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentVideo")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentSalaryInPercentVideo")).clear();
		 c1.findElement(By.name("remainingUrgentSalaryInPercentVideo")).sendKeys("15");
		 
		 c1.findElement(By.name("urgentSalaryInPercentMediation")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentMediation")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentSalaryInPercentMediation")).clear();
		 c1.findElement(By.name("remainingUrgentSalaryInPercentMediation")).sendKeys("15");
		 
		 c1.findElement(By.name("urgentSalaryInPercentCourse")).clear();
		 c1.findElement(By.name("urgentSalaryInPercentCourse")).sendKeys("15");
		 
		 c1.findElement(By.name("remainingUrgentSalaryInPercentCourse")).clear();
		 c1.findElement(By.name("remainingUrgentSalaryInPercentCourse")).sendKeys("15");
		  
		 Select dropdown7 = new Select(c1.findElement(By.name("weekendStartDay")));
		 dropdown7.selectByValue("6");
		 Select dropdown8 = new Select(c1.findElement(By.name("weekendEndDay")));
		 dropdown8.selectByValue("8");
		 
		 c1.findElement(By.name("weekendFromTimeInHr")).clear();
		 c1.findElement(By.name("weekendFromTimeInHr")).sendKeys("8");
		 c1.findElement(By.name("weekendToTimeInHr")).clear();
		 c1.findElement(By.name("weekendToTimeInHr")).sendKeys("8");
		 c1.findElement(By.name("weekendCostInPercent")).clear();
		 c1.findElement(By.name("weekendCostInPercent")).sendKeys("26");
		 c1.findElement(By.name("nightFromTimeInHr")).clear();
		 c1.findElement(By.name("nightFromTimeInHr")).sendKeys("23");
		 c1.findElement(By.name("nightToTimeInHr")).clear();
		 c1.findElement(By.name("nightToTimeInHr")).sendKeys("8");
		 c1.findElement(By.name("nightCostInPercent")).clear();
		 c1.findElement(By.name("nightCostInPercent")).sendKeys("26");
		 c1.findElement(By.name("cancellationThresholdinHour")).clear();
		 c1.findElement(By.name("cancellationThresholdinHour")).sendKeys("23");
		 c1.findElement(By.name("cancelDurationCost")).click();
		 
		 c1.findElement(By.id("costForUnusedTimeInPercent")).click();
		 c1.findElement(By.name("unusedBilledAmount")).clear();
		 c1.findElement(By.name("unusedBilledAmount")).sendKeys("20");
		 c1.findElement(By.name("unusedSalaryAmount")).clear();
		 c1.findElement(By.name("unusedSalaryAmount")).sendKeys("20");
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(43) > div:nth-child(1) > div.row.ng-scope > div:nth-child(1) > div > ins").click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(43) > div:nth-child(1) > div.row.ng-scope > div:nth-child(2) > div > ins").click();
		c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(43) > div:nth-child(1) > div.row.ng-scope > div:nth-child(3) > div > ins").click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(43) > div:nth-child(1) > div.row.ng-scope > div.col-sm-6 > div > ins").click();
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(43) > div:nth-child(1) > div.row.ng-scope > div:nth-child(4) > div > ins").click();
/*	 c1.findElement(By.name("enableUnusedCostForInPerson")).click();
		 c1.findElement(By.name("enableUnusedCostForTelephone")).click();
		 c1.findElement(By.name("enableUnusedCostForVideo")).click();
		 c1.findElement(By.name("enableUnusedCostForMediation")).click();
		 c1.findElement(By.name("enableUnusedCostForCourse")).click();		
		 c1.findElement(By.name("enableSwissSalary")).click();
		 c1.findElement(By.name("isShowMyCompanyExport")).click();	
	
		 JavascriptExecutor js1 = (JavascriptExecutor)c1;
		 WebElement element = c1.findElement(By.xpath("//input[@type='submit']"));
		 js1.executeScript("arguments[0],scrollIntoView();",element);
		 actions.click().build().perform();	
		*/
		 c1.findElementByCssSelector("body > div.modal.fade.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div.modal-footer > button:nth-child(1)").click();
		 c1.findElement(By.xpath("//input[@type='submit']")).click();
		 
		 
	/*	 //view interpreter group
		 c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div[2]/div[1]/div[2]/panel/div/div[2]/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/a[1]")).click();
		 JavascriptExecutor js = (JavascriptExecutor)c1;
		 WebElement element = c1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/form/div[61]/button[3]"));
		 js.executeScript("arguments[0],scrollIntoView();",element);
		 actions.click().build().perform();
		 c1.findElement(By.cssSelector("#\\31 597049127580-0-uiGrid-00TD-cell > a:nth-child(1)")).click();
		 c1.findElement(By.xpath("//*[@id=\"1597049127580-0-uiGrid-00TD-cell\"]/a[1]")).click();
c1.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/form/div[61]/button[3]")).click();
		
		*/
	}

}
