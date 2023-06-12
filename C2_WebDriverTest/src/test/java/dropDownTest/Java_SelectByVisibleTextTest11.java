package dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.LoginApp;

public class Java_SelectByVisibleTextTest11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
		WebElement month = wd.findElement(By.name("month1"));
		List<WebElement> options = month.findElements(By.tagName("option"));
		for (int i = 0; i < options.size(); i++) {
			String data= options.get(i).getText();
			if (data.equals("Mar")) {//.equals is for string, do not give ==
				options.get(i).click();
			}
		}
	}

}
