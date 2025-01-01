package com.juaracoding.drivers.strategies;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome implements DriverStrategy {

    private int geolocationSetting ; // Variabel untuk geolocation
    private int cameraSetting; 

    public Chrome() {
        System.setProperty("webdriver.chrome.driver", "./chromedriver-win64/chromedriver.exe");
    }

       public void setGeolocationSetting(int setting) {
        this.geolocationSetting = setting;
    }

    public void setCameraSetting(int setting) {
        this.cameraSetting = setting;
    }

    @Override
    public WebDriver setStrategy() {
        ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.geolocation", geolocationSetting);
        prefs.put("profile.default_content_setting_values.media_stream_camera", cameraSetting);
        options.setExperimentalOption("prefs", prefs);
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        return new ChromeDriver(options);
    }

}
