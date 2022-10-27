package org.example;


import org.testng.annotations.Test;


public class testsuit extends BaseTest
{
    home home1=new home();
    Jobopportunity job=new Jobopportunity();


    @Test
    public void runfirst() throws InterruptedException {
        home1.CookieWarning();
        home1.Carrers();
        home1.clicksubmenu();
        job.clickonUXdesign();
    }
}
