package superadmin;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class superadminlogin {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
c1.get("https://adminbootstaging.bhaasha.ch/#/");
c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div/div/div[1]/button[1]")).click();
c1.findElement(By.id("username")).sendKeys("admin");
c1.findElement(By.id("password")).sendKeys("admin123");
c1.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[1]/div/div/div/form/div[3]/div/button")).click();
System.out.println("succesful");
	}
}
