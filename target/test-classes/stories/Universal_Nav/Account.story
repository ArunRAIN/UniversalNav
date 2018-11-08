Account

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

Scenario: Accounts - logged out state
Given user is logged out
When user hovers over SignIn
Then Oracle and Cloud Sign In panel must be stacked

Scenario: Accounts - logged in state
Given user is logged in Oracle account
When user hovers over Account
Then user name and heading Oracle account must be displayed


Scenario: Accounts - Oracle Account links verify
Given user is logged in Oracle account
When user hovers over Account
Then User verify Oracle account must have links:
|Option           |
|Sign Out         |
|Account          |
|Help             |


Scenario: Accounts - Cloud Sign In links verify
Given user is logged in Oracle account
When user hovers over Account
Then User verify Oracle signin must have links:
|Option|
|Free Cloud Platform Trial|
|Sign in                  |