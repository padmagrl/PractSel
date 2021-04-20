package dailyPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// **********locators***********

		By DDSingle = By.id("justAnInputBox");
		By choicesMul = By.xpath("//span[@class='comboTreeItemTitle']");

		// **********locators***********
		BrowUtil bu = new BrowUtil();
		WebDriver d = bu.init_driver("chrome");
		bu.launchUrl("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		EltUtil eu = new EltUtil(d);
		eu.doClick(DDSingle);
		//eu.comboSel(choicesMul, "choice 3","choice 5","choice 6 2 1");
		eu.comboSel(choicesMul, "all");
		eu.comboDeSel(choicesMul, "all");
		d.quit();

	}

}
