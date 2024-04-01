package windowHandleTests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTest3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://letcode.in/windows");
		wd.findElement(By.id("home")).click();

		Set<String> windows = wd.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		wd.switchTo().window(child);
		System.out.println(wd.getTitle());
		Thread.sleep(2000);

		wd.close();
		wd.switchTo().window(parent);
		Thread.sleep(2000);
		Set<String> windows2 = wd.getWindowHandles();
		wd.findElement(By.id("multi")).click();
		List<String> list = new ArrayList<String>(windows2);
		wd.switchTo().window(list.get(0));
		System.out.println(wd.getTitle());
		wd.close();
		Set<String> windows3 = wd.getWindowHandles();	
		List<String> lists = new ArrayList<String>(windows3);
		wd.switchTo().window(lists.get(0));
		System.out.println(wd.getTitle());
	wd.close();
	wd.switchTo().window(lists.get(1));
	System.out.println(wd.getTitle());
	wd.close();
	}

}
