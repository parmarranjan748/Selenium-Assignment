package module6.SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_Ques2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.hopscotch.in/");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.xpath("//*[@id=\"bodyWrapper\"]/div[1]/header/hs-navbar/div[1]/div[2]/div[2]/hs-alertbar/div/div/div/span[2]/a"));
		account.click();
		Thread.sleep(3000);
		
		WebElement signBttn =driver.findElement(By.xpath("//button[@class='css-10bd5cg']"));
		signBttn.click();
		
		Thread.sleep(3000);
		WebElement joinUs =driver.findElement(By.xpath("//a[@class='css-1tg3gbc']"));
		joinUs.click();
		Thread.sleep(3000);
		Set <String>parentWind = driver.getWindowHandles();
		Iterator<String> wind = parentWind.iterator();
		String mainwind = wind.next();
		String secodwind =wind.next();
		driver.switchTo().window(secodwind);
		
		Thread.sleep(7000);
		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		name.sendKeys("Ranjan");
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("Ranjan@gmail.com");
		
		WebElement number = driver.findElement(By.xpath("//input[@type='number']"));
		number.sendKeys("Ranjan@gmail.com");
		
		WebElement otpbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		otpbutton.click();
		
		
		
		
	}

}
