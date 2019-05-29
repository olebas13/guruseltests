package com.olebas.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class PriorityInTestNG {

    WebDriver driver;

    @Test(priority = 1)
    public void openBrowser() {
        driver = new ChromeDriver();
    }

    @Test(priority = 2)
    public void launchGoogle() {
        driver.get("http://www.google.co.in");
    }

    @Test(priority = 3)
    public void performSearch() {
        driver.findElement(By.xpath(".//*[@title='Поиск']")).sendKeys("Facebook");
    }

    @Test(priority = 4)
    public void FacebookPageTitleVerification() throws InterruptedException {
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle().contains("Facebook - Поиск в Google"), true);
    }

}
