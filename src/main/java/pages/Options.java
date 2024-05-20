package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Options {

    private static SelenideElement doplnkoveSluzby = $(By.xpath("//android.widget.TextView[@resource-id=\"sk.orange.android.orangego:id/tv_name\" and @text=\"Doplnkové služby\"]"));
    private static SelenideElement balikStarostlivostiPlus = $(By.xpath("//android.widget.TextView[@resource-id=\"sk.orange.android.orangego:id/tv_name\" and @text=\"Balík starostlivosti plus\"]"));
    private static SelenideElement checkOutBtn = $(By.id("sk.orange.android.orangego:id/bt_checkout"));
    private static SelenideElement payBtn = $(By.id("sk.orange.android.orangego:id/bt_subscribe"));
    private static SelenideElement showDetailsBtn = $(By.id("sk.orange.android.orangego:id/bt_secondary"));
    private static SelenideElement optionName = $(By.id("sk.orange.android.orangego:id/tv_details_option_name"));
    private static SelenideElement price = $(By.id("sk.orange.android.orangego:id/l_balance_value"));
    private static SelenideElement activationDate = $(By.id("sk.orange.android.orangego:id/tv_activation_date"));
    private static SelenideElement doneBtn = $(By.id("sk.orange.android.orangego:id/bt_primary"));
    private static SelenideElement additionalOption = $(By.id("sk.orange.android.orangego:id/tv_name"));

    public void tapDoplnkoveSluzby(){
        doplnkoveSluzby.should(Condition.appear).click();
    }

    public void selectBalikStarostlivostiPlus(){
        balikStarostlivostiPlus.should(Condition.appear).should(Condition.clickable).click();
    }

    public void tapCheckoutBtn(){
        checkOutBtn.should(Condition.appear).should(Condition.clickable).click();
    }

    public void tapPayBtn(){
        payBtn.should(Condition.appear).should(Condition.clickable).click();
    }

    public void tapShowDetails(){
        showDetailsBtn.should(Condition.appear).should(Condition.clickable).click();
    }

    public void isOptionNamePresent(){
        optionName.should(Condition.appear);
    }

    public void isPricePresent(){
        price.should(Condition.appear);
    }

    public void isActivationDatePresent(){
        activationDate.should(Condition.appear);
    }

    public void tapDoneBtn(){
        doneBtn.should(Condition.appear).should(Condition.clickable).click();
    }

    public void tapAdditionalOption(){
        additionalOption.should(Condition.clickable).click();
    }
}
