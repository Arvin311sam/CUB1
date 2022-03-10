package com.cub.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFlikart {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement topoffer = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a"));
		Actions a = new Actions(driver);
		a.contextClick(topoffer).build().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement grocery = driver.findElement(By.xpath("//div[@class='_37M3Pb']//following::div[text()='Grocery']"));
		a.contextClick(grocery).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		WebElement mobile = driver.findElement(By.xpath("//div[@class='_37M3Pb']//following::div[text()='Mobiles']"));
		a.contextClick(mobile).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		System.out.println(driver.getTitle());
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		Iterator<String> li = windowHandles.iterator();
		String w1 = li.next();
		String w2 = li.next();
		String w3 = li.next();
		String w4 = li.next();
		String title = driver.switchTo().window(w1).getTitle();
		System.out.println(title);
		driver.close();
		String title2 = driver.switchTo().window(w4).getTitle();
		System.out.println(title2);
		WebElement search = driver.findElement(By.xpath("//div[@class='_2Xfa2_']//following::input[@title='Search for products, brands and more']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='dress'; ", search );
		WebElement sarchclick = driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click",sarchclick);
		
		
		
		//driver.quit();
	}

}
