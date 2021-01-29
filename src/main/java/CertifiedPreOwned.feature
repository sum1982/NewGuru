Feature: Finding Certified pre-owned cars
Scenario Outline: user can see Certified Pre-Owned Cars Scenario
Given user is already on Carguru
When user mouses over certified pre owned
Then user Clicks on Certified Pre-Owned
Then user selects make and model
Then user clicks and enters "<zip>"
And user clicks on Search
Then user can see Certified Pre-Owned cars

Examples:
| zip |
| 60133 |

   
