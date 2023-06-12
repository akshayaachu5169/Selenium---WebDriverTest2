package dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.LoginApp;

public class SelectByVisibleTextTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd=LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
WebElement dropdown =wd.findElement(By.name("month1"));
Select s =new Select(dropdown);
s.selectByVisibleText("July");

	}

}
