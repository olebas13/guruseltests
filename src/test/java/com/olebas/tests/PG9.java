package com.olebas.tests;

import com.olebas.utils.ReadFileData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG9 {

    public static void main(String[] args) {
        ReadFileData data = new ReadFileData();
        System.setProperty("webdriver.chrome.driver", data.getChromeDriver());
        String baseUrl = "http://demo.guru99.com/test/upload/";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

        uploadElement.sendKeys("C:\\Users\\olebas13\\Desktop\\pictures\\serious_cat.jpg");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
    }
}
