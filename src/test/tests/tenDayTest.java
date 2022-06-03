package tests;

import base.BasePage;
import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.tenDayPage;

import java.util.ArrayList;
import java.util.List;

public class tenDayTest extends HomeTest {
   tenDayPage tenDayPage;

   @BeforeMethod
    public void setUp(){
       tenDayPage = new tenDayPage(getDriver());
   }
    @Test(testName = "10-Day button")
    public void test05() {
        homePage.click(homePage.tenDay);
        System.out.println(getDriver().getTitle());
//        System.out.println(tenDayPage.weatherInfo.getText());
       // Need to print:
        //    Day - High/Low - Description
        //    Today - 92/73 - Scattered Thunderstorms
    }
}
