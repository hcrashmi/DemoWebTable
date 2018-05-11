package dynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PrintAllHeadersTest 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/webtable.html");
			
		List<WebElement> headers = driver.findElements(By.xpath("//table//tbody//tr"));
		
		for(WebElement header:headers)
		{
			System.out.println(header.getText());
		}
		
		driver.quit();
		}
	}
	
