package appium.test.android.pages;

import io.appium.java_client.android.AndroidKeyCode;

import static appium.test.android.util.Helpers.driver;
import static appium.test.android.util.Helpers.setWait;

/** Page object for the home pages **/
public abstract class HomePage {

    public static void searchFor(String name) {
        driver.findElementByXPath("//android.widget.EditText[1]").click(); //clicking on search bar
        driver.findElementByXPath("//android.widget.EditText[1]").sendKeys(name); //printing "Coffee"
        driver.sendKeyEvent(AndroidKeyCode.ENTER); //pressing search button
        setWait(50000); //waiting for results

        //Helpers.driver.findElementByXPath("//android.widget.EditText[1]").sendKeys("Coffee"); //printing "Coffee"
        // Helpers.driver.sendKeyEvent(AndroidKeyCode.ENTER); //pressing search button
        //setWait(5000); //waiting for results
        //assertEquals("Search results are incorrect.", driver.findElementByXPath("//android.widget.RelativeLayout[6]//android.widget.TextView[1]").getText(), "23");
        //assertTrue("Search results are incorrect.", Helpers.driver.findElementByXPath("//android.widget.TextView[1]//*[text()='24']").isDisplayed()); //searching for number 24 in results, assert
    }
}