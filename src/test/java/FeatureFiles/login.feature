Feature: Saleforce Login

@smoke
Scenario Outline: Saleforce home page login


Given Intialize the chrome driver
When user navaigates to "https://login.salesforce.com/?locale=in"
And enter <username> and <password>and click on login button
Then user should be able to login sucessfully


Examples:
|username|password|
|test1|hello1|
|test2|hello2|
