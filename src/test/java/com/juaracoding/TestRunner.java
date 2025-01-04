package com.juaracoding;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/resources/features/tes.feature"},
// @CucumberOptions(features = {"src/main/resources/features/03LoginUser.feature","src/main/resources/features/HistoryAbsensi.feature","src/main/resources/features/01Login.feature","src/main/resources/features/02Logoutathif.feature"},
        glue = "com.juaracoding",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
