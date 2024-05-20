package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Options;

public class OptionsStepDefs {

    Options options = new Options();

    @And("user tap on Doplnkové služby")
    public void userTapOnDoplnkoveSluzby(){
        options.tapDoplnkoveSluzby();
    }

    @And("user select Balík starostlivosti plus")
    public void userSelectBalíkStarostlivostiPlus() {
        options.selectBalikStarostlivostiPlus();
    }

    @And("user tap CHECK OUT button")
    public void userTapCHECKOUTButton() {
        options.tapCheckoutBtn();
    }

    @And("user tap PAY button")
    public void userTapPAYButton() {
        options.tapPayBtn();
    }

    @When("user tap SHOW DETAILS button")
    public void userTapSHOWDETAILSButton() {
        options.tapShowDetails();
    }

    @Then("Option name should be visible")
    public void optionNameShouldBeVisible() {
        options.isOptionNamePresent();
    }

    @And("price should be present")
    public void priceShouldBePresent() {
        options.isPricePresent();
    }

    @And("activation date should be present")
    public void activationDateShouldBePresent() {
        options.isActivationDatePresent();
    }

    @When("user tap DONE button")
    public void userTapDONEButton() {
        options.tapDoneBtn();
    }

    @And("user select additional option")
    public void userSelectAdditionalOption() {
        options.tapAdditionalOption();
    }
}
