package sell;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		
		String abc = System.getProperty("user.dir");
		
		System.out.println(abc);
		System.setProperty("webdriver.chrome.driver",abc+"/lib/chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");

	}

}
