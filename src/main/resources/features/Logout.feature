Feature: Logout

  Scenario: Successful Logout  with valid credentials
    Given User already logged in
    When User click proflie
    And User click logout button
    Then User navigated to the login page