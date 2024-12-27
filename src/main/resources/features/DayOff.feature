Feature: Logout functionality on magang.dikahadir

  Scenario: Direct access to day off page without login
    Given User Successfully Login
    When User open navbar menu
    And Click Dayoff menu in management
    Then User navigated to the Day Off page

    