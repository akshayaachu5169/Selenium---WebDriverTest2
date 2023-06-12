package imageTests;

import java.io.IOException;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpRequest;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class BrokenImageTest5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
WebDriver wd = LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/brokenimage/");
WebElement brokenImage =wd.findElement(By.id("id2"));
String src =brokenImage.getAttribute("src");

HttpClient client=HttpClientBuilder.create().build();
HttpGet request= new HttpGet(src);
HttpResponse response =client.execute(request);
System.out.println(response.getCode());
if(response.getCode()==200) {
	System.out.println("image loaded");
}else {
	System.out.println("image broken");
}

	}

}
