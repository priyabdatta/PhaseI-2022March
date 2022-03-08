package test;

//import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;
//import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazoneTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver" ,"chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
	//	WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in");
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		Search.sendKeys("iphone12");
		
		WebElement clicksearch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		clicksearch.click();
		
		List<WebElement> iphonename =  driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		List<WebElement> iphoneprice =  driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		System.out.println("Search Result" + iphonename.size());
		
		
		for(int count=0;count<iphonename.size();count++)

		{ 
			if(iphonename.get(count).getText().toLowerCase().contains("iphone12"))
				
			{
				System.out.println("iphone Name:" +iphonename.get(count).getText() + "iphone Price:"+iphoneprice.get(count).getText());
			}
			
				}
	
		//driver.close();
	}

}
