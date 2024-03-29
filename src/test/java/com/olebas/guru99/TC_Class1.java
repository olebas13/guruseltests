package com.olebas.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TC_Class1 {

    public static final WebDriver driver = new ChromeDriver();

    String launchPageHeading = "//h2[text()='Guru99 Bank']";
    final String userName_element = "//input[@name='uid']";
    final String password_element = "//input[@name='password']";
    final String signIn_element = "//input[@name='btnLogin']";
    final String userName_value = "mngr197789";
    final String password_value = "nUgaqeh";
    final String managerID = "//td[contains(text(),'Manger Id')]";
    final String newCustomer = "//a[@href='addcustomerpage.php']";
    final String fundTransfer = "//a[@href='FundTransInput.php']";

    /**
     * This test case will initialize the webdriver
     */
    @Test(groups = {"bonding", "strong_ties"})
    public void tc01LaunchURL() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.demo.guru99.com/V4/");
    }

    /**
     * Will check the presence of Heading on Login Page
     */
    @Test(groups = {"bonding"})
    public void tc02VerifyLaunchPage() {
        Assert.assertTrue(driver.findElement(By.xpath(launchPageHeading)).isDisplayed(),
                "Home Page heading is not displayed");
        System.out.println("Home Page heading is displayed");
    }

    /**
     * This test case will enter Username, password and will then click on
     * signIn button
     */
    @Test(groups = {"bonding", "strong_ties"})
    public void tc03EnterCredentials() {
        driver.findElement(By.xpath(userName_element)).sendKeys(userName_value);
        driver.findElement(By.xpath(password_element)).sendKeys(password_value);
        driver.findElement(By.xpath(signIn_element)).click();
    }

    /**
     * This test case will verify manager's ID presence on Dashboard
     */
    @Test(groups = {"strong_ties"})
    public void tc04VerifyLoggedInPage() {
        Assert.assertTrue(driver.findElement(By.xpath(managerID)).isDisplayed(),
                "ManagerID label is not displayed");
        System.out.println("Manager ID is displayed");
    }

    /**
     * This test case will check the presence of New customer link
     * and Fund Transfer link in left panel
     */
    @Test(groups = {"bonding"})
    public void tc05VerifyHyperlinks() {
        Assert.assertTrue(driver.findElement(By.xpath(newCustomer)).isEnabled(),
                "New customer hyperlink is not displayed");
        System.out.println("New customer hyperlink is displayed");

        Assert.assertTrue(driver.findElement(By.xpath(fundTransfer)).isEnabled(),
                "Fund Transfer hyperlink is not displayed");
        System.out.println("Fund Transfer hyperlink is displayed");
    }
}
