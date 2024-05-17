import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class vanilla_android {
    public static String userName = "tanub";
    public static String accessKey = "egtbZuDujfkyVXAcqr9idRRsqLCnU2eO9ig4sd4jP0rRStWq8T";

    private static AppiumDriver driver;

    public static void main(String args[]) throws MalformedURLException, InterruptedException {

        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            HashMap<String, Object> ltOptions = new HashMap<String, Object>();
//            HashMap<String, String> locationObj = new HashMap<String, String>();
//            locationObj.put("lat", "41.18638");
//            locationObj.put("long", "-111.950457");
//            ltOptions.put("location", locationObj);
            //bs
//            capabilities.setCapability("device", "iPhone 14");
//            capabilities.setCapability("os_version", "16");
//            capabilities.setCapability("platformName", "ios");
////            capabilities.setCapability("appiumVersion", "latest");
////            capabilities.setCapability("fixedIP","00008110-001971A934E1401E");
//            capabilities.setCapability("app", "bs://8d3ee648e8905bf566c81293ee811535e0ffc2ba"); // Enter your app url
////            capabilities.setCapability("deviceOrientation", "PORTRAIT");
//            capabilities.setCapability("build", "Java Vanilla - Android");
//            capabilities.setCapability("name", "Sample Test Java");
//            capabilities.setCapability("isRealMobile", true);
//            capabilities.setCapability("autoGrantPermissions", true);
//            capabilities.setCapability("autoAcceptAlerts", true);
            //lt
////
            capabilities.setCapability("deviceName", "iPhone 14");
            capabilities.setCapability("platformVersion", "16");
            capabilities.setCapability("platformName", "ios");
            capabilities.setCapability("autoAcceptAlerts", true);
            capabilities.setCapability("devicelog",true);
//            capabilities.setCapability("fixedIP","00008110-001971A934E1401E");
            capabilities.setCapability("app", "lt://APP10160471181715855112075232"); // Enter your app url
////            capabilities.setCapability("deviceOrientation", "PORTRAIT");
            capabilities.setCapability("build", "Java Vanilla - Android");
            capabilities.setCapability("name", "Sample Test Java");
            capabilities.setCapability("isRealMobile", true);
//            ltOptions.put("nativeWebTap",true);
            capabilities.setCapability("lt:options", ltOptions);

            capabilities.setCapability("network", true);
////            capabilities.setCapability("region", "ap");
//
////            capabilities.setCapability("visual", true);
//
////            capabilities.setCapability("appProfiling", true);
//            capabilities.setCapability("autoAcceptAlerts",true);
//            capabilities.setCapability("acceptSslCerts","true");
//            capabilities.setCapability("appiumVersion","1.21.0");

            driver = new AppiumDriver(
                    new URL("https://" + userName + ":" + accessKey + "@mobile-hub.lambdatest.com/wd/hub"),
                    capabilities);
//            driver = new IOSDriver<IOSElement>(new URL("http://"+"mobileautoservic_w86Uka"+":"+"SeW8HQo2LzzoUw9qsDK8"+"@hub-cloud.browserstack.com"+"/wd/hub"), capabilities);

 Thread.sleep(9000);

            WebElement el1 = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='NOT RIGHT NOW']");
            el1.click();

            WebElement el2 = driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Skip']");
            el2.click();

            WebElement el3 = driver.findElementByAccessibilityId("txtEmail");
            el3.click();
            el3.sendKeys("e2e_app_ios_auto_03@gmail.com");

            WebElement el4 = driver.findElementByAccessibilityId("txtPassword");
            el4.sendKeys("Testing123$");

            WebElement el5 = driver.findElementByXPath("//XCUIElementTypeButton[@name='SIGN IN']");
            el5.click();
            Thread.sleep(19000);
            String context = driver.getContext();
            driver.context("NATIVE_APP");
            Thread.sleep(19000);
            driver.context("NATIVE_APP");
            Thread.sleep(19000);
            driver.context("NATIVE_APP");
            Thread.sleep(19000);
//            WebElement el7 = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Location\"]"));

//            el7.click();

            WebElement el8 = driver.findElementByAccessibilityId("store_locator_search");
            el8.click();
            el8.sendKeys("77024");

            WebElement el9 = driver.findElementByAccessibilityId("Search");
            el9.click();
            Thread.sleep(19000);
            String context1 = driver.getContext();
            Thread.sleep(19000);
             context1 = driver.getContext();
            Thread.sleep(19000);
            context1 = driver.getContext();
            Thread.sleep(19000);
            String context2 = driver.getContext();
            Thread.sleep(20000);
            String context3 = driver.getContext();

            Thread.sleep(38000);
//            String context = driver.getContext();

        } catch (AssertionError a) {
            ((JavascriptExecutor) driver).executeScript("lambda-status=failed");
            a.printStackTrace();
        }
        // The driver.quit statement is required, otherwise the test continues to
        // execute, leading to a timeout.
        driver.quit();
    }
}
