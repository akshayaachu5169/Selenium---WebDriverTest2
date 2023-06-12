package dropDownTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeTest13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.google.com");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Bangalore");
	//getText- in between tags- <p> text</p>
		//getAttribute- inside a tag
		String data =input.getAttribute("value");
		System.out.println(data);
		
	}

}
