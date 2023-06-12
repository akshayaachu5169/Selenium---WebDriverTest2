package chromeTests;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeInfoBarRemovalTest1 {

	public static void main(String[] args) {
		
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--remote-allow-origins=*");
		//setting.addArguments("--disable-infobars"); does not work for recent version
		setting.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		setting.setExperimentalOption("useAutomationExtension", false);
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(setting);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
	}

}
