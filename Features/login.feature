Feature: login 

Background:
Given open chrome
When user enters url "https://practice.expandtesting.com/login"

Scenario: verify login functionality with valid cred
And user enters username as "practice"
And user enters password as "SuperSecretPassword!"
And user clicks on login 
Then user is redirected to logout page "Secure Page page for Automation Testing Practice"

@wip
Scenario: verify login functionality with invalid cred
And user enters username as "LikhitaScenario"
And user enters password as "aldklei"
And user clicks on login 
Then user is redirected to logout page "Test Login Page for Automation Testing Practice"
Then driver is close 


Scenario: verify login functionality with invalid cred

And user enters username as "LikhitaInvlid"
And user enters password as "aldklei"
And user clicks on login 
Then user is redirected to logout page "Test Login Page for Automation Testing Practice"

