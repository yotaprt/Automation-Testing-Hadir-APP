Feature: Aturan Cuti

  Scenario: Menambahkan Data Aturan Cuti
    Given Login admin dan membuka aturan cuti
    When Menambahkan data Aturan Cuti
    Then Data Aturan Cuti berhasil ditambahkan

  Scenario: Gagal Menambahkan Data Aturan Cuti Tanggal Batas Sisa Cuti Invalid
    Given Login admin dan membuka aturan cuti
    When Menambahkan data Aturan Cuti Tanggal Batas Sisa Cuti Invalid
    And Tambahkan Aturan Cuti Baru Tanggal Batas Sisa Cuti Invalid
    Then Admin gagal Menambahkan Aturan Cuti Tanggal Batas Sisa Cuti Invalid

  Scenario: Gagal Menambahkan Data Aturan Cuti Bulan Batas Sisa Cuti Invalid
    Given Login admin dan membuka aturan cuti Negative Bulan Batas Sisa Cuti
    When Menambahkan data Aturan Cuti Negative Bulan Batas Sisa Cuti
    And Tambahkan Aturan Cuti Baru Negative Bulan Batas Sisa Cuti
    Then Admin Gagal Menambahkan Aturan Cuti Negative Bulan Batas Sisa Cuti

  Scenario: Admin Mencari data yang disearch pada menu Aturan Cuti
    Given Login admin untuk mencari data Aturan Cuti
    When Mencari data Aturan Cuti
    And Klik tombol cari data Aturan Cuti
    Then Admin Menemui data Aturan Cuti yang di cari

  Scenario: Admin Mencari data yang disearch untuk direset
    Given Login admin untuk mereset data Aturan Cuti
    When Mencari data Aturan Cuti untuk direset
    And Klik tombol cari data Aturan Cuti untuk mereset
    Then Admin Menemui data Aturan Cuti yang di cari dan telah direset

  Scenario: Melihat detail data Aturan Cuti
    Given Login admin untuk melihat data Aturan Cuti
    When Melihat data Aturan Cuti
    And Klik tombol View untuk melihat detail data Aturan Cuti
    Then Admin Berhasil membuka detail data Aturan Cuti

  Scenario: Menghapus  data Aturan Cuti
    Given Login admin untuk menghapus data Aturan Cuti
    When Admin klik aksi di titik tiga Aturan Cuti
    And Admin klik tombol delete untuk menghapus data Aturan Cuti
    Then Admin Berhasil Menghapus data Aturan Cuti

  Scenario: Edit data Aturan Cuti
    Given Login admin dan membuka aturan cuti untuk edit data Aturan Cuti
    When Admin klik aksi di titik tiga Aturan Cuti untuk edit data Aturan Cuti
    And Admin edit data Aturan Cuti
    Then Data Aturan Cuti berhasil diedit

  Scenario: Edit data Aturan Cuti Invalid
    Given Login admin dan membuka aturan cuti untuk edit data Aturan Cuti negative
    When Admin klik aksi di titik tiga Aturan Cuti untuk edit data Aturan Cuti negative
    And Admin edit data Aturan Cuti negative
    Then Data Aturan Cuti Gagal Diedit

  Scenario: Menambahkan Detail data Aturan Cuti
    Given Login admin untuk menambahkan detail data Aturan Cuti
    When Menambahkan data Aturan Cuti untuk menambahkan detail data Aturan Cuti
    And Admin menambahkan detail aturan cuti
    Then Admin Berhasil Menambahkan detail data Aturan Cuti

  Scenario: Menambahkan Detail data Aturan Cuti Invalid
    Given Login admin untuk menambahkan detail data Aturan Cuti Invalid
    When Menambahkan data Aturan Cuti untuk menambahkan detail data Aturan Cuti Invalid
    And Admin menambahkan detail aturan cuti Invalid
    Then Admin Gagal Menambahkan detail data Aturan Cuti Invalid

  Scenario: Menghapus data Detail Aturan Cuti
    Given Login admin untuk Menghapus data detail Aturan Cuti
    When Admin klik aksi di titik tiga untuk menghapus data Detail Aturan Cuti
    And Admin klik tombol delete untuk menghapus data Detail Aturan Cuti
    Then Admin Berhasil Menghapus data Detail Aturan Cuti

  Scenario: Mengedit data Detail Aturan Cuti
    Given Login admin untuk Edit data detail Aturan Cuti
    When Admin klik aksi di titik tiga untuk Edit data Detail Aturan Cuti
    And Admin Edit data Detail Aturan Cuti
    Then Admin Berhasil Edit data Detail Aturan Cuti

  Scenario: Mengedit data Detail Aturan Cuti Invalid
    Given Login admin untuk Edit data detail Aturan Cuti Invalid
    When Admin klik aksi di titik tiga untuk Edit data Detail Aturan Cuti Invalid
    And Admin Edit data Detail Aturan Cuti Invalid
    Then Admin Gagal Edit data Detail Aturan Cuti
