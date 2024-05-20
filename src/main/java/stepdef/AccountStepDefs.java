package stepdef;

import io.cucumber.java.en.And;
import pages.Account;

public class AccountStepDefs {

    Account account = new Account();

    @And("user tap Balík starostlivosti plus")
    public void tapBalik(){
        account.tapBalíkStarostlivostiPlus();
    }

    @And("user tab UNSUBSCRIBE button")
    public void userTabUNSUBSCRIBEButton() {
        account.tabUnsubscribe();
    }

    @And("user tap Balík starostlivosti základ")
    public void userTapBalíkStarostlivostiZáklad() {
        account.selectBalíkBalíkStarostlivostiZáklad();
    }
}
