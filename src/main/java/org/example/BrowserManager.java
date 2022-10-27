package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class BrowserManager extends basepage // create browser manager class inherit base page class
{



    public void openBrowser()  // create method for open browser
    {

             System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
                driver = new ChromeDriver();
        driver.manage().window().maximize();

            driver.get("https://kerv.com/about-kerv/kerv-practices/kerv-digital/");



   }

    public void closeBrowser()//create method for close browser
    {
        //driver.close();
    }
}
