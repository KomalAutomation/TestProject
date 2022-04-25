# TestProject

# Task 1: Backend Requirement 
	Tools and Technology stack: 
Tool: Selenium | Framework: Rest Assured with BDD Framework | Language: Java | IDE: Eclipse |Design pattern : POM using Page factory class |For Data: Data Provider and .properties file. Have not used other external source like Excel as it was not complex testing to be carried out here.
GitHub path:  https://github.com/KomalAutomatiom/TestProject
Prerequisite to run test: Maven is installed and System /Environment variables are set for M2_HOME
Command to run: mvn clean test -DtestngFileName=testngGitApi.xml

Test case 1 :  Verify the response HTTPS status code on fetching public repositories.  
Test case 2 : Verify that response body has the correct owner name and number of repositories for that user.  
Test case 3 : Verify the response code when user fetch the repository with authentication token.  
Test case 4 : Verify the issues related to repositories are retrieved for the user.  

# Task 2: UI Requirement 
	Tools and Technology stack: 
Tool: Selenium | Framework: BDD Cucumber Framework | Language: Java | IDE: Eclipse |Design pattern : POM using Page factory class 
GitHub path:  https://github.com/KomalAutomatiom/TestProject
Prerequisite to run test: Maven is installed and System /Environment variables are set for M2_HOME
Command to run: mvn test –Dcucumber.options=”src/test/resources/Features/SignIn.feature”

Test case 1 :  Verify when user sign in to the github.com user is then navigated to the main page of Github.  
Test case 2 :  Verify  issue dashboard is displayed given that user is logged in on navigate to issue from main page(github.com/user).  
Test case 3 :   Verify that the create new repository is enabled and when user clicks on the new repository link user is displayed with Create New Repository heading given that user is at main page(github.com/user)


# Cases not implemented  :
1) Error 404 with message “not found” should be received when try to get the repositories with non-existing user of git.
2) Error 401 Unauthorized with message ”Bad credentials” should be received when creating a repository with invalid token.
3) Error 404 with message “not found” should be received when creating a repository without passing the token.


# Suggestions:  
1)The System shall provide a REST API that allows the user to update and delete content of the repositories.  
2)There should be time specified for each request in case of heavy data time for results to be loaded .  
3)Different roles and access level for users should be defined if more than 1 person is accessing the repository.  
4)System shall provide the facility to make the content private or public.  
5)System shall provide some security features to keep the data secure.  





