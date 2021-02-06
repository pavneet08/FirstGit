package GitHub.githubproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 
{
	ChromeDriver driver;

	@BeforeMethod
	public void before()
	{
		System.setProperty("webdriver.chrome.driver", "../githubproject/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void trending() throws InterruptedException
	{
		WebElement signin = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign in']"));
		signin.click();
		
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("clark.harry815");
		WebElement next = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc' and @type='button']"));
		next.click();
		
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@type = 'password' and @class= 'whsOnd zHQkBf']"));
		password.sendKeys("amit0815");
		WebElement next1 = driver.findElement(By.xpath("//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc' and @type= 'button']"));
		next1.click();
		
		Thread.sleep(2000);
		
		WebElement trending = driver.findElement(By.xpath("//yt-formatted-string[text()='Trending']"));
		trending.click();
		
		WebElement img = driver.findElement(By.xpath("//img[@id = 'img' and @src = 'https://yt3.ggpht.com/yti/ANoDKi4jOmKAVXGXSuDnmo4DuqP61KKVfbkLtO-T6w=s88-c-k-c0x00ffffff-no-rj-mo']"));
		img.click();
		
		Thread.sleep(2000);
		
		WebElement signout = driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
		signout.click();
		System.out.println("signed out");
	}
	
	@AfterMethod
	public void after()
	{
		driver.close();
	}
	
}
