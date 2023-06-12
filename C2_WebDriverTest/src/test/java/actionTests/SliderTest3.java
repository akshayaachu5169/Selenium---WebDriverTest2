package actionTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.LoginApp;

public class SliderTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd =LoginApp.VcentryLogin();
	wd.get("https://djangovinoth.pythonanywhere.com/slider/");
	Actions a = new Actions(wd);
	WebElement src =wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/span"));
	a.dragAndDropBy(src, 50, 0).build().perform();
	
	}
	

}
