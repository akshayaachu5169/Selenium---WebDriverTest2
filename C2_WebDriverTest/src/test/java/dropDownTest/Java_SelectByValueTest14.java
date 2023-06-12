package dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class Java_SelectByValueTest14 {

	public static void main(String[] args) {
	WebDriver wd=	LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
	WebElement dropdown=	wd.findElement(By.name("month1"));
	List<WebElement> options=	dropdown.findElements(By.tagName("option"));
	
	for(int i =0;i<options.size();i++) {
		String data =options.get(i).getAttribute("value");
		
		if (data.equals("06")) {
			options.get(i).click();
		}
	}
	}

}
