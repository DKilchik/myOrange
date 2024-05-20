package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.sun.source.tree.ConstantCaseLabelTree;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Dashboard {

    private static SelenideElement buyABundle = $(By.id("sk.orange.android.orangego:id/btn_add_option"));
    private static SelenideElement consumptionCard = $(By.id("sk.orange.android.orangego:id/l_consumption_card"));

    public void tapBuyABundle(){
        buyABundle.should(Condition.appear).should(Condition.clickable).click();
    }

    public void isOpened(){
        buyABundle.should(Condition.appear);
    }

    public void tapConsumptionCard(){
        consumptionCard.should(Condition.appear).should(Condition.clickable).click();
    }
}
