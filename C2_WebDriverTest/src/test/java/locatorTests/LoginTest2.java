package locatorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
	WebElement username=	wd.findElement(By.name("username"));
	username.sendKeys("Akshayaachu");
	WebElement password=	wd.findElement(By.name("password"));
	password.sendKeys("Aswin@1a");
	WebElement login =wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
	//password.sendKeys(Keys.ENTER);
	//password.submit();
	login.click();
		
	}

}
