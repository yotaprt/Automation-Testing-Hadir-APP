Feature: Logout functionality on magang.dikahadir

  Scenario: Direct access to day off page without login
    When User accesses the day off page directly without login

  Scenario: Successful go to the day off page
    Given User is on login page for day off
    When User enters valid email and password for day off
    And User clicks login button for day off
    And User should be redirected to dashboard for day off
    When User clicks the sidebar button for day off
    And User clicks the management button on sidebar
    And User clicks day off button

  Scenario: validate form "Cuti Bersama" on the day off page
    Given User is on login page for day off
    When User enters valid email and password for day off
    And User clicks login button for day off
    And User should be redirected to dashboard for day off
    When User clicks the sidebar button for day off
    And User clicks the management button on sidebar
    And User clicks day off button
    When User should see "Cuti Bersama" text on the Day Off page for cuti bersama