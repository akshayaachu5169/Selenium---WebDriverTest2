package tableTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class DynamicTableTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd =LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/dynamictable1/");
wd.findElement(By.id("rows")).sendKeys("5");
wd.findElement(By.id("cols")).sendKeys("5");
wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div[5]/button")).click();
WebElement table =wd.findElement(By.name("newtable"));
List<WebElement> rows =table.findElements(By.tagName("tr"));
for(int i =0;i<rows.size();i++) {
	List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
	
	for(int j=0;j<cols.size();j++) {
		System.out.print(cols.get(j).getText()+ " " );
	}
	System.out.println();
	
}
	}

}
