package practiseMavenTest;

import java.io.IOException;

import org.apache.hc.client5.http.classic.HttpClient;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.core5.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.LoginApp;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
	WebDriver wd =	LoginApp.VcentryLogin();
wd.get("https://djangovinoth.pythonanywhere.com/brokenimage/");
WebElement brokenlink =wd.findElement(By.id("id1"));
String src=brokenlink.getAttribute("src");

HttpClient client = HttpClientBuilder.create().build();
HttpGet request = new HttpGet(src);
HttpResponse response =client.execute(request);

if(response.getCode()==404) {
System.out.println("link is  broken");
	}else {
	System.out.println("link is not broken");	
	}
	}
}
