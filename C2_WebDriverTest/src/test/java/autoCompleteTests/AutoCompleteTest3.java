package autoCompleteTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class AutoCompleteTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/autocomplete/");
		WebElement input = wd.findElement(By.id("tags1"));
		input.sendKeys("a");
		for(int i=1;i<=10;i++) {
			System.out.println(wd.findElement(By.xpath("/html/body/ul[3]/li["+i+"]/div")).getText());
	}
	}

}
