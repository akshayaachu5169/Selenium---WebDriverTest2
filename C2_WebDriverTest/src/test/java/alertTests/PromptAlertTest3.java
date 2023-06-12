package alertTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.LoginApp;

public class PromptAlertTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/alert/");
		wd.findElement(By.id("id3")).click();
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.sendKeys("Akshaya");//here sends as string, but in WebElement it sends a charSquence
		Thread.sleep(2000);
		alert.accept();
	}

}
