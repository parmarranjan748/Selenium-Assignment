package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment229 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();        
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement mobile = driver.findElement(By.xpath("//div[@class='nav-progressive-content']/ul/li[5]"));
        mobile.click();
        Thread.sleep(1000);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
       	
	}

}
