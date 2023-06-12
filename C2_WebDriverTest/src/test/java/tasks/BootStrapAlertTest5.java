package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.LoginApp;

public class BootStrapAlertTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/bootstrapalert/no/");
		wd.findElement(By.id("alert")).click();
		wd.get("https://djangovinoth.pythonanywhere.com/bootstrapalert/success/");

		String data = wd.findElement(By.xpath("/html/body/main/div/div[2]/div")).getText();
		System.out.println(data);

	}

}
