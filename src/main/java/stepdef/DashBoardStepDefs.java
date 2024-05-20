package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Dashboard;

public class DashBoardStepDefs {

    Dashboard dashboard = new Dashboard();

    @And("user tap Buy A Bundle button")
    public void buyABundle(){
        dashboard.tapBuyABundle();
    }

    @Then("Dashboard screen is opened")
    public void dashboardScreenIsOpened() {
        dashboard.isOpened();
    }

    @And("user tap consumption card")
    public void userTapConsumptionCard() {
        dashboard.tapConsumptionCard();
    }
}
