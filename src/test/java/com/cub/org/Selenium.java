package com.cub.org;

import org.openqa.selenium.WebElement;

public class Selenium extends Baseclass {
	public static void main(String[] args) {
		browser("edge");
		url("http://automationpractice.com/index.php");
		System.out.println(drivermethod("t"));
		WebElement women = findelement("xpath", "//*[@id=\"block_top_menu\"]/ul/li[1]/a");
		actions("rightclick", women);
		robo(0);
		WebElement dress = findelement("xpath", "//*[@id=\"block_top_menu\"]/ul/li[2]/a");
		actions("rightclick", dress);
		robo(0);
		WebElement tshirts = findelement("xpath", "//*[@id=\"block_top_menu\"]/ul/li[3]/a");
		actions("rightclick", tshirts);
		robo(0);

		System.out.println(windowhandles());
		windows(windowhandles());

		windowhandlings(windowhandles(), 3);
		System.out.println(drivermethod("cu"));

	}
}