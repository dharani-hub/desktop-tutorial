Feature: Login page
Scenario: Verify login page elements
 Given Launch the url
 Then Check presence of username field, password field, login button
 
 Scenario Outline: Verify Login Functionality
 Given Launch url
 And Enter username as ‘tomsmith’ and password as ‘SuperSecretPassword!’
 And Click on login button
 Then Verify the presence of ‘You logged into a secure area!’
