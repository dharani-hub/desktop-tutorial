@Test
Feature: Testing tagged hooks
@Regression
Scenario: Test the search results
  Given Google is open in the browser
  When User searches for Lambda Test
  Then Results are displayed