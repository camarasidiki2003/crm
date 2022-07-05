package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
 public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		System.out.println("Hi");

	
	
	
 }
}
