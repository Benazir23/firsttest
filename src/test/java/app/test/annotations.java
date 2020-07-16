package app.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class annotations {
	
	@Test(priority=2, groups="aaa")
	public void test1(){
		System.out.println("test1");
	}
	@Test(groups={"aaa","bbb"})
	public void test2(){
		System.out.println("test2");
	}
	@Test(groups="bbb")
	public void test3(){
		System.out.println("test3");
	}
	@Test(priority=5 , groups={"aaa"})
	public void atest4(){
		System.out.println("test");
	}
	@Test(groups={"bbb"})
	public void atest5(){
		System.out.println("test5");
	}
}