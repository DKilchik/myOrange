package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Account {

    private static SelenideElement balíkStarostlivostiPlus = $(By.xpath("//android.widget.TextView[@resource-id=\"sk.orange.android.orangego:id/tv_name\" and @text=\"Balík starostlivosti plus\"]"));
    private static SelenideElement unsubscribeBtn = $(By.id("sk.orange.android.orangego:id/bt_unsubscribe"));
    private static SelenideElement balíkBalíkStarostlivostiZáklad = $(By.xpath("//android.widget.TextView[@resource-id=\"sk.orange.android.orangego:id/tv_name\" and @text=\"Balík starostlivosti základ\"]"));

    public void tapBalíkStarostlivostiPlus(){
        balíkStarostlivostiPlus.should(Condition.appear).click();
    }

    public void tabUnsubscribe(){
        unsubscribeBtn.should(Condition.appear).should(Condition.clickable).click();
    }

    public void selectBalíkBalíkStarostlivostiZáklad(){
        balíkBalíkStarostlivostiZáklad.should(Condition.appear).click();
    }
}
