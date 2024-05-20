package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class Prihlasenie {
    private static SelenideElement prihlasenieCezEmail = $(By.xpath("//android.view.View[@text=\"Prihlásenie cez email\"]"));
    private static SelenideElement emailFld = $(By.xpath("//android.webkit.WebView[@text=\"Orange ecare | login/my-orange\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]"));
    private static SelenideElement hesloFld = $(By.xpath("//android.webkit.WebView[@text=\"Orange ecare | login/my-orange\"]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]"));
    private static SelenideElement prihlasitSaBtn = $(By.className("android.widget.Button"));
    private static SelenideElement navigateUpBtn = $(By.className("android.widget.ImageButton"));

    public void tapPrihlasenieCezEmail(){
        prihlasenieCezEmail.should(Condition.appear, Duration.ofSeconds(30)).click();
    }

    public void userEnterEmail(String email){
        emailFld.sendKeys(email);
    }

    public void userSendPassword(String password){
        hesloFld.sendKeys(password);
    }

    public void tapPrihlasitSaBtn(){
        prihlasitSaBtn.click();
    }

    public void tapNavigateUp(){
        navigateUpBtn.should(Condition.clickable).click();
    }

}
