package stepdefinations;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.PropertiesReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static AppiumDriver driver;
    private final String apk_path = PropertiesReader.getProperty("config","app_path");

    public void setUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.UDID,"23f12ad4631c7ece");
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,50000);
        caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+ apk_path);
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Galaxy S9 +");
        caps.setCapability("appPackage","com.youtility.test");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AppiumDriver(new URL(PropertiesReader.getProperty("config","Appium_hub")),caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

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



