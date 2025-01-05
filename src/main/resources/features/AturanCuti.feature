Feature: Jadwal

  # Scenario: Melihat Halaman Aturan Cuti
  #   Given Berada di halaman login admin aturan cuti
  #   When Memasukan email dan password aturan cuti
  #   And Membuka Aturan Cuti

  # Scenario: Menambahkan Data Aturan Cuti
  #   Given Login admin dan membuka aturan cuti
  #   When Menambahkan data Aturan Cuti
  #   # And Menambahkan Aturan Cuti Baru
  #   Then Data Aturan Cuti berhasil ditambahkan


  Scenario: Menambahkan Invalid Data Aturan Cuti
    Given Login admin dan membuka aturan cuti
    When Menambahkan invalid data Aturan Cuti
    # And Menambahkan Aturan Cuti Baru
    Then User gagal menambahkan Aturan Cuti & Muncul error message