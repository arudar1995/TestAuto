package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitybase.baseclass;

public class Sizeobject  extends baseclass {

	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	private WebElement tabWomen;
	
	@FindBy(xpath = "//*[@id=\'ul_layered_id_attribute_group_1\']/li[1]")
	private WebElement Small;
	
	@FindBy(xpath = "//*[@id=\'ul_layered_id_attribute_group_1']/li[2]")
	private WebElement Medium;
	
	@FindBy(xpath = "//*[@id=\'ul_layered_id_attribute_group_1\']/li[3]")
	private WebElement Large;
	
	public Sizeobject() {
		PageFactory.initElements(driver, this);
}
	public WebElement clickwomen() {
		tabWomen.click();
		return tabWomen;
		}
	public WebElement getSmall(){
		Small.click();
		return Small;
	}
	public WebElement getMedium() {
		Medium.click();
		return Medium;
	}
	public WebElement getLarge() {
		Large.click();
		return Large;
	}
	
		
	}
	

