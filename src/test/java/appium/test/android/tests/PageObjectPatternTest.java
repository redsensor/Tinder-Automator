package appium.test.android.tests;

import appium.test.android.pages.HomePage;
import appium.test.android.util.AppiumTest;
import appium.test.android.util.Helpers;
import org.junit.Test;

import static org.junit.Assert.*;

public class PageObjectPatternTest extends AppiumTest {

    @Test  //unnecessary stuff from other project
    public void pageObject() throws Exception {
        HomePage.searchFor("Coffee");
        assertTrue(Helpers.driver.findElementByXPath("24").isDisplayed());
        Helpers.back();
    }
}