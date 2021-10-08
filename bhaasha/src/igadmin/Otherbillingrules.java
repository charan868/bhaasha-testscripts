package igadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Otherbillingrules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("https://adminbootstaging.bhaasha.ch/#/");
		c1.findElement(By.cssSelector("#wrap > div > div > div > div.change-language-header.new-change-language-header > button:nth-child(1)")).click();
		c1.findElement(By.id("username")).sendKeys("mamathainterpreter");
		c1.findElement(By.id("password")).sendKeys("1234");
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.cssSelector("#top-nav > li.ng-scope.hasChild > a"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.cssSelector("#top-nav > li.ng-scope.hasChild > ul > li:nth-child(2) > a > span:nth-child(1)"));
		 actions.moveToElement(subMenu);
		 actions.click().build().perform();

		 //NEW TEMPLATE
		 
		 
		 c1.findElementByCssSelector("#page-heading > div > div > button").click();
		 c1.findElementByName("templateName").click();
		 c1.findElementByName("templateName").sendKeys("orange1");
		 c1.findElementByName("costPerHrInperson").clear();
		 c1.findElementByName("costPerHrInperson").sendKeys("20");
		 c1.findElementByName("costPerMinTelephone").clear();
		 c1.findElementByName("costPerMinTelephone").sendKeys("20");
		 c1.findElementByName("costPerMinVideo").clear();
		 c1.findElementByName("costPerMinVideo").sendKeys("20");
		 c1.findElementByName("costPerHrMediation").clear();
		 c1.findElementByName("costPerHrMediation").sendKeys("20");
		 c1.findElementByName("costPerHrCourse").clear();
		 c1.findElementByName("costPerHrCourse").sendKeys("20");
		 c1.findElementByName("minBillingTimeInMinInperson").clear();
		 c1.findElementByName("minBillingTimeInMinInperson").sendKeys("20");
		 c1.findElementByName("minBillingTimeInMinVoice").clear();
		 c1.findElementByName("minBillingTimeInMinVoice").sendKeys("20");
		 c1.findElementByName("minBillingTimeInMinVideo").clear();
		 c1.findElementByName("minBillingTimeInMinVideo").sendKeys("20");
		 c1.findElementByName("minBillingTimeInMinMediation").clear();
		 c1.findElementByName("minBillingTimeInMinMediation").sendKeys("20");
	
		 c1.findElementByName("minBillingTimeInMinCourse").clear();
		 c1.findElementByName("minBillingTimeInMinCourse").sendKeys("20");
		 c1.findElementByName("minBillingCostInperson").clear();
		 c1.findElementByName("minBillingCostInperson").sendKeys("20");
		 c1.findElementByName("minBillingCostVoice").clear();
		 c1.findElementByName("minBillingCostVoice").sendKeys("20");
		 c1.findElementByName("minBillingCostVideo").clear();
		 c1.findElementByName("minBillingCostVideo").sendKeys("20");
		 c1.findElementByName("minBillingCostMediation").clear();
		 c1.findElementByName("minBillingCostMediation").sendKeys("20");
		 c1.findElementByName("minBillingCostCourse").clear();
		 c1.findElementByName("minBillingCostCourse").sendKeys("20");
		 Select dropdown2 = new Select(c1.findElement(By.name("roundOffTimeInMinInPerson")));
		 dropdown2.selectByVisibleText("15 Min.");
		 Select dropdown3 = new Select(c1.findElement(By.name("roundOffTimeInMinVoice")));
		 dropdown3.selectByVisibleText("15 Min.");
		 Select dropdown4 = new Select(c1.findElement(By.name("roundOffTimeInMinVideo")));
		 dropdown4.selectByVisibleText("15 Min.");
		 Select dropdown5 = new Select(c1.findElement(By.name("roundOffTimeInMinMediation")));
		 dropdown5.selectByVisibleText("15 Min.");
		 Select dropdown6 = new Select(c1.findElement(By.name("roundOffTimeInMinCourse")));
		 dropdown6.selectByVisibleText("15 Min.");
		 c1.findElementByName("minTravelDuration").click();
		 c1.findElementByName("minTravelDuration").sendKeys("15");
		 c1.findElementByName("urgentThresholdInHr").click();
		 c1.findElementByName("urgentThresholdInHr").clear();
		 c1.findElementByName("urgentThresholdInHr").sendKeys("24");
		 
	
		 c1.findElementByName("urgentCostInPercentInperson").click();
		 c1.findElementByName("urgentCostInPercentInperson").clear();
		 c1.findElementByName("urgentCostInPercentInperson").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentCostInPercentInperson").click();
		 c1.findElementByName("remainingUrgentCostInPercentInperson").clear();
		 c1.findElementByName("remainingUrgentCostInPercentInperson").sendKeys("24");
	
		 c1.findElementByName("urgentCostInPercentVoice").click();
		 c1.findElementByName("urgentCostInPercentVoice").clear();
		 c1.findElementByName("urgentCostInPercentVoice").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentCostInPercentVoice").click();
		 c1.findElementByName("remainingUrgentCostInPercentVoice").clear();
		 c1.findElementByName("remainingUrgentCostInPercentVoice").sendKeys("24");
	
		 c1.findElementByName("urgentCostInPercentVideo").click();
		 c1.findElementByName("urgentCostInPercentVideo").clear();
		 c1.findElementByName("urgentCostInPercentVideo").sendKeys("24");
	
	
		 c1.findElementByName("remainingUrgentCostInPercentVideo").click();
		 c1.findElementByName("remainingUrgentCostInPercentVideo").clear();
		 c1.findElementByName("remainingUrgentCostInPercentVideo").sendKeys("24");
	
		 c1.findElementByName("urgentCostInPercentMediation").click();
		 c1.findElementByName("urgentCostInPercentMediation").clear();
		 c1.findElementByName("urgentCostInPercentMediation").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentCostInPercentMediation").click();
		 c1.findElementByName("remainingUrgentCostInPercentMediation").clear();
		 c1.findElementByName("remainingUrgentCostInPercentMediation").sendKeys("24");
	
		 c1.findElementByName("urgentCostInPercentCourse").click();
		 c1.findElementByName("urgentCostInPercentCourse").clear();
		 c1.findElementByName("urgentCostInPercentCourse").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentCostInPercentCourse").click();
		 c1.findElementByName("remainingUrgentCostInPercentCourse").clear();
		 c1.findElementByName("remainingUrgentCostInPercentCourse").sendKeys("24");
	
		 c1.findElementByName("urgentSalaryInPercentInperson").click();
		 c1.findElementByName("urgentSalaryInPercentInperson").clear();
		 c1.findElementByName("urgentSalaryInPercentInperson").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentSalaryInPercentInperson").click();
		 c1.findElementByName("remainingUrgentSalaryInPercentInperson").clear();
		 c1.findElementByName("remainingUrgentSalaryInPercentInperson").sendKeys("24");
	
		 c1.findElementByName("urgentSalaryInPercentVoice").click();
		 c1.findElementByName("urgentSalaryInPercentVoice").clear();
		 c1.findElementByName("urgentSalaryInPercentVoice").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentSalaryInPercentVoice").click();
		 c1.findElementByName("remainingUrgentSalaryInPercentVoice").clear();
		 c1.findElementByName("remainingUrgentSalaryInPercentVoice").sendKeys("24");
	
		 c1.findElementByName("urgentSalaryInPercentVideo").click();
		 c1.findElementByName("urgentSalaryInPercentVideo").clear();
		 c1.findElementByName("urgentSalaryInPercentVideo").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentSalaryInPercentVideo").click();
		 c1.findElementByName("remainingUrgentSalaryInPercentVideo").clear();
		 c1.findElementByName("remainingUrgentSalaryInPercentVideo").sendKeys("24");
	
		 c1.findElementByName("urgentSalaryInPercentMediation").click();
		 c1.findElementByName("urgentSalaryInPercentMediation").clear();
		 c1.findElementByName("urgentSalaryInPercentMediation").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentSalaryInPercentMediation").click();
		 c1.findElementByName("remainingUrgentSalaryInPercentMediation").clear();
		 c1.findElementByName("remainingUrgentSalaryInPercentMediation").sendKeys("24");
	
		 c1.findElementByName("urgentSalaryInPercentCourse").click();
		 c1.findElementByName("urgentSalaryInPercentCourse").clear();
		 c1.findElementByName("urgentSalaryInPercentCourse").sendKeys("24");
	
		 c1.findElementByName("remainingUrgentSalaryInPercentCourse").click();
		 c1.findElementByName("remainingUrgentSalaryInPercentCourse").clear();
		 c1.findElementByName("remainingUrgentSalaryInPercentCourse").sendKeys("24");
	
		 Select dropdown7 = new Select(c1.findElement(By.name("weekendStartDay")));
		 dropdown7.selectByVisibleText("Saturday");
	c1.findElementByName("weekendFromTimeInHr").sendKeys("20");
	Select dropdown8 = new Select(c1.findElement(By.name("weekendEndDay")));
		 dropdown8.selectByVisibleText("Monday");
	c1.findElementByName("weekendToTimeInHr").sendKeys("7");
	c1.findElementByName("weekendCostInPercent").click();
	c1.findElementByName("weekendCostInPercent").clear();
	c1.findElementByName("weekendCostInPercent").sendKeys("24");
	
	c1.findElementByName("nightFromTimeInHr").click();
	c1.findElementByName("nightFromTimeInHr").clear();
	c1.findElementByName("nightFromTimeInHr").sendKeys("22");
	
	c1.findElementByName("nightToTimeInHr").click();
	c1.findElementByName("nightToTimeInHr").clear();
    c1.findElementByName("nightToTimeInHr").sendKeys("7");
	
	c1.findElementByName("nightCostInPercent").click();
	c1.findElementByName("nightCostInPercent").clear();
	c1.findElementByName("nightCostInPercent").sendKeys("24");
	
	c1.findElementByName("cancellationThresholdinHour").click();
	c1.findElementByName("cancellationThresholdinHour").clear();
	c1.findElementByName("cancellationThresholdinHour").sendKeys("23");
	
	c1.findElementByName("unusedBilledAmount").click();
	c1.findElementByName("unusedBilledAmount").clear();
	c1.findElementByName("unusedBilledAmount").sendKeys("20");
	
	c1.findElementByName("unusedSalaryAmount").click();
	c1.findElementByName("unusedSalaryAmount").clear();
	c1.findElementByName("unusedSalaryAmount").sendKeys("20");
	
//	c1.findElementByName("enableUnusedCostForInPerson").click();
//	c1.findElementByName("enableUnusedCostForTelephone").click();
//	c1.findElementByName("enableUnusedCostForVideo").click();
//	c1.findElementByName("enableUnusedCostForMediation").click();
//	c1.findElementByName("enableUnusedCostForCourse").click();
	
	c1.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	}

}
