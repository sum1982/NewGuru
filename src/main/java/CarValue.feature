Feature: Carguru login and see Car Value
Scenario Outline: Carguru login and to see Car Value
Given Carguru is Home Page
When title of Home Page is Carguru
Then user clicks on My account dropdown
Then user clicks on Sign in/Ragister button
And user enters "<email>"
Then user clicks on Next button and enters "<Password>"
Then user clicks on Sign in button
Then user is on home page
Then user clicks on Car Values
Then user selects make model year and trim
Then user clicks zip and enters "<zip>"
Then user clicks mileage and enters mileage
Then user selects transmission and engine
Then user can see Market Value
Then user close browser
 
Examples:
| email | password | zip |
| kohli.sumeet@ymail.com | Test1234 | 60133 |

   
