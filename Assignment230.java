package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment230 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement customerService = driver.findElement(By.xpath("//div[@class='nav-progressive-content']/ul/li[8]"));
        customerService.click();
        Thread.sleep(1000);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
       	
	}

}
