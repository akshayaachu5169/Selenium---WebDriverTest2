package autoCompleteTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class AutoCompleteTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/autocomplete/");
		WebElement input = wd.findElement(By.id("tags1"));
		input.sendKeys("a");
		WebElement ultag = wd.findElement(By.id("ui-id-3"));
		List<WebElement> litag = ultag.findElements(By.tagName("li"));
		int size = litag.size();
		for (int i = 0; i < size; i++) {
			System.out.println(litag.get(i).getText());
		
		}

}

}
