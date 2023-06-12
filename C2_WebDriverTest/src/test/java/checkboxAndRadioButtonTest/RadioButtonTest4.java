package checkboxAndRadioButtonTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class RadioButtonTest4 {

	public static void main(String[] args) {
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/radiobutton/");
		WebElement radioButton = wd.findElement(By.id("Selenium"));
		radioButton.click();
	System.out.println(radioButton.getAttribute("value"));	
		
	}

}
