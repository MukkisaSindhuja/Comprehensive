package Comprehensive.tide;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tide.com/en-us");
        driver.manage().window().maximize();
		//TestCase-1("Register")
		
		driver.findElement(By.xpath("//span[@class='login-register']")).click();
		
		//TestCase-2("Shop Production")
		
		driver.findElement(By.xpath("//a[@href='/en-us/shop']")).click();
		//TestCase-3("Wash Clothes")

		driver.findElement(By.xpath("//a[@data-action-detail='How to Wash Clothes']")).click();
		
	
		//TestCase-4("Search")
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Detergent");
		
		driver.findElement(By.xpath("//div[@class='input-wrap']/button")).click();
		//TestCase-5("Live-Chat")
		
		driver.findElement(By.xpath("//a[@href='/en-us/live-chat']")).click();
		System.out.println("Hi");
		driver.quit();

}}
