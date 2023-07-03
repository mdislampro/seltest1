package sell;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hungry {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bigb1\\chrome112\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Actions actions = new Actions(driver);

		WebElement search = driver.findElement(By.name("q")); 

		WebElement ele = driver.findElement(By.id("gbqfbb"));
		actions.moveToElement(ele).build().perform();
		Thread.sleep(2000);

		WebElement up = driver.findElement(By.xpath("//div[@class='gbqfba gbqfba-hvr']"));
		String currentState = up.getAttribute("aria-label");

		while (!currentState.equals("I'm Feeling Hungry")) {

			System.out.println(currentState);
			actions.moveToElement(search).build().perform();

			Thread.sleep(2000);
			actions.moveToElement(ele).build().perform();
			Thread.sleep(3000);
			currentState = up.getAttribute("aria-label");
		}
		System.out.println(currentState);
		driver.quit();
	}

}
