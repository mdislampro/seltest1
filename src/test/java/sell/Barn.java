package sell;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Barn {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\bigb1\\chrome112\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.barnesandnoble.com/");

		Actions actions = new Actions(driver);

		Thread.sleep(5000);
		WebElement myAccount = driver.findElement(By.id("navbarDropdown"));
		myAccount.click();
		Thread.sleep(3000);

		WebElement signIn = driver.findElement(By.xpath("//a[text()='Sign In']"));

		signIn.click(); Thread.sleep(3000);

		WebElement f = driver.findElement(By.xpath("//iframe[@title='Sign in or Create an Account']")); 
		driver.switchTo().frame(f); Thread.sleep(3000);

		WebElement craccount = driver.findElement(By.id("createAccountBtn"));
		craccount.click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
		f= driver.findElement(By.xpath("//iframe[@title='Create an Account']"));
		driver.switchTo().frame(f);
		Thread.sleep(3000);

		driver.findElement(By.id("fName")).sendKeys("md");
		Thread.sleep(4000);
		driver.findElement(By.id("securityAnswer")).sendKeys("abc");

		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(4000);
		
		WebElement crAcc = driver.findElement(By.xpath("//input[@value='Create Account']"));
		crAcc.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		
		WebElement signIn1 = driver.findElement(By.id("loginModalLink"));
		signIn1.click();
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		f= driver.findElement(By.xpath("//iframe[@title='Sign in or Create an Account']"));
		driver.switchTo().frame(f);
		Thread.sleep(4000);
		
		WebElement forgPass = driver.findElement(By.id("loginForgotPassword"));
		forgPass.click();
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		f= driver.findElement(By.xpath("//iframe[@title='Password Assistance']"));
		driver.switchTo().frame(f);

		driver.findElement(By.id("email")).sendKeys("abc@yahoo.com");
		Thread.sleep(4000);

		driver.quit();
	}

}
