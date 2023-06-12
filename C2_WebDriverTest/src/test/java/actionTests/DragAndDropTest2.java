package actionTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver(options);

		
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://djangovinoth.pythonanywhere.com/login/");
		wd.findElement(By.name("username")).sendKeys("Akshayaachu");
		wd.findElement(By.name("password")).sendKeys("Aswin@1a");
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
		wd.get("https://djangovinoth.pythonanywhere.com/labhome/");
		wd.findElement(By.name("element20")).click();
		wd.findElement(By.name("element25")).click();
		//mouse actions
		
		Actions a =new Actions(wd);
		WebElement drag =wd.findElement(By.id("draggable"));
		WebElement drop = wd.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop);
		a.build().perform();
	}

}
