package dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.LoginApp;

public class GetMultipleDropDownTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
		WebElement dropdown = wd.findElement(By.name("days"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByIndex(3);
		s.selectByIndex(4);
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		for (int i = 0; i < selectedoptions.size(); i++) {
			System.out.println(selectedoptions.get(i).getText());
		}

	}

}
