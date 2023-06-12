package tableTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.LoginApp;

public class TableTest1 {

	public static void main(String[] args) {
	WebDriver wd=	LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/statictable/");
WebElement tables =wd.findElement(By.id("table1"));
List<WebElement> rows =tables.findElements(By.tagName("tr"));

for(int i =0;i<rows.size();i++) {
//	List<WebElement> head =rows.get(i).findElements(By.tagName("th"));
//	for(int k=0;k<head.size();k++) {
//		System.out.print(head.get(k).getText() + "  ");
//	}
	List<WebElement> columns =rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<columns.size();j++) {
		System.out.print(columns.get(j).getText() + "    ");
	}
	System.out.println();
}

	}

}
