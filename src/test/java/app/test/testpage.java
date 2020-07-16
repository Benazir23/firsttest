package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import app.page.BaseClass;
import app.page.objectclass;

public class testpage {
	
	objectclass a;
	BaseClass b;
	public testpage(){
		a=new objectclass();
		b=new BaseClass();
	}
	

@Test
public void verify(){
	a.getDresses().click();
	b.movement(a.getPsearch());
	a.getCartadd().click();
	b.isElementVisible(a.getProceedcart());
	a.getProceedcart().click();
	Assert.assertTrue(a.getCartcount().isDisplayed());

}

}
