package makeMyTrip;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class MakeMyTrip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\my pc\\Desktop\\Lakshmi\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		System.out.println("Page opened is :"+ " "+ driver.getTitle());
		driver.findElement(By.xpath("//div[@class='switchBTN']/label[contains(text(),'round trip')]")).click();
		WebElement from = driver.findElement(By.id("hp-widget__sfrom"));
		from.click();
		List<WebElement> fromCountries = from.findElements(By.xpath("//span[@class='autoCompleteItem__cntry']"));
		int NumOfFromCountries = fromCountries.size();
		System.out.println("No.of from counties:"+NumOfFromCountries);
		for(int i = 1; i<=NumOfFromCountries;i++)
		{
			String fc = from.findElements(By.xpath("//span[@class='autoCompleteItem__cntry']")).get(i).getText();
			if(fc.contains("HYD")){
				System.out.println("Selected from Country : "+ fc);
				from.findElements(By.xpath("//span[@class='autoCompleteItem__cntry']")).get(i).click();
			}
		}
		WebElement To = driver.findElement(By.id("hp-widget__sTo"));
		List<WebElement> toCountries = To.findElements(By.xpath("//span[@class='autoCompleteItem__cntry']"));
		int toc = toCountries.size();
		System.out.println("No.of to countries:"+toc);
		for( int j = 1; j<toc;j++)
		{
			String toCountry = toCountries.get(j).getText();

			if(toCountry.contains("DXB")){

				toCountries.get(j).click();
				System.out.println("Selected to Cpuntry:"+ toCountry);
			}
		}
		WebElement departMonth = driver.findElement(By.id("hp-widget__depart"));
		List<WebElement> DMonth = departMonth.findElements(By.xpath("//span[@class='ui-datepicker-month']"));
		int DMonthSize = DMonth.size();
		System.out.println(DMonthSize);
		for(int k=1;k<DMonthSize;k++)
		{
			String DMonthEach = DMonth.get(k).getText();
			if(DMonthEach.equals("September"))//
			{
//				DMonth.get(k).click();
				System.out.println("Selected Month = "+ DMonthEach);
			}
			else{
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
			}
		}
		
		
//		driver.close();
	}
}
