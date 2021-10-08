package superadmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class followupsession {

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
		c1.findElement(By.xpath("/html/body/nav/div[2]/ul/li[6]/a")).click();

		c1.findElementByCssSelector("#folders > a:nth-child(3)").click();
		c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[1]/div/div[1]/div[1]/div[4]/div/div[2]/div/div/div/div/a/i[4]")).click();
		Select dropdown1 = new Select(c1.findElement(By.name("duration")));
		 dropdown1.selectByVisibleText("1 Hour");
		 c1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	 c1.findElementByCssSelector("body > div:nth-child(13) > div > div > div.modal-footer.ng-scope > button.btn.btn-primary.ng-binding.ng-scope").click();
	c1.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/button[1]")).click();
	
	}

}
