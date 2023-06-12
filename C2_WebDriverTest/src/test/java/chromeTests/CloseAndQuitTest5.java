package chromeTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.LoginApp;

public class CloseAndQuitTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		//wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("birds");
		wd.findElement(By.name("q")).submit();
	
		
		wd.findElement(By.xpath("/html/body/div[7]/div/div[11]/div[4]/div[2]/div[2]/div/div/div/div/div/div/div/div[1]/div/div/div/div/div[3]/div[3]/div/div/div/div/div/div[1]/div/a/h3")).click();
		
	
		Thread.sleep(2000);
		 wd.close();
		//wd.quit();
	}

}
