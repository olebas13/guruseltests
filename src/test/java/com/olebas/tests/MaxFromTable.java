package com.olebas.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class MaxFromTable {

    public static void main(String[] args) throws ParseException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        String max;
        double m = 0;
        double r = 0;

        List col = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/thead/tr/th"));
        System.out.println("Total No of columns are: " + col.size());

        List rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        System.out.println("Total No of rows are: " + rows.size());

        for (int i = 1; i < rows.size(); i++) {
            max = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[" + (i + 1) + "]/td[4]")).getText();
            NumberFormat f = NumberFormat.getNumberInstance();
            Number num = f.parse(max);
            max = num.toString();
            m = Double.parseDouble(max);
            if (m > r) {
                r = m;
            }
        }
        System.out.println("Maximum current price is: " + r);
    }
}
