
package browserTests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserResizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions settings = new ChromeOptions();
		settings.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				WebDriver wd = new ChromeDriver(settings);
				wd.get("https://www.google.com");
				Dimension currentDimension=wd.manage().window().getSize();
				System.out.println(currentDimension.height);
				System.out.println(currentDimension.width);
				Dimension newsize = new Dimension(500, 900);
				wd.manage().window().setSize(newsize);
	}

}
