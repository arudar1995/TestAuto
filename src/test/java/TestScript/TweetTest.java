package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utilitybase.baseclass;
import pageObject.TweetObject;

public class TweetTest {
	
	TweetObject show;
	baseclass bc;
	
	public TweetTest() {
		
	show = new TweetObject();
		bc = new baseclass();
	}
@Test
public void Tweeter() {
	show.twitter();
	Assert.assertTrue(bc.elementFound(show.twitter()));
}
public void  facebook() {
	show.fb();
	Assert.assertTrue(bc.elementFound(show.fb()));
}
public void google() {
	show.go();
	Assert.assertTrue(bc.elementFound(show.go()));
}
}
