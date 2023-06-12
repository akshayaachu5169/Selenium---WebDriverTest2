package imageTests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCropTest4 {
public static void main(String[] args) throws IOException {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	
	WebDriverManager.chromedriver().setup();
	WebDriver wd = new ChromeDriver(options);
	wd.manage().window().maximize();
	wd.get("https://www.google.com");
	WebElement googleLogo =wd.findElement(By.className("lnXdpd"));
File src=	((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);

Point point =googleLogo.getLocation();
int x=point.x;
int y=point.y;


Dimension d =googleLogo.getSize();
int height =d.height;
int width =d.width;
BufferedImage copy =ImageIO.read(src);
BufferedImage crop =copy.getSubimage(x, y, width,height);
ImageIO.write(crop, "png", src);

FileHandler.copy(src, new File("C:\\SeleniumPractiseWorkSpace2\\C2_WebDriverTest\\screenshots\\croppedImage2.png"));	
}
}
