Feature: History Absensi

  @RegressionTest
  Scenario: Successful user to history absensi
    Given I am on the login user
    When I enter user a valid username and password and login
    And I click the login button selengkapnya
    Then I should be redirected to dashboard history absensi

  Scenario: Successful login user with valid credentials absensi
    Given I am on the login user absensi
    When I enter user a valid username and password and login absensi
    And I click the login button absensi
    Then I should be redirected to dashboard history absensi 2
