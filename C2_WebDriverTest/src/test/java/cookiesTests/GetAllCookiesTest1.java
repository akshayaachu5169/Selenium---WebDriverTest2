package cookiesTests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllCookiesTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		Set<Cookie> cookie = wd.manage().getCookies();
		Iterator<Cookie> it=cookie.iterator();
		while(it.hasNext()) {
			Cookie c =it.next();
			System.out.println(c.getDomain() + "---" + c.getName()+ "---" + c.getValue()+ "---" + c.getExpiry());
		}
	}
}
