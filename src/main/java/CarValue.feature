Feature: Carguru login and see Car Value
Scenario Outline: Carguru login and to see Car Value
Given Carguru is Home Page
When title of Home Page is Carguru
Then user clicks on Car Values
Then user selects make model year and trim
Then user clicks zip and enters "<zip>"
Then user clicks mileage and enters mileage
Then user selects transmission and engine
Then user can see Market Value
Then user close browser
 
Examples:
| zip |
| 60133 |

   
