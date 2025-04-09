@Smoke @Regression @Login #These @Tags can be use to run testcases individually. You can see this in Testrunner file.
Feature: Login to SauceDemo

  Scenario: Successful login with valid credentials
    Given User is on the SauceDemo login page
    When User enters valid username and password
    And Clicks on the login button
    Then User should be navigated to the homepage
