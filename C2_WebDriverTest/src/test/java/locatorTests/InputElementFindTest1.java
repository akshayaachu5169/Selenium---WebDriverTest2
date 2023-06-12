package locatorTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputElementFindTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com");
		//by name
	//WebElement input=	wd.findElement(By.name("q"));//single element,throws error
		//wd.findElements(by)-multiple elements, throws zero if error
	//input.sendKeys("Bangalore");
	
	
	//by id
		WebElement input=	wd.findElement(By.id("sb_form_q"));
		input.sendKeys("Bangalore");
	}

}
