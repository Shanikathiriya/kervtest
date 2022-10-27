package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class home extends Utils
{

    By accept=By.xpath("//a[@class=\"_brlbs-btn _brlbs-btn-accept-all _brlbs-cursor\"]");
    By menu=By.xpath("/html/body/header/div[2]/nav/div/div[6]/a");
    By jobopportunity= By.xpath("//div[1]/a[@href=\"https://kerv.com/careers-at-kerv/job-opportunities/\"]");

    public void CookieWarning()
    {

       waitForVisible(accept,10);

        clickOnElement(accept);



    }

    public void Carrers()
    {
        WebElement mainMenu = driver.findElement(By.xpath("/html/body/header/div[2]/nav/div/div[6]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenu);
        actions.click().build().perform();
    }


          public void clicksubmenu()
          {

           waitForClickabInSEle(jobopportunity,10);
           WebElement submenu= driver.findElement(By.xpath("//div[1]/a[@href=\"https://kerv.com/careers-at-kerv/job-opportunities/\"]"));
           Actions actions=new Actions(driver);
           actions.moveToElement(submenu);

           actions.doubleClick().build().perform();
          }

}
