package org.Day1Tasks;

import java.util.List;

import org.Baseclass.Basement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Task3 extends Basement {
	
	public Task3() {
		PageFactory.initElements(driver,this);
	}

//	@Test
//	private void test() {
//		edgeLunch();
//		UrlLanuch("https://www.flipkart.com/");
//		timeout(10);
//
//		WebElement cc = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		cc.click();
//
//		WebElement srcbox = driver.findElement(By.xpath("//input[@type='text']"));
//		srcbox.sendKeys("iphone");
//
//		WebElement srcbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		srcbtn.click();
//
//		List<WebElement> totalprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//
//		for (int i=0;i<totalprice.size();i++) {
//			WebElement t = totalprice.get(i);
//			System.out.println(t.getText());
//		}
//	}

	public void t3() {
		List<WebElement> totalprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		for (int i=0;i<totalprice.size();i++) {
			WebElement t = totalprice.get(i);
			System.out.println(t.getText());
		}
		

	}

	
}
