Feature: Login User

  @RegressionTest
  Scenario: Successful login user with valid credentials
    Given I am on the login user page
    When I enter user a valid username and password
    And I click the login button user
    Then I should be redirected to dashboard page user

  Scenario: User login dengan email yang tidak valid
    Given I am on the login user page 2
    When I enter user a valid username and password 2
    And I click the login button user 2
    Then message akun tidak ditemukan

  Scenario: User login dengan password yang tidak valid
    Given I am on the login user page 3
    When I enter user a valid username and password 3
    And I click the login button user 3
    Then Message Email atau password salah
