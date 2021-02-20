Feature: Home Page Sliders
Scenario: positive sliders scenario
Given user is on practice site
When user clicks on shop menu
And user clicks on home button
Then user checks whether home page has three sliders

Scenario: positive sliders scenario
Given user is on practice site
When user clicks on shop menu
And user clicks on home button
Then user checks whether home page has three arrivals

Scenario: positive sliders scenario
Given user is on practice site
When user clicks on shop menu
And user clicks on home button
Then user must click on image and add to basket

Scenario: positive sliders scenario
Given user is on practice site
When user clicks on shop menu
And user clicks on home button
And user checks whether home page has three arrivals
And user must click on image and add to basket
And user clicks on description tab
Then description should be shown

Scenario: positive sliders scenario
Given user is on practice site
When user clicks on shop menu
And user clicks on home button
And user checks whether home page has three arrivals
And user must click on image and add to basket
And user clicks on description tab
And user clicks on reviews tab
Then it must contain reviews