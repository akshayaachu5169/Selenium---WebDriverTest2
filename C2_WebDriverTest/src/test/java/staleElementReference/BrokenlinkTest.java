package staleElementReference;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenlinkTest {

	public static void main(String[] args) throws IOException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");

		List<WebElement> links = wd.findElements(By.tagName("a"));

		for (int i = 0; i < links.size(); i++) {
			String url =links.get(i).getAttribute("href");
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);
		HttpResponse response=	client.execute(request);
		if(response.getCode()==404) {
			System.out.println("link is broken");
		}else {
			System.out.println("link is not broken");
		}
		}

	}

}
