package DXAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DXAutomationTest {
	static WebDriver driver;
	public static Object launchBrowser;

	public void launchBrowser() {
	
		driver= new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
	}

	public void JSAlerts() {
		
		driver.findElement(By.xpath("//li/a[text()='JavaScript Alerts']")).click();
	}

	public void JSConfirm() {
	
		driver.findElement(By.xpath("//li/button[text()='Click for JS Confirm']")).click();
	}

	public void Results() {
	
		String Expectedtxt = "You clicked: Ok";
		WebElement Results= driver.findElement(By.id("result"));
		String Actualtxt = Results.getText();

	
		if (Expectedtxt.equals(Actualtxt))
        	System.out.println("Test Passed");
		else
    		System.out.println("Test Failed");
	}


	public static void main(String[] args) {
		
		DXAutomationTest obj = new DXAutomationTest();
		obj.launchBrowser();
		obj.JSAlerts();
		obj.JSConfirm();
		driver.switchTo().alert().accept();
		obj.Results();
	
	}

}
