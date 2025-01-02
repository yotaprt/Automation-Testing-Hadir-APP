Feature: Manage Kalender

  Scenario: Navigate to Kalender page
    Given User login menggunakan akun admin
    When User membuka Navbar
    And User klik submenu Kalender pada bagian menu Management
    Then User berhasil navigate ke page Kalender

  Scenario: Tambahkan Kalender Unit
    Given User login menggunakan akun admin dan berada di page Kalender
    When User klik button Tambahkan Kalender
    And User memasukkan nama untuk Kalender Unit yang ingin ditambahkan
    And User klik button Tambah
    Then Kalender Unit baru berhasil ditambahkan

  Scenario: Tambahkan Kalender Unit dengan field nama kosong
    Given User login menggunakan akun admin dan berada di page Kalender
    When User klik button Tambahkan Kalender
    And User tidak mengisi field nama untuk Kalender Unit
    And User klik button Tambah
    Then Kalender Unit baru gagal ditambahkan karena field nama adalah mandatory

#   Scenario: Cari Kalender Unit
#     Given User login menggunakan akun admin
#     And User berada di page Kalender
#     When User masukkan nama Kalender Unit yang ingin dicari pada field "Search"
#     And User klik button "Search"
#     Then Kalender Unit yang ditampilkan pada table sesuai dengan nama yang diinputkan pada field "Search"

#   Scenario: Reset hasil pencarian Kalender Unit
#     Given User login menggunakan akun admin
#     And User berada di page Kalender
#     When User masukkan nama Kalender Unit yang ingin dicari pada field "Search"
#     And User klik button "Search"
#     And User klik button "Reset"
#     Then Data table ter-reset ulang seperti kondisi awal
