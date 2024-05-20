package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    private static SelenideElement acceptAll = $(By.id("sk.orange.android.orangego:id/button_notice_footer_agree"));
    private static SelenideElement gotItBtn = $(By.id("sk.orange.android.orangego:id/bt_got_it"));
    private static SelenideElement logo = $(By.id("sk.orange.android.orangego:id/iv_small_logo"));
    private static SelenideElement whileUsingTheApp = $(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
    private static SelenideElement confirm = $(By.id("sk.orange.android.orangego:id/md_button_positive"));
    private static SelenideElement goToHomeScreen = $(By.xpath("//android.widget.TextView[@text=\"GO TO HOME SCREEN\"]"));
    private static SelenideElement skipBtn = $(By.id("sk.orange.android.orangego:id/onboardingWelcomeSkipButton"));
    private static SelenideElement continueBtn = $(By.id("sk.orange.android.orangego:id/onboardingUnsecureContinueButton"));
    private static SelenideElement allowBtn = $(By.id("sk.orange.android.orangego:id/positiveBtn"));
    private static SelenideElement permissionAllowBtn = $(By.id("com.android.permissioncontroller:id/permission_allow_button"));

    public void tapAcceptAll(){
        acceptAll.should(Condition.appear, Duration.ofSeconds(10)).click();
    }

    public void tapGotIt(){
        if(gotItBtn.has(Condition.appear, Duration.ofSeconds(5))){
            gotItBtn.click();
        }
    }

    public void tabLogo(){
        logo.click();
    }

    public void tapWhileUsingTheApp(){
        whileUsingTheApp.should(Condition.appear).click();
    }

    public void tapConfirm(){
        confirm.should(Condition.appear).click();
    }

    public void goToHomeScreen(){
        goToHomeScreen.should(Condition.appear, Duration.ofSeconds(15)).click();
    }

    public void tapSkip(){
        if(skipBtn.has(Condition.appear,Duration.ofSeconds(5))){
            skipBtn.click();
        }
    }
    public void tabContinueBtn(){
        if(continueBtn.has(Condition.appear,Duration.ofSeconds(5))) {
            continueBtn.should(Condition.appear).click();
        }
    }

    public void tapAllowNotification(){

        if(allowBtn.has(Condition.appear, Duration.ofSeconds(5))){
            allowBtn.click();
            permissionAllowBtn.should(Condition.appear).click();
        }
    }
}
