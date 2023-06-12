package alertTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.LoginApp;

public class SimpleAlertTest1 {

	public static void main(String[] args) {
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/alert/");
		wd.findElement(By.id("id1")).click();
		Alert a = wd.switchTo().alert();
		System.out.println(a.getText());
		a.accept();

	}

}
