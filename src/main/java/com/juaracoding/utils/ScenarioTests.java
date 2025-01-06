package com.juaracoding.utils;

public enum ScenarioTests {

     T1("Test Scenario");

    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }

}
