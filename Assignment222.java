package AssignmentSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment222 {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();        
         driver.get("https://www.amazon.in");
         driver.manage().window().maximize();
         Thread.sleep(3000);

         String title=        driver.getTitle();
         System.out.println(title);
         
         
         String url=        driver.getCurrentUrl();
         System.out.println(url);
         
         String parentid=        driver.getWindowHandle();
         System.out.println(parentid);
         Set<String> pcid=        driver.getWindowHandles();
         System.out.println(pcid);
	}

}
