package frames;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	
	public class FramesTest {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			WebDriverManager.chromedriver().setup();
			WebDriver wd = new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("https://letcode.in/frame");
			// wd.switchTo().frame(0);//based on Index value
			wd.switchTo().frame("firstFr");// based on name or ID
			wd.findElement(By.name("fname")).sendKeys("Akshaya");
			Thread.sleep(2000);
			wd.findElement(By.name("lname")).sendKeys("Aswin");
			WebElement secondframe = wd.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
			wd.switchTo().frame(secondframe);
			wd.findElement(By.name("email")).sendKeys("Akshayaachu@gmail.com");
			//wd.switchTo().parentFrame();// moves to immediate frame
			//wd.findElement(By.name("lname")).sendKeys("Achu");
			//wd.switchTo().parentFrame();
//			wd.findElement(
//					By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"))
//					.click();
	wd.switchTo().defaultContent();
	wd.findElement(
		By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"))
			.click();//moves to main page
		}

	}


