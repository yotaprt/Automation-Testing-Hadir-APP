package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(features = {"src/main/resources/features/HistoryAbsensi.feature"},
// @CucumberOptions(features = {"src/main/resources/features/03LoginUser.feature","src/main/resources/features/HistoryAbsensi.feature","src/main/resources/features/01Login.feature","src/main/resources/features/02Logoutathif.feature"},
@CucumberOptions(features = {"src/main/resources/features/Kalender.feature", 
"src/main/resources/features/AturanCuti.feature",
 "src/main/resources/features/DayOff.feature",
"src/main/resources/features/Logout.feature", 
"src/main/resources/features/Login.feature",
"src/main/resources/features/DayOff.feature",
"src/main/resources/features/IzinTerlambat.feature",
"src/main/resources/features/Jadwal.feature",
"src/main/resources/features/HistoryAbsensi.feature",
"src/main/resources/features/AbsenMasukNegative.feature",
"src/main/resources/features/AbsenMasukKeluar.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
