package migrationsuperadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class viewuseraccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		ChromeDriver c1=new ChromeDriver();
		c1.get("http://localhost:4200/");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/form/div[1]/span/button[1]")).click();
		c1.findElement(By.xpath("//input[@placeholder='userName']")).sendKeys("admin");
		c1.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		c1.findElement(By.xpath("/html/body/app-root/public-layout/div/div[2]/app-login/form/div[2]/button[1]")).click();
		c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > navbar.navbar.horizontal.horizontal-vertical.custom-bg-color.custom-color > div > app-menu > nav > ul > li:nth-child(2)").click();
	//	c1.findElementByXPath("/html/body/app-root/horizontal-layout/div/navbar[2]/div/app-menu/nav/ul/li[2]").click();
		
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-user-account > form > tc-card > div > div > div.col-12.col-md-4 > tc-form-group > tc-select > div.select-box.ng-tns-c291-3").click();
	//	c1.findElementByXPath("/html/body/app-root/horizontal-layout/div/main/div/app-user-account/form/tc-card/div/div/div[1]/tc-form-group/tc-select/div[1]/div[1]").click();
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-user-account > form > tc-card > div > div > div.col-12.col-md-4 > tc-form-group > tc-select > div.select-list.ng-tns-c291-8.ng-trigger.ng-trigger-shrink.ng-star-inserted > div.filter.ng-tns-c291-8.ng-star-inserted > tc-input > div > div > input").sendKeys("charannunna");
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-user-account > form > tc-card > div > div > div.col-12.col-md-4 > tc-form-group > tc-select > div.select-list.ng-tns-c291-5.ng-trigger.ng-trigger-shrink.ng-star-inserted > div.options.ng-tns-c291-5 > div").click();
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-user-account > form > tc-card > div > div > div.col-md-2.offset-md-4 > button").click();
		
		c1.findElementByXPath("/html/body/app-root/horizontal-layout/div/main/div/app-user-account/tc-card/div/tc-table/div/table/tbody/tr/td[6]/div/a").click();
		
		// add user
		
		c1.findElementByCssSelector("body > app-root > horizontal-layout > div > main > div > app-view-user-account > div:nth-child(1) > div > tc-card > div.card-content > div.row.ng-star-inserted > div > button").click();
		c1.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("user");
		c1.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("true");
		c1.findElement(By.xpath("//input[@placeholder='Telephone']")).sendKeys("4123412300");
		c1.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("true@yopmail.com");
		c1.findElementByCssSelector("body > tc-modal > div.modal-window-wrap > div > div.modal-footer.ng-star-inserted > div > button.tc-btn.btn-info").click();
	}

}
