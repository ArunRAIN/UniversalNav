Menu 

Narrative:
In order to view stories
As a user
I want to view page

Meta:@skip

Scenario: Menu
Given user is on the OCOM  page
When the page loads
Then menu must appear on the left of the Oracle Badge

Scenario: Navigate tositepage
Given Menu panel opened
When user clicks on a link
Then user must navigate to that page

Scenario: Hover over menu
Given Global Nav loads
When user hovers over menu icon
Then panels must load progressively