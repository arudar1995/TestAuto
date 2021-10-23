package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilitybase.baseclass;

public class AddfirstproductObject  extends baseclass{
	
@FindBy (xpath = "(//*[@title = 'Dresses'])[1]")
private  WebElement Dresses;

@FindBy (xpath = "(//*[@title ='Add to cart'])[1]")
private WebElement Addcart;

@FindBy (xpath = "//*[@id ='summary_products_quantity']")
private WebElement productincart;

@FindBy (xpath = "(//*[@class = \"icon-chevron-right right\"])[2]")
private WebElement CheckOut;

public AddfirstproductObject() {
	PageFactory.initElements(driver,this);
}
public WebElement clickDresses() {
	Dresses.click();
	return Dresses;
}

public WebElement clickAddcart() {
	Addcart.click();
	return Addcart;
}
public int verifyproduct() {
	return Integer.parseInt(productincart.getText().split(" ")[4]);
	
}
public void ClickCheckout() {
	CheckOut.click();
}
}
 
