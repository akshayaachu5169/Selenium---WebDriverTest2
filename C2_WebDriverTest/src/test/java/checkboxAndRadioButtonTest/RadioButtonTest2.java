package checkboxAndRadioButtonTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.LoginApp;

public class RadioButtonTest2 {

	public static void main(String[] args) {
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/radiobutton/");
		List<WebElement> options = wd.findElements(By.name("technology2"));
		
		for (int i = 0; i < options.size(); i++) {
			System.out.println(options.get(i).getAttribute("value"));
		}
	}

}
