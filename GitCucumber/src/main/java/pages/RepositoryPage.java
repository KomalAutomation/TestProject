package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RepositoryPage extends BasePage {
	
	
	@FindBy(xpath="//a[contains(text(),'New repository')]")
	WebElement newRepository;
	
	
	@FindBy(xpath="//header/div[6]/details[1]/summary[1]/*[1]")
	WebElement createButton;
	
		
	
	@FindBy(xpath="//h1[contains(text(),'Create a new repository')]")
	WebElement header;
	
	public RepositoryPage(WebDriver driver){
		super(driver);
		}



public void clickPlusSign(){
	createButton.click();
}

public void clickNewRepo(){
	newRepository.click();
}

public String checkHeader(){
	String actualHeader = header.getText();
	return actualHeader;
}


}