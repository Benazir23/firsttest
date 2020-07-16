package app.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class objectclass1 extends BaseClass {
	public objectclass1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresses;

	@FindBy (xpath="//span[@class='heading-counter']")
	private WebElement pcount;
	
	@FindBys (@FindBy (xpath="//a[@class='product_img_link']"))
	private List<WebElement> imgcount;
			
	public WebElement getdresses(){
		return dresses;
	}
	public int getpcount(){

		String count=pcount.getText();
		String a=count.substring(10,11);
		System.out.println("jsfdsjfadf" +a);
		int b=Integer.parseInt(a);
	
		return b;
	}
	
	public int getimgcount(){
		int d=imgcount.size();
		System.out.println("jfsdkfds;kfd" +d);
		return d;
	}
		
	}

