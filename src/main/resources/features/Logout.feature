Feature: Logout

  @RegressionTest
  Scenario: Successful Logout  with valid credentials
    Given Admin telah login
    When Klik User Profile
    Then Klik tombol Log Out