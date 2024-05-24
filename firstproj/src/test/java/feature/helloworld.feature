@Test
Feature: Home page validation 

@Regression
Scenario: Verify loading appears after clicking on Start button
Given Launch the browser
Given Load the url 
And Click on StartButton
Then Verify if loading appears and check if Hello world is visible after loading