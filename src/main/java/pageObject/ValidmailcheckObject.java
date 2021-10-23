package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitybase.baseclass;

public class ValidmailcheckObject extends baseclass {

	@FindBy(xpath = "//*[@id ='newsletter-input']")
	private WebElement tabMailid;

	@FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
	private WebElement tabbutton;
	
	@FindBy(xpath = "//*[@class = 'alert alert-success']")
	private WebElement verifytext;

	public ValidmailcheckObject() {

		PageFactory.initElements(driver, this);          //use this page for tat only pagefactory
	}

	public WebElement getTabMailid(){                    //getter used for calling for testpage
		tabMailid.click();
		return tabMailid;
	}

	public void entermailid (String email) {
		setText(tabMailid,email);
		tabbutton.click();
	}
	public WebElement subscribe() {
		return verifytext;
	}
	
}
