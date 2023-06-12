package dropDownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.LoginApp;

public class SelectMultipleDropDownTest7 {
public static void main(String[] args) {
	
	WebDriver wd =LoginApp.VcentryLogin();
	wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
	WebElement dropdown =wd.findElement(By.name("days"));
	Select s = new Select(dropdown);
	
	s.selectByIndex(0);//in keyboard we give ctrl, here it takes automatically
	s.selectByIndex(3);
	s.selectByIndex(4);
}
}
