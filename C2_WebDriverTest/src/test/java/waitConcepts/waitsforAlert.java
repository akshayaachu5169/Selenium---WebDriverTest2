package waitConcepts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class waitsforAlert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://letcode.in/waits");

		wd.findElement(By.id("accept")).click();
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(20));
		Alert option=	wait.until(ExpectedConditions.alertIsPresent());
			option.accept();
			
		
		
		
		
		
		
		
	}
}