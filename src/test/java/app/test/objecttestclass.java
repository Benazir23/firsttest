package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import app.page.BaseClass;
import app.page.objectclass1;

public class objecttestclass {
	objectclass1 a;
	BaseClass b;

	public objecttestclass() {
		a = new objectclass1();
		b = new BaseClass();
	}

	@Test
	public void verify() {
		a.getdresses().click();

		Assert.assertTrue(a.getimgcount() == a.getpcount(), "count is not matched");

	}

}
