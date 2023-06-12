package tableTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
WebElement table =wd.findElement(By.id("customers"));
List<WebElement> rows =table.findElements(By.tagName("tr"));

	
	

for(int i =0;i<rows.size();i++) {
	List<WebElement> columns =rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<columns.size();j++) {
		System.out.print(columns.get(j).getText()+ " ");
	}
	System.out.println();
}
	}

}
