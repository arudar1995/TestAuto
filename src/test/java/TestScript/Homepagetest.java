package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilitybase.baseclass;
import pageObject.HomepageObject;

public class Homepagetest {

	HomepageObject homepage;
	baseclass bc;

	public Homepagetest() {
		homepage = new HomepageObject();
		bc = new baseclass();
	}

	@Test
	public void women() {
		homepage.checkWomen();
		Assert.assertTrue(homepage.getTitlte().contains("Women"));
	}

	@Test
	public void Tshirts() {
		homepage.checkTshirts();
		Assert.assertTrue(homepage.getTitlte().contains("T-shirts"));
	}

	@Test
	public void Dresses() {
		homepage.checkDresses();
		Assert.assertTrue(homepage.getTitlte().contains("Dresses"));
	}

}
