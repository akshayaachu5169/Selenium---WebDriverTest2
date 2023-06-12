package alertTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.LoginApp;

public class ConfirmationAlertTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/alert/");
		wd.findElement(By.id("id2")).click();
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.dismiss();
	}

}
