package utility;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverProvider;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.WebDriverListener;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class DriverManager  implements WebDriverProvider {

    @Nonnull
    @Override
    public AndroidDriver createDriver(@Nonnull Capabilities capabilities) {

        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);

        options.setCapability("deviceName","Xiaomi 13T Pro");
        options.setCapability("udid","VO7HIVC6RGOZU4T4");
        options.setCapability("platformName","Android");
        options.setCapability("automationName","UiAutomator2");
        options.setCapability("appPackage","sk.orange.android.orangego");
        options.setCapability("appActivity","com.orange.omnis.main.ui.MainActivity");
        options.setNewCommandTimeout(Duration.ofSeconds(11));


        URL url;
        try {
            url = new URL("http://127.0.0.1:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return new AndroidDriver(url, options);
    }
}
