package tests;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTest {
    HomePage homePage;

    @BeforeMethod
    public void localSetUp(){
        homePage = new HomePage(getDriver());

    }

    @Test(testName = "Validate Pop up text")
    public void  test01(){
        System.out.println(homePage.getText(homePage.popUpText));
    }
    @Test(testName = "Close Pop up")
    public void  test02() {
        System.out.println(homePage.getText(homePage.popUpText));
        homePage.click(homePage.closePopUpBtn);
    }
}
