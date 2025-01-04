Feature: Laporan Izin Terlambat

  Scenario: User mengakses menu Izin Terlambat via Navbar
    Given The user has successfully logged in as an admin
    When User open navbar menu
    And User click on the Izin Terlambat menu under Laporan
    Then User navigated to the Laporan Izin Terlambat page

  Scenario: Table Izin Terlambat menampilkan kolom User, Nama Upliner, Tanggal Izin, Status
    Given The user has successfully logged in as an admin
    When User navigate to Laporan Izin Terlambat page
    Then The table should displaying column of user
    And Displaying Nama Upliner column
    And Displaying Unit column
    And Displaying Tanggal Izin column
    And Displaying Status column


  Scenario: Search data Laporan Izin Terlambat berdasarkan nama User
    Given The user has successfully logged in as an admin
    When The user navigates to the Laporan Izin Terlambat page
    And The user inputs the User's name in the Search field
    And The user clicks Search button
    Then The system displays data that matches the searched User name
    
    
    Scenario: Search data Laporan Izin Terlambat berdasarkan nama User yang tidak ada
    Given The user has successfully logged in as an admin
    When The user navigates to the Laporan Izin Terlambat page
    And The user inputs the unknown User's name in the Search field
    And The user clicks Search button
    Then The system displays tables with empty data