package tableTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class AddOrDeleteTableTest4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd =LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/dynamictable2/");
wd.findElement(By.id("name")).sendKeys("user8");
wd.findElement(By.id("email")).sendKeys("user8@mail.com");
Thread.sleep(2000);
wd.findElement(By.id("rowid")).click();
wd.findElement(By.name("record")).click();
Thread.sleep(2000);
wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div/form/div/div[4]/button")).click();
WebElement table =wd.findElement(By.id("table1"));
List<WebElement> rows =table.findElements(By.tagName("tr"));
for(int i=0;i<rows.size();i++) {
	List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
	for(int j=0;j<cols.size();j++) {
		System.out.print(cols.get(j).getText() + " ");
	}
	System.out.println();
}
	}

}
