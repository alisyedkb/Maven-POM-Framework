Feature: Test Login Functionality
  I want to use this template for my feature file

  Scenario: Check Login Success with Valid Credentials
    Given user is on the login page
    When user enters username and password
    And clicks on the login button
    Then user is successfully logged in
