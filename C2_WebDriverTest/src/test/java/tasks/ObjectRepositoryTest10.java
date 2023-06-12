package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ObjectRepositoryTest10 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\SeleniumPractiseWorkSpace2\\C2_WebDriverTest\\files\\objectRepository.properties");

		FileInputStream fis = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		String data =  prop.getProperty("url");
		wd.get(data);
		wd.findElement(By.name(prop.getProperty("username_Byname"))).sendKeys(prop.getProperty("username"));
		wd.findElement(By.name(prop.getProperty("password_Byname"))).sendKeys(prop.getProperty("password"));
		wd.findElement(By.xpath(prop.getProperty("login_ByXpath"))).click();
	}

}
