Feature: Manage Jadwal

  Scenario: User mengakses Page Jadwal via Navbar
    Given User login menggunakan akun admin-Jadwal
    When User membuka Navbar-Jadwal
    And User klik submenu Jadwal pada bagian menu Management-Jadwal
    Then User berhasil navigate ke page Jadwal

  Scenario: Menambahkan Jadwal Baru
    Given User berhasil login & berada di page Jadwal
    When User klik tombol Tambah
    And User pilih Tipe Jadwal
    And User pilih tanggal
    And User masukkan jadwal kerja
    And User pilih hari kerja
    And User masukkan keterlambatan
    And User klik tombol Simpan
    Then Jadwal baru berhasil ditambahkan & Tidak adanya error yang muncul



