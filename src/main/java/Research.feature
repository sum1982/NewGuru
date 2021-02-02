Feature: Researching for car
Scenario Outline: user is able to Research for car Scenario
Given user is on Carguru webpage
When user hover over Research button
Then user clicks on Research button
Then user selects make model and year
Then user clicks search
Then user clicks zipcode and enters "<zipcode>"
Then user clicks Find Deals
Then user can see Research results

Examples:
| zipcode |
| 60133 |
    

   
