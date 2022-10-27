package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Jobopportunity extends Utils{

    By uxdesign= By.xpath("//a[@href=\"https://kerv.com/job-details/mp024o5\"]");

    public void clickonUXdesign()
    {

        Actions ac = new Actions(driver);


        ((JavascriptExecutor)driver).executeScript("('//div[1]/a[@href=\"https://kerv.com/careers-at-kerv/job-opportunities/\"]').hover();");
        ((JavascriptExecutor)driver).executeScript("('//*[@id=\"search-results\"]/div/div[16]/a').click();");
      //  ac.doubleClick().build().perform();
        // Scroll down
      //  ac.clickAndHold(driver.findElement(By.cssSelector("#search-results > div > div:nth-child(16) > a"))).moveByOffset(-50, -50).release().build().perform();
//        WebElement uxdesign = driver.findElement(By.xpath("//a[@href=\"https://kerv.com/job-details/mp024o5\"]"));
//        Actions actions = new Actions(driver);
//        actions.moveToElement(uxdesign);
//        actions.click().build().perform();
    }
}
