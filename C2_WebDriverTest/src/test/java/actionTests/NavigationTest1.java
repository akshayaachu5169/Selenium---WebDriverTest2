package actionTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		WebElement username = wd.findElement(By.name("username"));
		username.sendKeys("Akshayaachu");
		WebElement password = wd.findElement(By.name("password"));
		password.sendKeys("Aswin@1a");
		WebElement login = wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button"));
		login.click();

		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		wd.findElement(By.name("element20")).click();

		wd.findElement(By.name("element25")).click();

	}

}
