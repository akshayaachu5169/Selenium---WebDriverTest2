package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelFileTask4 {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		String url = wd.getCurrentUrl();
		String title = wd.getTitle();

		File f = new File("C:\\SeleniumPractiseWorkSpace\\C2_WebDriverTest\\files\\ExcelFile2.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.createSheet(title);
		fis.close();

		FileOutputStream fos = new FileOutputStream(f);
		sheet.createRow(0).createCell(1).setCellValue(url);
		workbook.write(fos);
		fos.close();
	}

}
