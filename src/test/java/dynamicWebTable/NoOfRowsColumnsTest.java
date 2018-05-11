package dynamicWebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NoOfRowsColumnsTest
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/TYSS/Desktop/webtable.html");
		int rows=driver.findElements(By.xpath("//table//tbody//tr")).size();
		System.out.println(rows);
		
		for(int i=2;i<rows;i++)
		{
			List allColumnsInRow=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td"));
			System.out.println("Number of columns in "+(i-1)+" data row is:"+allColumnsInRow.size());
		}
		
		
		int columns=driver.findElements(By.xpath("//table//tbody//th")).size();
		System.out.println(columns);
		driver.quit();

	}

}
