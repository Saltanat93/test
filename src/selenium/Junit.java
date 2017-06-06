package selenium;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit {

	WebDriver driver;
	
@Before 
public void before(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\CybertekStudent\\Desktop\\Libraries\\Drivers\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.get("http://www.amazon.com");



}




	@Test
	public void test() {

	}

}
