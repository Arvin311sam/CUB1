package com.cub.org;

import org.openqa.selenium.WebElement;

public class SeleniumAuto extends Baseclass {
	public static void main(String[] args) {
		browser("edge");
		url("http://automationpractice.com/index.php");
		WebElement sigin = findelement("xpath", "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
		click(sigin);
		WebElement create = findelement("xpath", "//*[@id=\"email_create\"]");
		sendkeys(create, "devisamy1612@gmail.com");
		WebElement account = findelement("xpath", "//*[@id=\"SubmitCreate\"]");
		click(account);
		WebElement ratio = findelement("xpath", "//*[@id=\"id_gender1\"]");
		click(ratio);
		WebElement first = findelement("xpath", "//*[@id=\"customer_firstname\"]");
		sendkeys(first, "arvin");
		WebElement last = findelement("xpath", "//*[@id=\"customer_lastname\"]");
		sendkeys(last, "sam");
		WebElement pass = findelement("xpath", "//*[@id=\"passwd\"]");
		sendkeys(pass, "arvinsam");
		WebElement days = findelement("xpath", "//*[@id=\"days\"]");
		dd("byvalue", days, 0, "3", null);
		WebElement months = findelement("xpath", "//*[@id=\"months\"]");
		dd("byvalue", months, 0, "11", null);
		WebElement year = findelement("xpath", "//*[@id=\"years\"]");
		dd("byvalue", year, 0, "1995", null);
		WebElement address = findelement("xpath", "//*[@id=\"address1\"]");
		sendkeys(address, "5th street, sai hotel, adayar");
		WebElement city = findelement("xpath", "//*[@id=\"city\"]");
		sendkeys(city, "chennai");
		WebElement state = findelement("xpath", "//*[@id=\"id_state\"]");
		dd("byvisible", state, 0, null, "Hawaii");
		WebElement code = findelement("xpath", "//*[@id=\"postcode\"]");
		sendkeys(code, "00000");
		WebElement moblie = findelement("xpath", "//*[@id=\"phone_mobile\"]");
		sendkeys(moblie, "9876543210");
		WebElement alias = findelement("xpath", "//*[@id=\"alias\"]");
		clear(alias);
		WebElement alais = findelement("xpath", "//*[@id=\"alias\"]");
		sendkeys(alais, "5th street, sai hotel, adayar");
		WebElement reg = findelement("xpath", "//*[@id=\"submitAccount\"]");
		click(reg);
		quit();
	}
}
