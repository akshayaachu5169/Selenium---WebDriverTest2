package browserTests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPositionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(settings);
		wd.get("https://www.google.com");
		Dimension newsize = new Dimension(500, 900);
		wd.manage().window().setSize(newsize);
		Point points = wd.manage().window().getPosition();
		System.out.println(points.x);
		System.out.println(points.y);
		Thread.sleep(2000);
		Point newposition = new Point(200, 10);
		wd.manage().window().setPosition(newposition);

	}

}
