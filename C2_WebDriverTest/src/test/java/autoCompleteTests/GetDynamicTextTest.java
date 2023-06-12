package autoCompleteTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDynamicTextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.flipkart.com/");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("apple mobiles");
		input.submit();
		// /html/body/div[1]/div/div[3]/div[1]/div[2]/div["+i+"]/div/div/div/a/div[2]/div[1]/div[1]
		// /html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[2]/div[1]/div[1]
		// /html/body/div[1]/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[2]/div[1]/div[1]
		// /html/body/div[1]/div/div[3]/div[1]/div[2]/div[5]/div/div/div/a/div[2]/div[1]/div[1]

		int i = 2;
		while (true) {
			try {
				String data = wd.findElement(By.xpath(
						"/html/body/div[1]/div/div[3]/div[1]/div[2]/div[" + i + "]/div/div/div/a/div[2]/div[1]/div[1]"))
						.getText();
				System.out.println(data);
				i++;
			} catch (Exception e) {
				break;
			}

		}
	}
}
