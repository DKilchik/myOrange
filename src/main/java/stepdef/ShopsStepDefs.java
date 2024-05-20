package stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.Shops;

public class ShopsStepDefs {

    private Shops shops = new Shops();

    @And("user click to first shop from the list")
    public void clickFirstShop(){
        shops.tapFirstShop();
    }

    @Then("minimal address information is present")
    public void minimalAddressInformationIsPresent() {
        shops.isMinimalAddressPresent();
    }

    @And("Contact information is present")
    public void contactInformationIsPresent() {
        shops.isContactInformationPresent();
    }

    @And("opening hours information is present")
    public void openingHoursInformationIsPresent() {
        shops.isContactInformationPresent();
    }
}
