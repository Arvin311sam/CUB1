package com.cub.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumAdactin extends Baseclass {
	public static void main(String[] args) {
		browser("edge");
		url("http://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		sendkeys(user, "Technologiest");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		sendkeys(pass, "J4G7D1");
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		click(login);
		
		WebElement loc = findelement("xpath", "//*[@id=\"location\"]");
		dd("byvalue", loc, 0, "London", null);
		ddoption("getoption");
		ddoption("allselect");
		
		WebElement hotel = findelement("xpath", "//*[@id=\"hotels\"]");
		dd("byvalue", hotel, 0, "Hotel Sunshine", null);
		ddoption("getoption");
		ddoption("allselect");
		
		WebElement room = findelement("xpath", "//*[@id=\"room_type\"]");
		dd("byvalue", room, 0, "Super Deluxe", null);
		ddoption("getoption");
		ddoption("firstselect");
		
		WebElement noof = findelement("xpath", "//*[@id=\"room_nos\"]");
		dd("byvalue", noof, 0, "4", null);
		ddoption("getoption");
		ddoption("allselect");
		
		WebElement adult = findelement("xpath", "//*[@id=\"adult_room\"]");
		dd("byvalue", adult, 0, "3", null);
		ddoption("getoption");
		ddoption("allselect");
		
		WebElement child = findelement("xpath", "//*[@id=\"child_room\"]");
		dd("byvalue", child, 0, "4", null);
		ddoption("getoption");
		ddoption("allselect");
		
		WebElement search = findelement("xpath","//*[@id=\"Submit\"]");
		click(search);
		
		
		
		
		

	}
}