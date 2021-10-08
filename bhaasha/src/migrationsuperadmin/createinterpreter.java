package migrationsuperadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class createinterpreter {

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
		
		 Actions actions = new Actions(c1);
		 WebElement mainMenu = c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/navbar[2]/div/app-menu/nav/ul/li[3]/a/span[1]"));
		 actions.moveToElement(mainMenu);
		 WebElement subMenu = c1.findElement(By.xpath("/html/body/app-root/horizontal-layout/div/navbar[2]/div/app-menu/nav/ul/li[3]/ul/li[1]/a/span"));
		 actions.moveToElement(subMenu).click();
		 actions.click().build().perform();
		
		 c1.findElementByXPath("/html/body/app-root/horizontal-layout/div/main/div/app-interpreters/div/div/div[3]/button").click();
		 
		 Select dropdown1 = new Select(c1.findElement(By.name("interpreterGroup")));
		 dropdown1.selectByVisibleText("igNewone");
		 c1.findElementByName("User Id").sendKeys("newone");
		 c1.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		 c1.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("admin123");
		 c1.findElementByXPath("/html/body/tc-modal/div[2]/div/div[2]/form/div[3]/div[1]/tc-form-group/tc-checkbox/div/div[1]/input").click();
		 c1.findElementByXPath("/html/body/tc-modal/div[2]/div/div[2]/form/div[3]/div[2]/tc-form-group/tc-checkbox/div/div[1]/input").click();
		 c1.findElementByXPath("/html/body/tc-modal/div[2]/div/div[2]/form/div[3]/div[3]/tc-form-group/tc-checkbox/div/div[1]/input").click();
		 
		 Select dropdown2 = new Select(c1.findElement(By.cssSelector("body > tc-modal > div.modal-window-wrap > div > div.modal-body > form > div:nth-child(5) > div:nth-child(1) > div > div > div > div > div.col.col-md-3 > div > tc-form-group > tc-select > div.select-box.ng-tns-c291-8")));
		 dropdown2.selectByVisibleText("English");
		 	 
		  Select dropdown3 = new Select(c1.findElement(By.cssSelector("body > tc-modal > div.modal-window-wrap > div > div.modal-body > form > div:nth-child(5) > div:nth-child(1) > div > div > div > div > div:nth-child(2) > tc-form-group > tc-select > div.select-box.ng-tns-c291-9")));
	 dropdown3.selectByVisibleText("Expert");
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 Select dropdown4 = new Select(c1.findElement(By.cssSelector("body > tc-modal > div.modal-window-wrap > div > div.modal-body > form > div:nth-child(5) > div:nth-child(1) > div > div > div > div > div.col.col-md-3.ng-star-inserted > div > tc-form-group > tc-select > div.select-box.ng-tns-c291-10")));
			 dropdown4.selectByVisibleText("Azeri");
	  Select dropdown5 = new Select(c1.findElement(By.cssSelector("body > tc-modal > div.modal-window-wrap > div > div.modal-body > form > div:nth-child(5) > div:nth-child(1) > div > div > div > div > div:nth-child(4) > tc-form-group > tc-select > div.select-box.ng-tns-c291-11")));
			 dropdown5.selectByValue("1");
			 
		 c1.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("addname");
		 c1.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("addemail@vh.com");
		 c1.findElementByXPath("/html/body/tc-modal/div[2]/div/div[2]/form/div[9]/div[3]/tc-form-group/tc-input/div").sendKeys("5105100210");
		 c1.findElement(By.xpath("//input[@placeholder='Video (Per Minute)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Telephone (Per Minute)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='InPerson (Per Hour)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Intercultural mediation (Per Hour)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Course Management (Per Hour)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='VIDEO']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='TELEPHONE']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Intercultural Mediation (IM)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='INPERSON']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Course Management (CM)']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Interpreter Travel Cost']")).sendKeys("12");
		 c1.findElement(By.xpath("//input[@placeholder='Billing Travel Cost']")).sendKeys("12");
	
		 c1.findElementByXPath("/html/body/tc-modal/div[2]/div/div[3]/div/button[2]").click();
	}

}
