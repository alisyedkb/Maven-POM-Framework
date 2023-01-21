Feature: Title of your feature
  I want to validate login

  Scenario: Title of your scenario
    Given user launches chrome browser
    When user opens url "https:www.facebook.com/"
    And user enters email as "prince.ali23k@gmail.com" and password as "P@ssword1"
    And user clicks login
    Then page title should be "Facebook - log in or sign up"
    And close browser
    
   Scenario Outline:
    Given user launches chrome browser
    When user opens url "https:www.facebook.com/"
    And user enters email as "<email>" and password as "<password>"
    And user clicks login
    Then page title should be "Facebook - log in or sign up"
    And close browser

   Examples:
    |email|password|
    |prince.ali23k@gmail.com|P@ssword1|
    |test@icloud.com|P@ssword1|
    |testcase2@yahoo|P@ssword1|