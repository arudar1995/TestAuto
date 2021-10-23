package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilitybase.baseclass;
import pageObject.AddfirstproductObject;

public class AddfirstproductTest {

baseclass bc; 
AddfirstproductObject AP;

public AddfirstproductTest() {	
	AP = new AddfirstproductObject();
	bc = new baseclass();
}
@Test
public void clickDresses() {
	AP.clickDresses();
	Assert.assertTrue(bc.getTitlte().contains("Women"));
}

@Test
public void addtocard() {
	AP.clickAddcart();
}
@Test
public void checkout() {
	AP.ClickCheckout();
	Assert.assertTrue(bc.getTitlte().contains("Order"));
}
}
