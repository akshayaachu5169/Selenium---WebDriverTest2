package javaScriptExecutorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptLinkTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		WebElement gmailLink = wd.findElement(By.linkText("Gmail"));
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click()", gmailLink);
	}

}
