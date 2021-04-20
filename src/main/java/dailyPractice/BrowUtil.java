package dailyPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowUtil {
	WebDriver d;

	public WebDriver init_driver(String bname) {
		System.out.println("browser name is " + bname);
		switch (bname) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			d = new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			d = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			d = new EdgeDriver();
			break;
		default:
			System.out.println("pls pass correct brow");
			break;
		}
		return d;
	}
	public void launchUrl(String URL) {
		d.get(URL);
	}
	public void maxWind() {
		d.manage().window().maximize();
	}
	public String getTit()
	{
		return d.getTitle();
	}
	public String getU()
	{
		return d.getCurrentUrl();
	}
	public void closeD() {
		d.close();
	}
	public void quitD() {
		d.quit();
	}
}
