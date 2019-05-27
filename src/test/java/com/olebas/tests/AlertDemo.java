package com.olebas.tests;

import com.olebas.utils.ReadFileData;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

    public static void main(String[] args) throws InterruptedException, NoAlertPresentException {
        ReadFileData data = new ReadFileData();
        System.setProperty("webdriver.chrome.driver", data.getChromeDriver());
        WebDriver driver = new ChromeDriver();

        driver.get("http://demo.guru99.com/test/delete_customer.php");

        driver.findElement(By.name("cusid")).sendKeys("1488");
        driver.findElement(By.name("submit")).click();

        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        Thread.sleep(5000);

        alert.accept();
    }
}
