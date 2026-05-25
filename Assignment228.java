package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment228 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();        
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement e1 = driver.findElement(By.xpath("//a[@aria-label='Gmail ']"));
        e1.click();
        Thread.sleep(1000);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
       	
	}

}
