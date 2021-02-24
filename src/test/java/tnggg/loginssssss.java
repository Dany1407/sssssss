package tnggg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginssssss extends baseclasssss{
	public  loginssssss() {
		PageFactory.initElements(driver,this);

	}
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")

	private WebElement userpass;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserpass() {
		return userpass;
	}

	public WebElement getButton() {
		return button;
	}
	@FindBy(name="login")

	private WebElement button;
	

}
