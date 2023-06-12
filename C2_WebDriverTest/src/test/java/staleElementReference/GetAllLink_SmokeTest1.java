package staleElementReference;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLink_SmokeTest1 {
	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		List<WebElement> links = wd.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			String data = links.get(i).getText();
			if(!data.isEmpty()) {
			System.out.println(data);
		}
	}
}
}
