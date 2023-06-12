package browserTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlTest {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();		
WebDriver wd = new ChromeDriver();
wd.manage().window().maximize();
wd.get("https://www.google.com");
String data = wd.getCurrentUrl();
System.out.println(data);
	}

}
