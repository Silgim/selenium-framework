package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	private By userNameField=By.id("Email");
	private By userPasswordFild=By.id("Password");
	private By loginBtn=By.xpath("//*[@id=\"main\"]/div/section/div/div[2]/div[1]/div/form/div[3]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void enterUserNameText(String userName) {
		driver.findElement(userNameField).clear();
		driver.findElement(userNameField).sendKeys(userName);
		
		
	}
	public void enterPasswordText(String password) {
		driver.findElement(userPasswordFild).clear();
		driver.findElement(userPasswordFild).sendKeys(password);
		
	}
	public void clickLogin() {
		driver.findElement(loginBtn).click();
		
	}
}

