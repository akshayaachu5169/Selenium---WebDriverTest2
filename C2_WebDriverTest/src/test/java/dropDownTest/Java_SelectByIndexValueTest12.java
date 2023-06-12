package dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class Java_SelectByIndexValueTest12 {

	public static void main(String[] args) {
		WebDriver wd =LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
		WebElement month = wd.findElement(By.name("month1"));
		List<WebElement> options = month.findElements(By.tagName("option"));
		for(int i =0;i<options.size();i++) {
		
			if(i==3) {//==is for int
				options.get(i).click();
				break;//it can or cannot be given
			}
		}
	}

}
