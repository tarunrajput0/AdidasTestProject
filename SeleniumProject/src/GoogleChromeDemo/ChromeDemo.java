package GoogleChromeDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tarun Rajput\\Desktop\\Selenium Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://en.wiktionary.org/");
		Thread.sleep(20000);
		driver.findElement(By.name("search")).sendKeys("apple");
		driver.findElement(By.name("go")).click();
		
		
		WebElement def= driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div/ol[1]/li[1]"));
		String text= def.getText();
		String[] finaltext= text.split("\\", 2);
		System.out.println(finaltext[0].toString());
		String tocheck="A common, round fruit produced by the tree Malus domestica, cultivated in temperate climates.";
		driver.close();
		
		if (finaltext[0].equalsIgnoreCase(tocheck))
		{
			System.out.println("Test Successfull");
		}
		else
		{
			System.out.println("Test Un-Successfull");
		}	
		 
	}

}
