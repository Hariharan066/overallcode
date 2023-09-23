package org.Day1Tasks;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.Baseclass.Basement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task4 extends Basement{
//	@Test
//	private void test() {
//		edgeLunch();
//		UrlLanuch("https://www.flipkart.com/");
//		timeout(10);
//
//		WebElement cc = driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z'or @class='_30XB9F']"));
//		cc.click();
//
//		WebElement srcbox = driver.findElement(By.xpath("//input[@type='text']"));
//		srcbox.sendKeys("iphone");
//
//		WebElement srcbtn = driver.findElement(By.xpath("//button[@type='submit']"));
//		srcbtn.click();

//		List<WebElement> totalprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
//		for (int i=0;i<totalprice.size();i++) {
//			//System.out.println(totalprice.get(i).getText());
//			String s1 = totalprice.get(i).getText().toString();
//			
//			if (s1.contains("₹")) {
//				s1=s1.replace("₹","" );	
//				
//			}
//			if (s1.contains(",")) {
//				s1=s1.replace(",", "");	
//			}
//			int p = Integer.parseInt(s1);
//			System.out.println(p);
//		}
//			List<Integer> l = new LinkedList<Integer>();
//			l.add(76999);
//			l.add(55999);
//			l.add(36999);
//			l.add(67999);
//			l.add(33999);
//			Collections.sort(l);
//			System.out.println("-----minimum price----");
//			System.out.println(Collections.min(l));
//			System.out.println("-----maximum price----");
//			System.out.println(Collections.max(l));
//		}}
//		
			
	
	public void t4() {
		List<WebElement> totalprice=driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		for (int i=0;i<totalprice.size();i++) {
			//System.out.println(totalprice.get(i).getText());
			String s1 = totalprice.get(i).getText().toString();
			
			if (s1.contains("₹")) {
				s1=s1.replace("₹","" );	
				
			}
			if (s1.contains(",")) {
				s1=s1.replace(",", "");	
			}
			int p = Integer.parseInt(s1);
			System.out.println(p);
		}
			List<Integer> l = new LinkedList<Integer>();
			l.add(76999);
			l.add(55999);
			l.add(36999);
			l.add(67999);
			l.add(33999);
			Collections.sort(l);
			System.out.println("-----minimum price----");
			System.out.println(Collections.min(l));
			System.out.println("-----maximum price----");
			System.out.println(Collections.max(l));
		}
		
	}

		


	







