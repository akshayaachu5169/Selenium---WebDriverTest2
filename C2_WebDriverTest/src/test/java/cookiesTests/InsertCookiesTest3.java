package cookiesTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertCookiesTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.google.com");
		Thread.sleep(10000);
		wd.manage().deleteAllCookies();
		Cookie mc = new Cookie("my cookie", "vcentry");
		wd.manage().addCookie(mc);
		Set<Cookie> cookie = wd.manage().getCookies();
		Iterator<Cookie> it = cookie.iterator();
		while (it.hasNext()) {
			Cookie c = it.next();
			System.out.println(c.getDomain() + "---" + c.getName() + "---" + c.getValue() + "---" + c.getExpiry());
		}

	}

}
