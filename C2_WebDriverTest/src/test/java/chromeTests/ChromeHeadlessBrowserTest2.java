package chromeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadlessBrowserTest2 {

	public static void main(String[] args) {

		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--remote-allow-origins=*");
		settings.addArguments("--headless");
		//settings.addArguments("--disable-gpu"); not neccessary

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(settings);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("Chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
	}

}
