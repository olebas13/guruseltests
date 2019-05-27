package com.olebas.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RowAndCell {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement baseTable = driver.findElement(By.tagName("table"));

        WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
        String rowtext = tableRow.getText();
        System.out.println("Third row of table: " + rowtext);

        WebElement cellINeed = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[2]"));
        String valueINeed = cellINeed.getText();
        System.out.println("Cell value is: " + valueINeed);
        driver.close();
    }
}
