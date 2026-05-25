package AssignmentSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment234 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> link	= driver.findElements(By.tagName("a"));
		for(int i =0; i<link.size(); i++) {
				WebElement li2 = link.get(i);
				String linkName = li2.getText();
				System.out.println(linkName);
		}
       	
	}

}
