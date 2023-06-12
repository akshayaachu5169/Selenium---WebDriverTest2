package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.LoginApp;

public class GetTextTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://en.wikipedia.org/wiki/Chennai");
		WebElement paracontent = wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p[33]"));
		String paragraph = paracontent.getText();
		System.out.println(paragraph);
		System.out.println("--------------------------");

		int count = 0;
		if (paragraph.contains("Chennai")) {
			System.out.println("yes, chennai is available");
		
		String[] y = paragraph.split("\\s");

		for (int i = 0; i < y.length; i++) {
			if (y[i].contains("Chennai")) {//.equals to or .equalsIgnoreCase
				count++;
			}
		}
		}
		System.out.println(count);
	}
}
