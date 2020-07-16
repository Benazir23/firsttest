package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

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
public void verifytest12(){
	a.getDresses().click();
	b.movement(a.getPsearch());
	a.getCartadd().click();
	b.isElementVisible(a.getProceedcart());
	a.getProceedcart().click();
	Assert.assertTrue(a.getCartcount().isDisplayed());

}

}
