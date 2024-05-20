package utility;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.WebDriverListener;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    AppiumDriver driver;

    @Before
    public void setUp() {

        Configuration.browserSize = null;
        Configuration.browser = DriverManager.class.getName();
        Configuration.timeout = 10000;
        WebDriverRunner.addListener(new WebDriverListener() {
            @Override
            public void beforeClick(WebElement element) {
                WebDriverListener.super.beforeClick(element);
            }
        });
        open();

    }

    @After
    public void tearDown(){
        if(driver != null){
            try{
            driver.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
