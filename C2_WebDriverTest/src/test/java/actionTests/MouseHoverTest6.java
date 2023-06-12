package actionTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utility.LoginApp;

public class MouseHoverTest6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/mousehover/");
		WebElement resume = wd.findElement(By.id("id11"));
		WebElement item = wd.findElement(By.id("id13"));
		WebElement bushy = wd.findElement(By.id("id16"));

		Actions a = new Actions(wd);
		Thread.sleep(2000);
		a.moveToElement(resume).build().perform();
		Thread.sleep(2000);
		a.moveToElement(item).build().perform();
		Thread.sleep(2000);
		a.moveToElement(bushy).click().build().perform();
	}

}
