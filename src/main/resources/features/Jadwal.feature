Feature: Manage Jadwal

  Scenario: User mengakses Page Jadwal via Navbar
    Given User login menggunakan akun admin-Jadwal
    When User membuka Navbar-Jadwal
    And User klik submenu Jadwal pada bagian menu Management-Jadwal
    Then User berhasil navigate ke page Jadwal

  Scenario: Menambahkan Jadwal Baru
    Given User berhasil login dengan akun admin & berada di page Jadwal
    When User klik tombol Tambah
    And User pilih Tipe Jadwal
    And User pilih Tanggal
    And User masukkan Jadwal Kerja
    And User pilih Hari Kerja
    And User masukkan batas Keterlambatan
    And User klik tombol Simpan
    Then Jadwal baru berhasil ditambahkan & Tidak adanya error yang muncul

    Scenario: Menambahkan Jadwal Baru tanpa mengisi field "Hari Kerja" 
    Given User berhasil login dengan akun admin & berada di page Jadwal
    When User klik tombol Tambah
    And User pilih Tipe Jadwal
    And User pilih Tanggal
    And User masukkan Jadwal Kerja
    And Kosongkan field Hari Kerja
    And User masukkan batas Keterlambatan
    And User klik tombol Simpan
    Then Jadwal gagal ditambahkan karena field Hari Kerja adalah mandatory

    Scenario: Melihat Detail Suatu Jadwal
    Given User berhasil login dengan akun admin & berada di page Jadwal
    When User klik action button
    And User klik Detail
    Then Mucul sebuah modal yang menampilkan detail dari Jadwal yang dipilih 

