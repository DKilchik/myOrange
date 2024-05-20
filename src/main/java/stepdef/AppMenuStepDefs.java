package stepdef;

import io.cucumber.java.en.And;
import pages.AppMenu;

public class AppMenuStepDefs {

    private AppMenu appMenu = new AppMenu();

    @And("user tab Pomoc option")
    public void tapPomoc(){
        appMenu.tabPomoc();
    }

    @And("user tap Orange shops option")
    public void userTapOrangeShopsOption() {
        appMenu.tapOrangeShops();
    }
}
