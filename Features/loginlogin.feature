Feature: loginlogin feature


Scenario: verify login functionality with invalid cred
Given open chrome
When user enters url "https://practice.expandtesting.com/login"
And user enters username as "2ndFeature"
And user enters password as "aldklei"
And user clicks on login 
Then user is redirected to logout page "Test Login Page for Automation Testing Practice"
