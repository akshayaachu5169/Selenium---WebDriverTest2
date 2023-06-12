package tasks;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextFileTask2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");

		File f = new File("C:\\SeleniumPractiseWorkSpace\\C2_WebDriverTest\\files\\TaskTextFile1.txt");
		FileWriter fw = new FileWriter(f);
		fw.write(wd.getTitle());
		fw.close();
	}

}
