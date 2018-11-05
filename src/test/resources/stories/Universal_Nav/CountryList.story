Narrative:
Display Countries list for corresponding regions

eta:@skip 
Scenario: Show regions and its countries
Given Global Nav loads
When user hovers over 'Country/Region'
Then panel must show Regions in the 1st panel and their countries in the 2nd panel
Then based on country site pin must appear against it