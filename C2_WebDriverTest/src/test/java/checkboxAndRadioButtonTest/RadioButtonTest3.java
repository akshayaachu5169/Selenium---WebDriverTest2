package checkboxAndRadioButtonTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class RadioButtonTest3 {

	public static void main(String[] args) {

		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/radiobutton/");
		List<WebElement> options = wd.findElements(By.name("technology2"));

		for (int i = 0; i < options.size(); i++) {
			if (options.get(i).getAttribute("value").equals("Flask")) {

				options.get(i).click();
				System.out.println(options.get(i).getAttribute("value"));
			}

		}

	}

}
