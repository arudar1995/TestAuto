package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitybase.baseclass;

public class TweetObject extends baseclass {

	@FindBy(xpath = "//*[@id='social_block']/ul/li[2]")
	private WebElement tweet;

	@FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[1]")
	private WebElement facebook;

	@FindBy(xpath = "//*[@id=\"social_block\"]/ul/li[4]")
	private WebElement google;

	public TweetObject() {
		PageFactory.initElements(driver, this);
	}

	public WebElement twitter() {
		return tweet;
	}
	public WebElement fb() {
		return facebook;
	}
	public WebElement go() {
		return google;
	}

}
