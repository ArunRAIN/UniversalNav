Searchautosuggest

Narrative:
In order to communicate effectively to the business some functionality
As a development team
I want to use Behaviour-Driven Development
					 
Scenario: Suggest search keywords 
Given user clicked in the search field
When user begins to type keyword 'ora'
Then auto suggestion must appear

Scenario: Autosuggest retracts 
Given autosuggest appears
When user clicks outside the search field
Then autosuggest must retract

Scenario: Autosuggest reappears as user types keyword
Given autosuggestion retracted
When user continues to enterkeyword
Then autosuggest must reappear


Scenario: Select from auto suggestedkeywords
Given search field shows autosuggestions
When user selects an option and clickssearch icon
Then results must be displayed on Oracle search page