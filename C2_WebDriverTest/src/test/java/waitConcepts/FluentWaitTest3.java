package waitConcepts;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();

		wd.get("https://www.flipkart.com/");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("mobiles");
		input.submit();

		Wait<WebDriver> wait = new FluentWait<WebDriver>(wd).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement mobiles = wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver t) {
				// TODO Auto-generated method stub
				return t.findElement(By
						.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));

			}

		});
		mobiles.click();
	}
}
