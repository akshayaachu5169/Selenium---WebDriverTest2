package windowHandleTests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class WindowHandleTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd =LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/multiwindow/");
WebElement windowhandle =wd.findElement(By.id("id2"));
windowhandle.click();
Set<String> windows =wd.getWindowHandles();
Iterator<String> it =windows.iterator();
String parentId=it.next();
String childId =it.next();
wd.switchTo().window(childId);

System.out.println(wd.findElement(By.xpath("/html/body/p[1]")).getText());

	}

}
