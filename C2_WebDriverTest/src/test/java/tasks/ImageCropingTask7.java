package tasks;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ImageCropingTask7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.flipkart.com/");
		wd.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement input = wd.findElement(By.name("q"));
		input.sendKeys("apple mobiles");
		input.submit();
		WebElement appleLogo = wd.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		File src = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		Point point = appleLogo.getLocation();
		int x = point.x;
		int y = point.y;

		Dimension d = appleLogo.getSize();
		int height = d.height;
		int width = d.width;

		BufferedImage copy =ImageIO.read(src);
	    BufferedImage crop=	copy.getSubimage(x, y, width, height);
		ImageIO.write(crop, "png", src);
		
		FileHandler.copy(src, new File("C:\\SeleniumPractiseWorkSpace\\C2_WebDriverTest\\screenshots\\APPLE iphone13(Green 256GB).png"));
	}

}
