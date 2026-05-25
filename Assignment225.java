package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment225 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();        
         driver.get("https://www.amazon.in");
         driver.manage().window().maximize();
         Thread.sleep(3000);
         WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
        e1.sendKeys("mobile under 10k" + Keys.ENTER); 
 		
        
	}

}
