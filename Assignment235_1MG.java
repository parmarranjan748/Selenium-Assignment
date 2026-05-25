package AssignmentSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment235_1MG {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.1mg.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement imgX = driver.findElement(By.xpath("//img[@alt='cross']"));
		imgX.click();
		Thread.sleep(2000);
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='search-medicine']"));
		searchBox.sendKeys("bone" + Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> allSearchResult = driver.findElements(By.xpath("//div[@class='flex SearchResultContainer__cardContainer__dgEls col-5 SearchResultContainer__noMargin__GAbbc']"));
		int allmedcn = allSearchResult.size();
		System.out.println(allmedcn);
		for(int i=0; i<allmedcn;i++)
		{
			WebElement link = allSearchResult.get(i);
			String linkName = link.getText();
			System.out.println(linkName);
		}
       	
	}

}
