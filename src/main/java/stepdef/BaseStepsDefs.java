package stepdef;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.BasePage;

public class BaseStepsDefs {

    BasePage basePage = new BasePage();

    @Given("Open My Orange Application")
    public void openApp(){

    }

    @And("Sleep {}")
    public void sleep(int milliseconds){
        Selenide.sleep(milliseconds);
    }

    @And("user accept all cookies")
    public void acceptAll(){
        basePage.tapAcceptAll();
    }


    @And("user tap GOT IT Btn")
    public void userTapGOTITBtn() {
        basePage.tapGotIt();
    }

    @And("user tab Orange logo")
    public void userTabOrangeLogo() {
        basePage.tabLogo();
    }

    @And("user tap While using the app permission button")
    public void userTapWhileUsingTheAppPermissionButton() {
        basePage.tapWhileUsingTheApp();
    }

    @And("user tap Confirm to Allow Map display popup")
    public void userTapConfirmToAllowMapDisplayPopup() {
        basePage.tapConfirm();
    }

    @And("user tap GO TO HOME SCREEN button")
    public void userTapGOTOHOMESCREENButton() {
        basePage.goToHomeScreen();
    }

    @And("user tap SKIP button")
    public void userTapSKIPButton() {
        basePage.tapSkip();
    }

    @And("user tap Continue button")
    public void userTapContinueButton() {
        basePage.tabContinueBtn();
    }

    @And("user tap Allow Notification")
    public void userTapAllowNotification() {
        basePage.tapAllowNotification();
    }

    @And("user tap Confirm")
    public void userTapConfirm() {
        basePage.tapConfirm();
    }
}
