Feature: Login

  @RegressionTest
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter a valid username and password
    And I click the login button
    Then I should be redirected to dashboard page

  @SmokeTest
  Scenario: Invalid login with invalid credentials
    Given I am logout
    When I enter a invalid username and password
    And I click the login button
    Then I see message invalid credentials
