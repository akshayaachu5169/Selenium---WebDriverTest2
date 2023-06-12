package javaScriptExecutorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class JavaScriptDisableTest5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd = LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
WebElement disabled =wd.findElement(By.id("dis"));
Thread.sleep(2000);
JavascriptExecutor js =((JavascriptExecutor)wd);
js.executeScript("arguments[0].removeAttribute('disabled')",disabled);

Thread.sleep(2000);
disabled.sendKeys("hello");
	}

}
