/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author milon
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 *
 * @author milon
 */
public class DriverUtil {
    public static WebDriver getChromeDriver(){
       System.setProperty("webdriver.chrome.driver", "c:\\QA\\drivers\\chromedriver.exe");
       DesiredCapabilities capabilities= DesiredCapabilities.chrome();
       return new ChromeDriver(capabilities);
       
   } 
   
   public static void main(String[] args){
       getChromeDriver();
   }
    
}
