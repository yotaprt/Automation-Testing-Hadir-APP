Feature: Day off

  Scenario: Navigate to Dayoff page via Navbar
    Given User Successfully Login
    When User open navbar menu
    And User clicks on the Day off menu under Management
    Then User navigated to the Day Off page

  Scenario: Displaying "Cuti Bersama" and "Cuti Nasional" data on the Day Off menu
    Given User Successfully Login
    When User open navbar menu
    And User clicks on the Day off menu under Management
    Then The system displays Cuti Bersama and Cuti Nasional data on the Day Off page

  Scenario: Displaying "Date" and "Description" columns on the Day Off menu
    Given User Successfully Login
    When User open navbar menu
    And User clicks on the Day off menu under Management
    Then The system displays Cuti Bersama and Cuti Nasional data with Date and Description columns completely

  Scenario: Displaying complete and correct Day Off data
    Given User Successfully Login
    When User open navbar menu
    And User clicks on the Day off menu under Management
    Then The system displays complete and correct Cuti Bersama and Cuti Nasional date


