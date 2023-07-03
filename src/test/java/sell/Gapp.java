package sell;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gapp {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bigb1\\chrome112\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		WebElement gglApp = driver. findElement(By.xpath("//a[@aria-label='Google apps']"));
		gglApp.click();
		Thread.sleep(4000);
		
		
		WebElement f = driver.findElement(By.name("app"));
		driver.switchTo().frame(f);
		Thread.sleep(4000);
		
		WebElement shoping = driver.findElement(By.xpath("//a[@href='https://www.google.com/shopping?source=og']"));
		shoping.click();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		
		WebElement gglApp1 = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		gglApp1.click();
		
		Thread.sleep(3000);
		
	    f = driver.findElement(By.name("app"));
		driver.switchTo().frame(f);
		Thread.sleep(5000);
		
		WebElement podcasts =driver.findElement(By.xpath("//a[@href='https://podcasts.google.com']"));
		podcasts.click();
		Thread.sleep(5000);
		
		driver.switchTo().defaultContent();
		
		WebElement gglApp2 = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		gglApp2.click();
		Thread.sleep(7000);
		
		f = driver.findElement(By.name("app"));
		driver.switchTo().frame(f);
		Thread.sleep(3000);
		
		WebElement finance = driver.findElement(By.xpath("//a[@href='https://www.google.com/finance']"));
		finance.click();
			
		Thread.sleep(8000);
		driver.switchTo().defaultContent();
		
		WebElement gglApp3 = driver.findElement(By.xpath("//a[@class='gb_e']"));
		gglApp3.click();
		Thread.sleep(7000);
		
		f = driver.findElement(By.name("app"));
		driver.switchTo().frame(f);
		Thread.sleep(3000);
		
		WebElement gglArt = driver.findElement(By.name("Arts and Culture"));
		gglArt.click();
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Set<String> listOfWindId = driver.getWindowHandles();
		Iterator<String> it = listOfWindId.iterator();
		
		String shping = it.next();
		String pdcasts = it.next();
		String art = it.next();
		
		driver.switchTo().window(shping);
		driver.findElement(By.name("q")).sendKeys("Cell Phone");
		Thread.sleep(4000);
		
				
		//driver.switchTo().window(fnance);
		//driver.findElement(By.xpath("//input[@aria-label='Search for stocks, ETFs & more'][1]")).sendKeys("Dow Jones");
		//Thread.sleep(4000);
				
		driver.switchTo().window(pdcasts);
		driver.findElement(By.xpath("//input[@class='Ax4B8 ZAGvjd']")).sendKeys("Bangladesh");
		Thread.sleep(4000);
		
		driver.switchTo().window(art);
		driver.findElement(By.xpath("//div[@class='F6JQ7c']")).click()  ;
	
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
	}

}
