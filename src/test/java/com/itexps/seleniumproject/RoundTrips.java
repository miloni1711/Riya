/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.seleniumproject;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RoundTrips {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = DriverUtil.getChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testRoundtrip() throws Exception {
    driver.get("https://www.riya.travel/");
    driver.findElement(By.xpath("//img[@alt='offer']")).click();
    driver.findElement(By.id("FromCity0")).click();
  
    driver.findElement(By.xpath("//ul[@id='ui-id-1']/li")).click();
   
    /*driver.findElement(By.id("FromCity0")).sendKeys("Chicago [CHI] - Chicago");*/
    driver.findElement(By.id("FromCity0")).click();
    driver.findElement(By.xpath("//*[@id=\"ToCity0\"]")).click();
    /*driver.findElement(By.xpath("//ul[@id='ui-id-7']/li")).click();*/
   /*driver.findElement(By.xpath("//*[@id=\"ToCity0\"]")).click();
    driver.findElement(By.id("ToCity0")).sendKeys("Mumbai [BOM] - Chhatrapati Shivaji Maharaj Airport");
    driver.findElement(By.id("ToCity0")).click();
    driver.findElement(By.xpath("//*[@id=\"depDate0\"]")).click();
    driver.findElement(By.linkText("6")).click();
    driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[2]/td[2]")).click();
    driver.findElement(By.xpath("//form[@id='Form1']/div/div/div/ul[2]/li/div[4]/div/div/div[2]/div/div[6]/div/div[3]/div/div[2]/div[5]")).click();
    driver.findElement(By.xpath("//button[@onclick='return validateSearch();']")).click();*/
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

