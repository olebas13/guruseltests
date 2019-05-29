package com.olebas.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestGuruMultipleSession {

    @Test
    public void executeSessionOne() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 1");
    }

    @Test
    public void executeSessionTwo() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 2");
    }

    @Test
    public void executeSessionThree() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/V4/");
        driver.findElement(By.name("uid")).sendKeys("Driver 3");
    }
}
