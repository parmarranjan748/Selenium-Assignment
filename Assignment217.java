package AssignmentSelenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment217 {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();    
		 driver.manage().window().maximize();
        driver.get("https://www.google.com/");

	}

}
