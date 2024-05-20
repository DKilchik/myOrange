package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class LanguagePreferences {

    SelenideElement switchToEnglish = $(By.xpath("//android.widget.TextView[@text=\"SWITCH TO ENGLISH\"]"));

    public void switchToEnglishTap(){
        switchToEnglish.click();
    }
}
