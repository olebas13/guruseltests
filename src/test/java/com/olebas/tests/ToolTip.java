package com.olebas.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/social-icon.html");

        String expectedToolTip = "Github";

        WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

        String actualToolTip = github.getAttribute("title");
        System.out.println("Actual Title of Tool tip: " + actualToolTip);

        if (actualToolTip.equals(expectedToolTip)) {
            System.out.println("Test Case passed");
        } else {
            System.out.println("Test case failed");
        }
        driver.close();
    }
}
