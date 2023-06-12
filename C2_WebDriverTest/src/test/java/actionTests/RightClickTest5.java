package actionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		
WebElement gmaillink=wd.findElement(By.linkText("Gmail"));
Actions a = new Actions(wd);
a.contextClick(gmaillink).build().perform();

a.sendKeys(Keys.ARROW_DOWN).build().perform();
Thread.sleep(2000);
a.sendKeys(Keys.ARROW_DOWN).build().perform();
Thread.sleep(2000);
a.sendKeys(Keys.ENTER).build().perform();
	}

}
