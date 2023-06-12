package dropDownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utility.LoginApp;

public class DeselectSpecificOptionTest10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd =	LoginApp.VcentryLogin();
		wd.get("https://djangovinoth.pythonanywhere.com/dropdown/");
	WebElement dropdown=	wd.findElement(By.name("days"));
	Select s = new Select(dropdown);
	s.selectByIndex(1);
	s.selectByIndex(3);
	s.selectByIndex(5);
	List <WebElement> selectedOptions =s.getAllSelectedOptions();
int size=	selectedOptions.size();
System.out.println("size of  the selected options: " + size);
for(int i =0;i<size;i++){
	System.out.println(selectedOptions.get(i).getText());
}
s.deselectByIndex(3);
List <WebElement> deselectedOptions =s.getAllSelectedOptions();
int size1=	deselectedOptions.size();
System.out.println("size of  the deselected options: " + size1);
for(int i =0;i<size1;i++){
	System.out.println(deselectedOptions.get(i).getText());
}
	}

}
