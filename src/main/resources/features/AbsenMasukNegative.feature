Feature: Absen Masuk kamera mati

  Scenario: User Gagal Masuk Absen Masuk tanpa kamera
    Given Admin Berhasil Login
    When Melakukan Absen Masuk dengan Kamera Mati
    Then User Gagal Melakukan Absen Masuk dengan Kamera Mati
