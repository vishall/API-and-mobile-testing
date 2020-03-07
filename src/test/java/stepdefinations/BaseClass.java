package stepdefinations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.appmanagement.ApplicationState;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.PropertiesReader;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    public static AppiumDriver driver;
    public static ApplicationState state;
    private final String apk_path = PropertiesReader.getProperty("config","app_path");

    public void setUp() throws MalformedURLException {

            if(state==null) {
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
            caps.setCapability(MobileCapabilityType.UDID, "23f12ad4631c7ece");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 50000);
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + apk_path);
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy S9 +");
            caps.setCapability("appPackage", "com.youtility.test");
            caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

            driver = new AppiumDriver(new URL(PropertiesReader.getProperty("config", "Appium_hub")), caps);
            state = driver.queryAppState("com.youtility.test");
            }

    }

    protected static void waitForElementToBeAvailable(By locator) {
            new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    protected boolean isElementPresent(By by) {

        try {
            driver.findElement(by);
            return true;

        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void tearDown(){
        driver.quit();
    }

}



