Feature: Absen Masuk dan keluar
@Positive
  Scenario: Berhasil Absen Masuk WFO
    Given Berada di halaman login WFO
    When Memasukan username dan password yang valid WFO
    And Melakukan Absen Masuk WFO
    # Then User berhasil melakukan absen masuk

@Positive2
  Scenario: Berhasil Absen Masuk WFH
    Given Berada di halaman login WFH
    When Memasukan username dan password yang valid WFH
    And Melakukan Absen Masuk WFH
  # Scenario: Berhasil Absen Keluar
  #   Given Berada di halaman login absen keluar
  #   When Memasukan username dan password yang valid untuk absen keluar
  #   And Melakukan Absen Keluar
  # Scenario: Berhasil Absen Keluar Tanpa Note
  #   Given Berada di halaman login absen keluar tanpa note
  #   When Memasukan username dan password yang valid untuk absen keluar tanpa note
  #   And Melakukan Absen Keluar tanpa note
  #   # Then User berhasil melakukan absen masuk
  # @RegressionTest
  # Scenario: Berhasil Absen Masuk
  #   Given Berada di halaman login
  #   When Memasukan username dan password yang valid
  #   And Melakukan Absen Masuk dengan kamera mati
  #   # Then User berhasil melakukan absen masuk
