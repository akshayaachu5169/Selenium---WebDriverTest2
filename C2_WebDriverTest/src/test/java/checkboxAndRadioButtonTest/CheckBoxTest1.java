package checkboxAndRadioButtonTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class CheckBoxTest1 {

	public static void main(String[] args) {
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/checkbox/");
		WebElement data = wd.findElement(By.name("BigData"));
		if (data.isDisplayed()) {
			System.out.println("data is visible");
		}
		if (data.isEnabled()) {
			System.out.println("data is enabled");
		}
		if (!data.isSelected()) {
			System.out.println("data is not selected");
			data.click();
			System.out.println("data is now selected");
		} else {
			System.out.println("data is already selected");
		}
	}

}
