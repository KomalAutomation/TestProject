package StepDefinitions;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IssuePage;
import pages.RepositoryPage;
import pages.SignInPage;

public class GitUiSteps {

	SignInPage signinPage;
	IssuePage issuePage;
	RepositoryPage repositoryPage;
	public static WebDriver driver ;
	SoftAssert softassert = new SoftAssert(); 
	String projectpath = System.getProperty("user.dir");
	public static String browserName;
	Properties prop= new Properties();
	public static String url;
	public static WebDriverWait wait;

	@Before
	public void setup(){

		PropertiesFile.getProperties();

		if(browserName.equalsIgnoreCase("chrome")){		

			System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if (browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", projectpath+"/src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		driver.get(url);




	}


	@After
	public void teardown(){
		driver.close();
		driver.quit();

	}


	@Given("User is on Signin page")
	public void user_is_on_signin_page() {
	System.out.println("i am on sign in page");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_kdp_test_and_new(String username , String password) {
		signinPage = new SignInPage(driver);
		signinPage.loginGitPage(username, password);

	}

	@When("click on sign in")
	public void click_on_sign_in() {
		signinPage.clickLogin();

	}

	@Then("user is navigated to the main page")
	public void user_is_navigated_to_the_main_page() {
		//verify if navigated to correct page
		String actualTitle = signinPage.getPageTitle();
		String expectedTitle ="GitHub";
		softassert.assertEquals(actualTitle, expectedTitle);
		softassert.assertAll();

	}

@When("user clicks on issues link")
public void user_clicks_on_issues_link(){
	issuePage = new IssuePage(driver);
	issuePage.clickIssueLink();
	
	
}


@Then("issues dashboard is displayed")
public void issues_dashboard_is_displayed(){
	issuePage.getDashboard();

}

@When("user clicks on New repository")
public void user_clicks_on_New_repository(){
	repositoryPage = new RepositoryPage(driver);
	repositoryPage.clickPlusSign();
	repositoryPage.clickNewRepo();
}


@Then("create new repository header is displayed")
public void create_new_repository_header_is_displayed(){
	repositoryPage.checkHeader();
	String actualHeader =repositoryPage.checkHeader();
	String expectedHeader="Create a new repository";
	softassert.assertEquals(actualHeader, expectedHeader);
	softassert.assertAll();
}
}
