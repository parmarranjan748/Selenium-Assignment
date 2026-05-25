package AssignmentSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment237 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement e1 = driver.findElement(By.xpath("//textarea[@role='combobox']"));
		Thread.sleep(3000);
		if(e1.isDisplayed() && e1.isEnabled()) {
			e1.sendKeys("India");
		}
		else {
			System.out.println("Can not perform action because of disable and Enable");
		}
		
	}

}
