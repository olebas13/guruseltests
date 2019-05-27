package com.olebas.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedTableDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/accessing-nested-table.html");

        String innerText = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(innerText);
        driver.quit();
    }
}
