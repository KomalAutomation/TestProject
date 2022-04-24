package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {


	@FindBy(id="login_field")
	WebElement gitUserName; 


	@FindBy(id="password")
	WebElement gitPassword; 

	@FindBy(xpath="//*[@id='login']/div[4]/form/div/input[12]")
	WebElement gitSignIninButton;





	public SignInPage(WebDriver driver){
		super(driver);


		/*if(!driver.getTitle().equals("Sign in to GitHub · GitHub")){
			throw new IllegalStateException("This is not the main page of GitHub after sign in. Thepage displayed is  "
					+ driver.getCurrentUrl());
		}*/

	}   


	//enter username in textbox

	public void setUserName(String strUserName){
		gitUserName.sendKeys(strUserName);
	}

	//enter pwd in textbox
	public void setPassword(String strPassword){
		gitPassword.sendKeys(strPassword);

	}

	//Click on login button
	public void clickLogin(){

		gitSignIninButton.click();

	}  


	//verify if navigated to correct page
	public String getPageTitle(){

		String actualTitle=driver.getTitle();
		return actualTitle;





	}




	/*  Methods to be executed in test classes    */



	public void loginGitPage(String strUserName,String strPassword){

		//Enter user name

		this.setUserName(strUserName);

		//Enter password

		this.setPassword(strPassword);



	}











}
