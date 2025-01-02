Feature: Login

   Scenario Outline: Login with email and password valid
    Given I am on the login page
    When I enter email "<email>" and password "<password>"
    And I click the login button
    Then I should be redirected to dashboard page

    Examples:
      | email           | password    |
      | admin@hadir.com | admin@hadir |

  # TCC.Hadir.01.002, TCC.Hadir.01.003,
  # TCC.Hadir.01.006 - TCC.Hadir.01.009
  Scenario Outline: Login with email and password invalid
    Given I am on the login page
    When I enter email "<email>" and password "<password>"
    And I click the login button
    Then User failed to login

    Examples:
      | email                | password    | 
      | invalid@hadir.com    | admin@hadir | 
      | notactive2@gmail.com | 12345678    | 
      |                      |             | 
      |                      | admin@hadir | 
      | admin@hadir.com      |             | 
      | admin@hadir.com      | invalid     | 

  # # TCC.Hadir.01.004 - TCC.Hadir.01.005, TCC.Hadir.01.077
  # Scenario Outline: Login with invalid format email
  #   Given I am on the login page
  #   When I enter email "<email>" and password "<password>"
  #   And I click the login button
  #   Then Failed to login and still in the login page "<url>"

  #   Examples:
  #     | email             | password    | url                                               |
  #     | adminhadir.com    | admin@hadir | https://magang.dikahadir.com/authentication/login |
  #     | adm@in@hadir.com  | admin@hadir | https://magang.dikahadir.com/authentication/login |
  #     | ahay@gmailcom     | 12345678    | https://magang.dikahadir.com/authentication/login |

  # # TCC.Hadir.01.010
  # Scenario Outline: Password masking verification when entering password
  #   Given I am on the login page
  #   When I enter email "<email>" and password "<password>"
  #   Then Password value is hidden

  #   Examples:
  #     | email           | password    |
  #     | admin@hadir.com | admin@hadir |

  # # TCC.Hadir.01.011
  # Scenario Outline: Disable password masking
  #   Given I am on the login page
  #   When I enter email "<email>" and password "<password>"
  #   And I click hidden password button
  #   Then Password value revealed

  #   Examples:
  #     | email           | password    |
  #     | admin@hadir.com | admin@hadir |
