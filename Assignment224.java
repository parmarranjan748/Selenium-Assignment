package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment224 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();        
         driver.get("https://www.amazon.in");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         WebElement e1 = driver.findElement(By.id("searchDropdownBox"));
 		e1.click();
 		 Thread.sleep(2000);
 		Select s1 = new Select(e1);
 		s1.selectByValue("search-alias=amazon-devices");
 		//s1.selectByVisibleText("Amazon Devices");
 		 Thread.sleep(2000);
 		WebElement e2 =driver.findElement(By.id("twotabsearchtextbox"));
 		e2.sendKeys("laptop");
 		 Thread.sleep(2000);
 		WebElement e3 =driver.findElement(By.id("nav-search-submit-button"));
 		e3.click();
	}

}
