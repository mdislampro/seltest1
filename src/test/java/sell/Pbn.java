package sell;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pbn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bigb1\\chrome112\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.barnesandnoble.com/");

		Actions actions = new Actions(driver);
		WebElement myAccount = driver.findElement(By.id("navbarDropdown"));
		actions.moveToElement(myAccount).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class=' rhf-sign-in rhf-myaccount-menu-item btn btn--medium']")).click();
		
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='Sign in or Create an Account']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("createAccountBtn")).click();
		Thread.sleep(4000);
		
	
		driver.switchTo().defaultContent();
		frame= driver.findElement(By.xpath("//iframe[@title='Create an Account']"));
		driver.switchTo().frame(frame);
		Thread.sleep(3000);

		driver.findElement(By.id("fName")).sendKeys("md");
		Thread.sleep(4000);
		driver.findElement(By.id("securityAnswer")).sendKeys("abc");

		actions.sendKeys(Keys.TAB).build().perform();
		actions.sendKeys(Keys.SPACE).build().perform();
		
		actions.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		actions.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(3000);
		WebElement crAcc = driver.findElement(By.xpath("//input[@value='Create Account']"));
		crAcc.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		WebElement signIn = driver.findElement(By.id("loginModalLink"));
		signIn.click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		frame= driver.findElement(By.xpath("//iframe[@title='Sign in or Create an Account']"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		WebElement forgetPass = driver.findElement(By.id("loginForgotPassword"));
		forgetPass.click();
		Thread.sleep(3000);
		
	}

}
