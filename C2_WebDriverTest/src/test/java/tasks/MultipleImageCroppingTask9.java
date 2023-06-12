package tasks;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleImageCroppingTask9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.nykaa.com/");
		wd.findElement(By.className("css-1upamjb")).sendKeys("lipstick");
		wd.findElement(By.className("css-1upamjb")).submit();
		wd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div[2]/div[1]/div[1]/div/div[1]/a/div[2]/div[1]"))
		.click();
Set<String> window = wd.getWindowHandles();
Iterator<String> it = window.iterator();
String parentid = it.next();
String childid = it.next();
wd.switchTo().window(childid);

WebElement lipimage=wd.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[1]/div[2]/div[2]/div/div"));
		
	File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
	
	Point location =lipimage.getLocation();
	int x=location.x;
	int y=location.y;
	System.out.println(x);
	System.out.println(y);
	
	Dimension size=lipimage.getSize();
	
	int height =size.height;
	int weight =size.width;
	System.out.println(height);
	
	BufferedImage copy=ImageIO.read(src);
	BufferedImage crop =copy.getSubimage(x, y, weight, height);
	ImageIO.write(crop, "png", src);
	FileHandler.copy(src, new File("C:\\SeleniumPractiseWorkSpace\\C2_WebDriverTest\\screenshots\\lipstick.png"));
	
	}

}
