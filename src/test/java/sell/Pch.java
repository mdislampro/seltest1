package sell;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Pch {
	
	
	public static void main(String[] args) throws InterruptedException {
		/*
		 * String abc = System.getProperty("user.dir");
		 * 
		 * System.out.println(abc);
		 * 
		 * System.setProperty("webdriver.chrome.driver",abc+"/lib/chromedriver.exe");
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bigb1\\Downloads\\chromedriver_win32 (1).zip\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();	
		
		//WebDriver driver = new ChromeDriver();
		
		driver.get("https://mpo.pch.com/register/PCHCOM");
		WebElement title =driver.findElement(By.id("input-title"));
		Select select =new Select(title);
		select.selectByValue("Mr.");
		Thread.sleep(2000);
		driver.findElement(By.id("input-first_name")).sendKeys("Humayun");
		Thread.sleep(2000);
		driver.findElement(By.id("input-last_name")).sendKeys("Kabir");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Street Address']")).sendKeys("Eliphent road");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Apt / Suite']")).sendKeys("Apt-9A");
		Thread.sleep(2000);
		driver.findElement(By.id("input-zip")).sendKeys("35698");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.name("confirm_email")).sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement birth_month = driver.findElement(By.name("birth_month"));
		Select select1 = new Select(birth_month);
		select1.selectByValue("1");
		WebElement birth_date = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select select2 = new Select(birth_date);
		select2.selectByValue("4");
		WebElement birth_year = driver.findElement(By.id("input-birth_year"));
		Select select3 = new Select(birth_year);
		select3.selectByValue("1982");
		WebElement cheakbox =driver.findElement(By.name("remembered"));
		System.out.println(cheakbox.isSelected());
		cheakbox.click();
		System.out.println(cheakbox.isSelected());
		driver.quit();
		
	}

}
