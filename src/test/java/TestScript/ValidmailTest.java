
package TestScript;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utilitybase.baseclass;
import pageObject.ValidmailcheckObject;

public class ValidmailTest {


ValidmailcheckObject Test;            //calling class name
baseclass bc;


public ValidmailTest() {                     //
	  Test = new ValidmailcheckObject();
		bc=new baseclass();
}
 @Test
public void clickmailbox() {              
	 Test.getTabMailid();
 }
 
@Test
public void entermailid() {
	int rvalue = new Random().nextInt(100000);              // upto extreme senerio of run
//	String email = "arudar1995" + rvalue + "@gmail.com";
	Test.entermailid("arudar1995" + rvalue + "@gmail.com");
	
 }
 
@Test
public void verifysucription() {
	WebElement subscribe = Test.subscribe();
	Assert.assertTrue(bc.elementFound(subscribe));
}
 
}









