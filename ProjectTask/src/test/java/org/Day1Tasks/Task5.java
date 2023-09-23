package org.Day1Tasks;
import java.util.List;

import org.Baseclass.Basement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task5 extends Basement{

	
	@Test
	private void lunch() throws InterruptedException {
		edgeLunch();
		UrlLanuch("https://www.flipkart.com/");
		timeout(10);
		
		WebElement cc = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cc.click();
		
		WebElement srcbox = driver.findElement(By.xpath("//input[@type='text']"));
		srcbox.sendKeys("iphone");
		
		WebElement srcbtn = driver.findElement(By.xpath("//button[@type='submit']"));
		srcbtn.click();
			
	 List<WebElement> total=driver.findElements(By.xpath("//div[@class='_4rR01T'] "));
		
	 List<WebElement> totalprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));	
	
	for (int i = 0; i <total.size(); i++) {
		System.out.println(total.get(i).getText()+"="+totalprice.get(i).getText());
		
	}
	
	}
	public void t5() {
		
	 List<WebElement> total=driver.findElements(By.xpath("//div[@class='_4rR01T'] "));
		
	 List<WebElement> totalprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));	
	
	for (int i = 0; i <total.size(); i++) {
		System.out.println(total.get(i).getText()+"="+totalprice.get(i).getText());
		
		

	}}
	
	}
	




	
