package javaScriptExecutorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class JavaScriptExecutorEnableTest6 {
public static void main(String[] args) throws InterruptedException {
	WebDriver wd = LoginApp.VcentryLogin();
	wd.get("https://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
	WebElement enabled =wd.findElement(By.id("ena"));
	Thread.sleep(2000);
	JavascriptExecutor js = ((JavascriptExecutor)wd);
	js.executeScript("arguments[0].setAttribute('disabled','true')", enabled);
}
}
