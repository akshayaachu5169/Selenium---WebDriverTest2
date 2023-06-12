package chromeTests;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeMobileViewTest3 {

	public static void main(String[] args) {

		// choose device
		Map<String,String> mydevice  = new HashMap<String,String>();
		mydevice.put("deviceName", "Samsung Galaxy S8+");

		// on device
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--remote-allow-origins=*");
		settings.setExperimentalOption("mobileEmulation", mydevice);

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(settings);
		wd.get("https://www.google.com");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("Chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
	}

}
