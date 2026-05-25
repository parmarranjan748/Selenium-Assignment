package AssignmentSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment219 {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();    
		 driver.manage().window().maximize();
        driver.get("https://google.com/");
       String Title = driver.getTitle();
       System.out.println(Title);
      
       driver.quit();
	}

}
