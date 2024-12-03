@tags
Feature: Github login on chrome browser

@tag1 
  Scenario: User logins with valid credentials
    Given User is on Github login page
    When User enters valid email "emaiilID" and password "Password"
    Then User should be able to login successfully
 
    
@tag2
  Scenario: User logins with invalid credentials
    Given User is on Github login page1
    When User enters invalid email1 "emailID" and password1 "Password"
    Then User should not be able to login successfully