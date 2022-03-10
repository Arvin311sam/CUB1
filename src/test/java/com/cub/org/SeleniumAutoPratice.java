package com.cub.org;

import java.util.List;

import org.openqa.selenium.WebElement;

public class SeleniumAutoPratice extends Baseclass {
	public static void main(String[] args) {
		browser("edge");
		url("http://automationpractice.com/index.php");
		WebElement sigin = findelement("xpath", "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
		click(sigin);
		WebElement email = findelement("xpath", "//*[@id=\"email\"]");
		sendkeys(email, "devisamy1612@gmail.com");
		WebElement pass = findelement("xpath", "//*[@id=\"passwd\"]");
		sendkeys(pass, "arvinsam");
		WebElement login = findelement("xpath", "//*[@id=\"SubmitLogin\"]");
		click(login);
		WebElement women = findelement("xpath", "//*[@id=\"block_top_menu\"]/ul/li[1]/a");
		actions("mouse", women);
		WebElement blouse = findelement("xpath", "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[2]/a");
		actions("rightclick", blouse);
		robo(0);
		windowhandles();
		System.out.println(drivermethod("t"));
		windowhandlings(windowhandles(), 1);
		WebElement img = findelement("xpath", "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
		click(img);
		frame("index", 0, null, img);
		WebElement plus = findelement("xpath", "//*[@id=\"quantity_wanted_p\"]/a[2]");
		click(plus);
		click(plus);
		WebElement size = findelement("xpath", "//*[@id=\"group_1\"]/option[2]");
		click(size);
		WebElement card = findelement("xpath", "//*[@id=\"add_to_cart\"]/button");
		click(card);
		outof("default");
		WebElement proceed = findelement("xpath", "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a");
		click(proceed);
		WebElement check = findelement("xpath", "//*[@id=\"center_column\"]/p[2]/a[1]");
		click(check);
		WebElement checkout = findelement("xpath", "//*[@id=\"center_column\"]/form/p/button");
		click(checkout);
		WebElement tick = findelement("xpath", "//*[@id=\"form\"]/div/p[2]/label");
		click(tick);
		WebElement out = findelement("xpath", "//*[@id=\"form\"]/p/button");
		click(out);
		WebElement pay = findelement("xpath", "//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a");
		click(pay);
		WebElement confirm = findelement("xpath", "//*[@id=\"cart_navigation\"]/button");
		click(confirm);
		List<WebElement> text = elements("xpath", "//*[@id=\"center_column\"]/div");
		for (WebElement webElement : text) {
			System.out.println(webElement.getText());
		}
		screenshot("C:\\Users\\AR20326647\\eclipse-workspace\\CUB\\Screenshot\\auto.png");
		quit();
	}

}
