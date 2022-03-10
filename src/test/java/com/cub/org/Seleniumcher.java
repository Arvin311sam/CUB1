package com.cub.org;


import org.openqa.selenium.WebElement;

public class Seleniumcher extends Baseclass {
	public static void main(String[] args) {
		browser("edge");
		url("https://chercher.tech/practice/dropdowns");
		/*
		 * WebElement op = findelement("xpath", "//*[@id=\"second\"]/option[1]");
		 * click(op); WebElement b = findelement("xpath",
		 * "//*[@id=\"second\"]/option[2]"); click(b);
		 */
		WebElement all = findelement("xpath", "//select[@id='second']");
		multidd("selecting", all);
		ddoption("getoption");
		
		
	}
}
