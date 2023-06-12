package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptScrolIntoViewTest6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
	WebElement nextlink =wd.findElement(By.linkText("Next"));
	Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].scrollIntoView(true)",nextlink);//true or false can be given
		nextlink.click();
		
		
	}

}
