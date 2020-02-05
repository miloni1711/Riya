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

public class Signin {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = DriverUtil.getChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.manage().window().maximize();
  }

  @Test
  public void testRiy() throws Exception {
    driver.get("https://www.riya.travel/");
    driver.findElement(By.xpath("//img[@alt='offer']")).click();
    driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[1]/a")).click();
    driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div[1]/div/ul/li[1]/a")).click();
    driver.findElement(By.xpath("/html/body/section/div/div/div[1]/form/div[2]/label")).click();
    driver.findElement(By.id("UserName")).sendKeys("milup709@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("Miloni1711@");
    driver.findElement(By.xpath("/html/body/section/div/div/div[1]/form/div[8]/div[2]/button")).click();
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
