package org.Baseclass;

import java.io.File;




import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Basement {
	
	public static WebDriver driver;
	public static void chromelanuch() {
		
		driver = new ChromeDriver();
	}
	public static void edgeLunch() {
		driver = new EdgeDriver();
		
	}
	public static void UrlLanuch(String Url) {
		driver.get(Url);
	}
	
	
	public static void Contains() {

	}
	
	public static void timeout(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	public static void sendkeys(WebElement e,String data) {
		e.sendKeys(data);
	}
	public static void Click(WebElement e) {
		e.click();
	}
	public static String GetTitle() {
		String title = driver.getTitle();
		return title;
	}
		public static String getCurrentUrl() {
			String cu = driver.getCurrentUrl();
			return cu;
	}
	public static void Actions(WebElement d) {
		Actions a = new Actions(driver);
		
		a.click();
	}
	public static void Alert(WebElement e) {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	public static void SelectIndex(WebElement e,int index) {
		Select s = new Select(e);
		s.selectByIndex(index);
	}
	public static void JavaScript(WebElement e,String s) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments(0).setAttribute('value','Hari')",e);
		js.executeScript("arguments(1).getAttribute('value)",e);
	}
	public static void ScreenShot(String imagename) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File srcloc = t.getScreenshotAs(OutputType.FILE);
		File trcloc = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\"+imagename+".png");
		FileUtils.copyFile(srcloc,trcloc);
	}
	public static void navigate(WebElement e) {
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	public static void  WindowsHandels(int index) {
		Set<String> wh = driver.getWindowHandles();
		List<String> li = new ArrayList<String>();
		li.addAll(wh);
		driver.switchTo().window(li.get(index));			
	}

	public static String getatt(WebElement e) {
		String att = e.getAttribute("value");
		 return att;
	}
	
	

	

}
