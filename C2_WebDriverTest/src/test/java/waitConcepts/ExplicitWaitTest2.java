package waitConcepts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitTest2 {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		
		wd.get("https://www.flipkart.com/");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("mobiles");
		input.submit();
		
		WebDriverWait wait = new WebDriverWait(wd,Duration.ofSeconds(20));
	WebElement option=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")));
		option.click();
		

	}

}
