package autoCompleteTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class AutoCompleteTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/autocomplete/");
		WebElement input = wd.findElement(By.id("tags1"));
		input.sendKeys("a");
		                   //indexing position 
		///html/body/ul[3]/li[1]/div
		///html/body/ul[3]/li[2]/div
		///html/body/ul[3]/li[3]/div
		
		int i =1;
		while(true) {
			try {
			String data =wd.findElement(By.xpath("/html/body/ul[3]/li["+i+"]/div")).getText();
			System.out.println(data);
			i++;
	}catch(Exception e){
			break;
		}
		}
	}

}
