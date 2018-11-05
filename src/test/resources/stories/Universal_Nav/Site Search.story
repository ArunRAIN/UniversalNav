Site Search

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development

eta:@skip		
			 
Scenario: Search - Inactive
Given user is on the OCOM  page
When Global Nav loads
Then Search text must be followed with a search icon


Scenario: Search - Active
Given Global Nav loads
When user clicks on the search icon
Then search field must open


Scenario: Search - Active
Given user clicked onsearch icon
When search field opens
Then text search and cursor must appear in the field


Scenario: Search - Close
Given search box in open
When user clicks away from search field
Then search must show inactive state


Scenario: Search with a keyword
Given user entered a keyword
When user clicks onsearch icon
Then user must navigate to site search page
