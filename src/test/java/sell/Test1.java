package sell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		
		String abc = System.getProperty("user.dir");
		
		System.out.println(abc);
		System.setProperty("webdriver.chrome.driver",abc+"/lib/chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElement(By.name("q"));
		
		search.sendKeys("New York");
		
		 driver.findElement(By.xpath("//a[@class='gb_q']")).click();
		//driver.findElement(By.xpath("//a[@class='gb_e']/*")).click();
		//driver.findElement(By.xpath("//a[@class='MV3Tnb']")).click();
	}

}
