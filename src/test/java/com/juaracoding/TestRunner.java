package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

// @CucumberOptions(features = {"src/main/resources/features/Kalender.feature", "src/main/resources/features/AbsenMasukKeluar.feature", "src/main/resources/features/DayOff.feature",
//         "src/main/resources/features/Logout.feature", "src/main/resources/features/Login.feature"},
 @CucumberOptions(features = {"src/main/resources/features/Login.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
