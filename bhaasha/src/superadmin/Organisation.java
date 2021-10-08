package superadmin;

import org.openqa.selenium.chrome.ChromeDriver;

public class Organisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\nunna\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
ChromeDriver c1=new ChromeDriver();
c1.get("https://adminbootstaging.bhaasha.ch/#/");
String actualTitle = c1.getTitle();
String expectedTitle = "bhaasha";
c1.close();
if(actualTitle.equalsIgnoreCase(expectedTitle))
{
	System.out.println("test success");
}
else {
	System.out.println("test failed");
	
}


	}

}
