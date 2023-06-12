package browserTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullScreenTest {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
WebDriver wd  = new ChromeDriver();
wd.manage().window().fullscreen();

	}

}
