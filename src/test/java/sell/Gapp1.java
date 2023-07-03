package sell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gapp1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bigb1\\chrome112\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement appLink = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		appLink.click();
		Thread.sleep(4000);
		
		WebElement f =driver.findElement(By.name("app"));
		driver.switchTo().frame(f);
		Thread.sleep(3000);
		
		WebElement gglMap =driver.findElement(By.xpath("//a[@href='https://maps.google.com/']"));
		gglMap.click();
		Thread.sleep(20000);
		driver.switchTo().defaultContent();
		WebElement appLink1 = driver.findElement(By.xpath("//a[@title='Google apps']"));
		appLink1.click();
		Thread.sleep(3000);
		f =driver.findElement(By.name("app"));
		driver.switchTo().frame(f);
		Thread.sleep(4000);
		
		
		driver.quit();
		
	}

}
