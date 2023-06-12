package staleElementReference;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementReference_SmokeTestSoln2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		List<WebElement> links = wd.findElements(By.tagName("a"));
		ArrayList<String> linkref = new ArrayList<String>();
		for (int i = 0; i < links.size(); i++) {
			String data = links.get(i).getText();
			if (!data.isEmpty()) {
			linkref.add(links.get(i).getAttribute("href"));

		}
		}
		for(int i=0;i<linkref.size();i++) {
			wd.get(linkref.get(i));
			System.out.println(wd.getTitle());
			wd.navigate().back();
		}
	}
	}



	


