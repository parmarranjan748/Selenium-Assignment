package AssignmentSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment238 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/business/register/org/landing?ref_=ab_reg_signin_unifiedauth");
		driver.manage().window().maximize();
		WebElement businessEmailid = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[1]/div/div/form/fieldset/input"));
		businessEmailid.sendKeys("test123@gmail.com");
		WebElement subButton = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[1]/div/div/form/button"));
		subButton.click();
		
		
	}

}
