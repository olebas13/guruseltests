package com.olebas.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadFileData {

    private Properties prop = new Properties();


    public ReadFileData() {

        File file = new File((System.getProperty("user.dir") + "/src/main/resources/Config.properties"));

        FileInputStream fileInput = null;
        try {
            fileInput = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            prop.load(fileInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFile() {
        return System.getProperty("user.dir") + prop.getProperty("LOAD_FILE");
    }

    public String getChromeDriverForLinux() {
        return prop.getProperty("CHROME_DRIVER_LINUX");
    }

    public String getFFDriverForLinux() {
        return prop.getProperty("FIREFOX_DRIVER_LINUX");
    }

    public String getChromeDriver() {
        return System.getProperty("user.dir")+prop.getProperty("CHROME_DRIVER");
    }

    public String getFFDriver() {
        return prop.getProperty("FIREFOX_DRIVER");
    }
}
