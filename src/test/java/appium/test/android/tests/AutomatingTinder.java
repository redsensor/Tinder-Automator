package appium.test.android.tests;

import appium.test.android.util.AppiumTest;
import appium.test.android.util.Helpers;
import io.appium.java_client.android.AndroidKeyCode;
import org.junit.*;
import appium.test.android.pages.HomePage;
import appium.test.android.util.AppiumTest;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import static appium.test.android.util.Helpers.driver;

import static org.junit.Assert.*;

public class AutomatingTinder extends AppiumTest {

    //By moreBumble = By.xpath("//*[text()='More Bumble']"); //in case you use Bumble app just replace the element
    By moreTinder = By.id("revised_like");

    @Test

    public void one() throws Exception {
        while (true) {
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.MILLISECONDS); //goes further if the match screen shows up
            if (driver.findElements(moreTinder).size() != 0) {
                driver.findElement(moreTinder).click();
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            }
            swipeRight();
        }


    }
}