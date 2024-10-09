Feature: DataDriven testing 

Scenario Outline: verify login functionality with invalid cred
Given open chrome
When user enters url "https://practice.expandtesting.com/login"
And user enters username as <username>
And user enters password as <password>
And user clicks on login 
Then user is redirected to logout page "Test Login Page for Automation Testing Practice"
Examples:
|username|password|
|"username1"|"password1"|
|"username2"|"password2"|
|"username3"|"password3"|
|"username4"|"password4"|
 