Feature: Login User

  @RegressionTest
  Scenario: Successful login user with valid credentials
    Given I am on the login user page
    When I enter user a valid username and password
    And I click the login button user
    Then I should be redirected to dashboard page user
