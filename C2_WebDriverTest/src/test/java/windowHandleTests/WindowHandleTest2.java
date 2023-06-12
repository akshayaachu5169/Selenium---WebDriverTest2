package windowHandleTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
//		DesiredCapabilities cp = new DesiredCapabilities();
//		cp.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(cp);
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wd.get("https://www.flipkart.com/");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("iphone");
		input.submit();
		WebElement link =wd.findElement(By.xpath(".//div[@class='_4rR01T' and text()='APPLE iPhone 11 (Black, 64 GB)']"));
	                                            
		link.click();
		Set<String> windows =wd.getWindowHandles();
	Iterator<String> it =windows.iterator();
	String parentId = it.next();
	String childId=it.next();
	wd.switchTo().window(childId);
		
		String price=	wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div[4]/div[1]/div/div[1]")).getText();
	System.out.println(price);
	
	
	}

}
