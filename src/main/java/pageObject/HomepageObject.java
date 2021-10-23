package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitybase.baseclass;

public class HomepageObject extends baseclass {
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabWomen;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[2]/a")
	private WebElement tabDresses;

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
	private WebElement tabTshirts;

	public HomepageObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement checkWomen() {
		tabWomen.click();
		return tabWomen;
	}

	public WebElement checkDresses() {
		tabDresses.click();
		return tabDresses;
	}

	public WebElement checkTshirts() {
		tabTshirts.click();
		return tabTshirts;
	}

}
