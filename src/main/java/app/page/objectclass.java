package app.page;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;

public class objectclass extends BaseClass {

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;
	@FindBy(xpath = "//div[@id='block_top_menu']/ul/li[2]/a")
	private WebElement dresses;
	@FindBy(xpath = "//div[@id='block_top_menu']/ul[1]/li[3]/a")
	private WebElement Tshirt;
	@FindBy(xpath = "//span[@class='navigation_page']")
	private WebElement womenpage;
	@FindBy(xpath = "//span[@class='cat-name']")
	private WebElement dresspage;
	@FindBy(xpath = "//h1[@class='page-heading product-listing']/span[1]")
	private WebElement shirtpage;
	@FindBy(id = "newsletter-input")
	private WebElement email;
	@FindBy(name = "submitNewsletter")
	private WebElement submit;
	
	@FindBy(xpath ="//p[@class='alert alert-success']")
	private WebElement msg;
	@FindBy(xpath="//label[@for='layered_id_attribute_group_1']")
	private WebElement sizeS;
	@FindBy(xpath="//label[@for='layered_id_attribute_group_2']")
	private WebElement sizeM;
	@FindBy(xpath="//label[@for='layered_id_attribute_group_3']")
	private WebElement sizeL;
	
	@FindBy(xpath="//ul[@class='product_list grid row']/li[1]/div[1]/div[1]/div[1]/a/img")
	private WebElement psearch;
	
	@FindBy(xpath="//ul[@class='product_list grid row']/li[1]/div[1]/div[2]/div[2]/a[1]")
	private WebElement cartadd;
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedcart;
	
	@FindBy(xpath="//input[@class='cart_quantity_input form-control grey']")
	private WebElement cartcount;
	

	public objectclass() {
		PageFactory.initElements(driver, this);
	}
public WebElement getPsearch(){
	return psearch;
}
public WebElement getDresses(){
	return dresses;
}
public WebElement getCartadd(){
	return cartadd;
}
public WebElement getProceedcart(){
	return proceedcart;
}
public WebElement getCartcount(){
	return cartcount;
}
}

	


