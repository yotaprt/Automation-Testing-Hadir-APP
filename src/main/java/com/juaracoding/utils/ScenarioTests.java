package com.juaracoding.utils;

public enum ScenarioTests {

    // T1 - T10000
    // feature login
    T1("Successful login with valid credentials"),
    T2("Invalid login with invalid credentials"),
    // feature recruitment
    T3("Admin add new candidate"),
    T4("User"),
    T5("test"),
    T6("ss"),
    T7("sss"),
    T8("ssss"),
    T9("sssss"),
    T10("ssssss"),
    T11("sssssss"),
    T12("ssssssss"),
    T13("sssssssss"),
    T14("ssssssssss"),
    T15("sssssssssss"),
    T16("ssssssssssss"),
    T17("sssssssssssss"),
    T18("ssssssssssssss"),
    T19("sssssssssssssss"),
    T20("ssssssssssssssss"),
    T21("sssssssssssssssss");


    private String scenarioTestName;

    ScenarioTests(String value){
        scenarioTestName = value;
    }

    public String getScenarioTestName(){
        return scenarioTestName;
    }

}
