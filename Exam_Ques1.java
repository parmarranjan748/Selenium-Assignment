package module6.SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exam_Ques1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new  ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.xpath("//input[@role='combobox']"));
		searchBox.sendKeys("shoes");
		Thread.sleep(5000);
		
		List<WebElement> autoSuggestion = driver.findElements(By.xpath("//div[@id='gAC']/ul/li"));
		autoSuggestion.get(1).click();
		
		Thread.sleep(5000);
		List<WebElement> allitem = driver.findElements(By.xpath("//ul[@class='srp-results srp-grid clearfix']/li"));
		System.out.println(allitem.size());
		Thread.sleep(5000);
		allitem.get(0).click();
		
		Thread.sleep(3000);
		Set <String>parentWind = driver.getWindowHandles();
		Iterator<String> wind = parentWind.iterator();
		String mainwind = wind.next();
		String secodwind =wind.next();
		driver.switchTo().window(secodwind);
		
		//Thread.sleep(5000);
		List<WebElement> buyButton =driver.findElements(By.xpath("//div[@class='vim vi-evo-row-gap']/ul/li"));
		System.out.println("button> " + buyButton.size());
		Thread.sleep(5000);
		buyButton.get(1).click();
		
		
		Thread.sleep(3000);
		Set <String>SparentWind = driver.getWindowHandles();
		Iterator<String> swind = SparentWind.iterator();
		String smainwind = swind.next();
		String ssecodwind =swind.next();
		driver.switchTo().window(ssecodwind);
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[5]/ul/li[2]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div[2]/div/div/div/div[2]/a/span")).click();
		
		
		
	}

}
