package calendarsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://letcode.in/calendar");
		String currentMonth = wd.findElement(By.className("datepicker-nav-month")).getText();
		String currentYear = wd.findElement(By.className("datepicker-nav-year")).getText();

		while (!(currentMonth.equals("May") && currentYear.equals("2025"))) {
			wd.findElement(By.xpath(
					"/html/body/app-root/app-calender/section[1]/div/div/div[1]/div/div/div[1]/div[1]/nwb-date-picker/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/button[2]"))
					.click();
			currentMonth = wd.findElement(By.className("datepicker-nav-month")).getText();
			currentYear = wd.findElement(By.className("datepicker-nav-year")).getText();

		}
		wd.findElement(By.xpath(
				"/html/body/app-root/app-calender/section[1]/div/div/div[1]/div/div/div[1]/div[1]/nwb-date-picker/div[2]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[18]/button"))
				.click();
	}

}
