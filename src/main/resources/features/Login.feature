Feature: Login

   Scenario Outline: Login with email and password valid
    Given I am on the login page
    When I enter email "<email>" and password "<password>"
    And I click the login button
    Then I should be redirected to dashboard page

    Examples:
      | email          | password     |
      | zaki1@test.com | zakiyanto123 |


  Scenario Outline: Login with invalid email and password
    Given I am on the login page
    When I enter email "<email>" and password "<password>"
    And I click the login button
    Then User failed to login

    Examples:
      | email                | password     | 
      | invalid@hadir.com    | zakiyanto123 | 
      |                      |              | 
      |                      | zakiyanto123 | 
      | zaki1@test.com       |              | 
      | zaki1@test.com       | invalid      | 