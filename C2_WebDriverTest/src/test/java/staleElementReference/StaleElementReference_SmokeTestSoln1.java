package staleElementReference;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReference_SmokeTestSoln1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		List<WebElement> links = wd.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++) {
			links = wd.findElements(By.tagName("a"));
			String data = links.get(i).getText();
			if (!data.isEmpty()) {
				links.get(i).click();
				System.out.println(wd.getTitle());
				wd.navigate().back();
				// here inside links there may be many links, so the size may change
				// hence ArrayIndexOutOfBoundException

			}
		}
	}
}
