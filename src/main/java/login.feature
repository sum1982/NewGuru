Feature:  Carguru Login Test Feature 
Scenario Outline: Carguru Login Scenario
Given Carguru is Home Page
When title of Home Page is Carguru
Then user clicks on My account dropdown
Then user clicks on Sign in/Ragister button
And user enters "<email>"
Then user clicks on Next button and enters "<Password>"
Then user clicks on Sign in button
Then user is on home page
Then user close browser

Examples:
| email | Password |
| kohli.sumeet@ymail.com | esty1234 |
| kohli.sumeet@ymail.com | Test1234 |

