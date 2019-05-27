package com.olebas.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDemo {

    public static void main(String[] args) {
        String baseUrl = "http://demo.guru99.com/test/write-xpath-table.html";
        WebDriver driver = new ChromeDriver();

        driver.get(baseUrl);
        String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
        System.out.println(innerText);
        driver.quit();
    }
}
