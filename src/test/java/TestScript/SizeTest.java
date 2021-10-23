package TestScript;

import org.testng.annotations.Test;
import org.testng.Assert;

import Utilitybase.baseclass;
import pageObject.Sizeobject;



public class SizeTest {
	Sizeobject size;
	baseclass bc;

	public SizeTest() {
		size = new Sizeobject();
		bc = new baseclass();

	}

@Test
public void clickWomentab() {
	size.clickwomen();
	Assert.assertTrue(bc.elementFound(size.clickwomen()));
}

@Test
public void getSmall() {
size.getSmall();
Assert.assertTrue(bc.elementFound(size.getSmall()));
}
@Test
public void getmedium() {
size.getMedium();
Assert.assertTrue(bc.elementFound(size.getMedium()));
}

@Test
public void getLarge() {
	size.getLarge();
	Assert.assertTrue(bc.elementFound(size.getLarge()));	
}
	

	
}


