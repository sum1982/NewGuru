Feature: Customer can sell there car
Scenario Outline: user can use SellMyCar Scenario
Given user is on Carguru
When title of Homepage is Carguru
Then user clicks on Sell My Car button
Then user enters data "<zip>" 
Then user selects maker model year and trim
Then user sees Results Page

Examples:
| zip |
| 60133 |
    

   
