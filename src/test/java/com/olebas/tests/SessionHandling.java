package com.olebas.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SessionHandling {

    public static void main(String... strings) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");

        WebDriver driver2 = new ChromeDriver();
        driver2.get("http://demo.guru99.com/V4/");
    }
}
