Feature: Absen Masuk dan keluar

  Scenario: Berhasil Absen Masuk Tanpa Selfie
    Given Berada di halaman login tanpa selfie
    When Memasukan username dan password yang valid tanpa selfie
    And Melakukan Absen Masuk tanpa selfie
    Then User berhasil melakukan absen masuk tanpa selfie

  Scenario: Berhasil Absen Masuk WFO
    Given Berada di halaman login WFO
    When Memasukan username dan password yang valid WFO
    And Melakukan Absen Masuk WFO
    Then User berhasil melakukan absen masuk WFO

  Scenario: Berhasil Absen Masuk WFH
    Given Berada di halaman login WFH
    When Memasukan username dan password yang valid WFH
    And Melakukan Absen Masuk WFH
    Then User berhasil melakukan absen masuk WFH

  Scenario: Berhasil Absen Keluar
    Given Berada di halaman login absen keluar
    When Memasukan username dan password yang valid untuk absen keluar
    And Melakukan Absen Keluar
    Then User berhasil melakukan absen keluar

  Scenario: Berhasil Absen Keluar Tanpa Note
    Given Berada di halaman login absen keluar tanpa note
    When Memasukan username dan password yang valid untuk absen keluar tanpa note
    And Melakukan Absen Keluar tanpa note
    Then User berhasil melakukan absen keluar tanpa note
