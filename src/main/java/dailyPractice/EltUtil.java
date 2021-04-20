package dailyPractice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EltUtil {
	WebDriver d;

	EltUtil(WebDriver d) {
		this.d = d;
	}

	public WebElement doFindelt(By loc) {
		return d.findElement(loc);
	}

	public List<WebElement> dofindelts(By loc) {
		return d.findElements(loc);
	}

	public void doSendKeys(By loc, String val) {
		doFindelt(loc).sendKeys(val);
	}

	public String dogetText(By loc) {
		return doFindelt(loc).getText();
	}

	public void doClick(By loc) {
		doFindelt(loc).click();
	}

	public ArrayList<String> getTextList(By loc) {
		List<WebElement> eltlist = dofindelts(loc);
		ArrayList<String> textList = new ArrayList<String>();
		for (WebElement e : eltlist) {
			textList.add(e.getText());

		}
		return textList;
	}

	public ArrayList<String> getAttTextList(By loc, String attname) {
		ArrayList<String> attlist = new ArrayList<String>();
		List<WebElement> eltList = dofindelts(loc);
		for (WebElement e : eltList) {
			if ((!e.getAttribute(attname).isBlank() || (!e.getAttribute(attname).isEmpty())
					|| (!e.getAttribute(attname).equals("null")))) {
				attlist.add(e.getAttribute(attname));
			}

		}
		return attlist;

	}

	public void doSelectDDVisibleText(By loc, String text) {
		Select s = new Select(doFindelt(loc));
		s.selectByVisibleText(text);
		System.out.println(text + " is clicked");
	}

	public void doHandleDDWithOutSelect(By loc, String text) {
		List<WebElement> choices = dofindelts(loc);
		for (WebElement e : choices) {
			if (e.getText().equals(text)) {
				e.click();
				System.out.println(e.getText() + "is clicked");
				break;
			}

		}
	}

	public void doSelectDDAllOptionsText(By loc) {
		List<WebElement> eltlist = dofindelts(loc);
		for (WebElement e : eltlist) {
			String s = e.getText();
			System.out.println(s);

		}

	}

	public void comboSel(By loc, String... val) {
		List<WebElement> list = dofindelts(loc);
		try {

			if (!val[0].equals("all")) {
				for (WebElement e : list) {
					String text = e.getText();
					for (int i = 0; i < val.length; i++) {
						if (text.equals(val[i])) {
							e.click();
							System.out.println(e.getText() + "is clicked");
						}
					}

				}
			} else {
				for (WebElement e : list) {
					e.click();
					System.out.println(e.getText() + "is clicked");

				}
			}
		} catch (Exception e) {
			System.out.println("*********** ex handled********");
		}
	}

	public void comboDeSel(By loc, String... val) {
		List<WebElement> list = dofindelts(loc);
		try {

			if (!val[0].equals("all")) {
				for (WebElement e : list) {
					String text = e.getText();
					for (int i = 0; i < val.length; i++) {
						if (text.equals(val[i])) {
							if (e.isEnabled()) {
								e.click();
								System.out.println(e.getText() + "is un selected");
							}
						}
					}

				}
			} else {
				for (WebElement e : list) {
					if (e.isEnabled()) {
						e.click();
					}
					System.out.println(e.getText() + "is un selected");

				}
			}
		} catch (Exception e) {
			System.out.println("*********** ex handled********");
		}
	}
}
