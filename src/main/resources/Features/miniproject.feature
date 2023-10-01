Feature: CapstoneProject

Scenario: Navigating to different links in internet page

Given open the chrome browser
And user is in main page
When user clicks on ABTesting button
Then navigate to AB homepage
Then navigate to main page

When user clicks on Dropdown button
When user selects option1 from dropdown
Then navigate to main page
 When user clicks on Frames button
 Then verify the page displays link