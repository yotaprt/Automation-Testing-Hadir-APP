Feature: Absen Masuk dan keluar

  Scenario: Berhasil Absen Masuk WFO
    Given Berada di halaman login WFO
    When Memasukan username dan password yang valid WFO
    And Melakukan Absen Masuk WFO
    # Then User berhasil melakukan absen masuk

  Scenario: Berhasil Absen Masuk WFH
    Given Berada di halaman login WFH
    When Memasukan username dan password yang valid WFH
    And Melakukan Absen Masuk WFH

  Scenario: Berhasil Absen Keluar
    Given Berada di halaman login absen keluar
    When Memasukan username dan password yang valid untuk absen keluar
    And Melakukan Absen Keluar
    # Then User berhasil melakukan absen masuk
  # @RegressionTest
  # Scenario: Berhasil Absen Masuk
  #   Given Berada di halaman login
  #   When Memasukan username dan password yang valid
  #   And Melakukan Absen Masuk dengan kamera mati
  #   # Then User berhasil melakukan absen masuk
