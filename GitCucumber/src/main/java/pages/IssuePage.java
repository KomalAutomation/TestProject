package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IssuePage extends BasePage {



	//@FindBy(xpath="//a[contains(text(),'Issues']")
	@FindBy(xpath="/html/body/div[1]/header/div[3]/nav/a[3]")
	WebElement issues;

	@FindBy(xpath="//*[@id='issues_dashboard']/div[1]/nav")
	WebElement issueStages;

	
	@FindBy(xpath="//input[@id='js-issues-search']")
	WebElement searchIssues;
	
	
	public IssuePage(WebDriver driver){
		super(driver);
	}

	//Click on issue link
	public void clickIssueLink(){
		issues.click();

	}  

	//checks create , assigned and mentioned dashboard and search issues box is displayed
	public void getDashboard(){
		issueStages.isDisplayed();
		searchIssues.isDisplayed();
		
	}






}
