package actionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.LoginApp;

public class ResizeTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd =LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/resize/");

WebElement resize = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/div[3]"));
Actions a = new Actions(wd);
//Single Action
//	a.clickAndHold(resize).build().perform();
//	a.moveToElement(resize, 120, 120).build().perform();
//	a.release(resize);

//chained Action
a.clickAndHold(resize).moveByOffset(120, 120).release().build().perform();
	}

}
