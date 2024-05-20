package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Shops {

    private static SelenideElement firstShop = $(By.xpath("(//android.view.ViewGroup[@resource-id=\"sk.orange.android.orangego:id/tl_shop_details_container\"])[1]"));
    private static SelenideElement minimalAddress = $(By.id("sk.orange.android.orangego:id/ll_store_minimal_address_container"));
    private static SelenideElement contactInformation = $(By.id("sk.orange.android.orangego:id/rl_expendable_view_contact_info_container"));
    private static SelenideElement openingHours = $(By.id("sk.orange.android.orangego:id/rl_expendable_view_working_hours_container"));

    public void tapFirstShop(){
        firstShop.should(Condition.appear).should(Condition.clickable).click();
    }

    public void isMinimalAddressPresent(){
        minimalAddress.should(Condition.appear);
    }

    public void isContactInformationPresent(){
        contactInformation.should(Condition.appear);
    }

    public void isOpeningHoursInfoPresent(){
        openingHours.should(Condition.appear);
    }
}
