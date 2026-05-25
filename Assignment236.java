package AssignmentSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Assignment236 {
	public static void main(String[] args) throws InterruptedException {
		
    	ChromeDriver driver = new ChromeDriver();
    	driver.get("https://www.google.com/");
    	driver.manage().window().maximize();
    	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
    	Thread.sleep(3000);
    	
    	for(int i=0; i<alllinks.size(); i++) {
    		WebElement e1 = alllinks.get(i);
    		String Url = e1.getDomAttribute("href");
    		System.out.println(Url);
    	
		}
       	
	}

}
