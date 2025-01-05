Feature: Absen Masuk kamera mati

  Scenario: Berhasil Absen Masuk
    Given Berada di halaman login
    When Memasukan username dan password yang valid
    And Melakukan Absen Masuk dengan kamera mati
    # Then User berhasil melakukan absen masuk
