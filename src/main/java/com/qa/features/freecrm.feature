Feature: FreeCRM application test

Scenario: Validate Free CRM Home Page test

Given user opens browser
Then user is on login page
Then user logs into app
Then validate homepage title
#Then validate logged in username