package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.Prihlasenie;

public class PrihlasenieStepDefs {

    Prihlasenie prihlasenie = new Prihlasenie();

    @And("user select Prihlásenie cez email")
    public void cezEmail(){
        prihlasenie.tapPrihlasenieCezEmail();
    }

    @When("user enter {string} email and {string} password")
    public void userEnterEmailAndPassword(String arg0, String arg1) {
        prihlasenie.userEnterEmail(arg0);
        prihlasenie.userSendPassword(arg1);
    }

    @And("user tap Prihlásiť sa button")
    public void userTapPrihlásiťSaButton() {
        prihlasenie.tapPrihlasitSaBtn();
    }

    @And("user tap Navigate Up Btn")
    public void userTapNavigateUpBtn() {
        prihlasenie.tapNavigateUp();
    }
}
