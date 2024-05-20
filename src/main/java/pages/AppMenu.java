package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AppMenu {

    private static SelenideElement pomocOption = $(By.xpath("(//android.view.ViewGroup[@resource-id=\"sk.orange.android.orangego:id/root\"])[1]"));
    private static SelenideElement orangeShopsOption = $(By.xpath("(//android.view.ViewGroup[@resource-id=\"sk.orange.android.orangego:id/root\"])[3]"));


    public void tabPomoc(){
        pomocOption.click();
    }

    public void tapOrangeShops(){
        orangeShopsOption.should(Condition.appear).click();
    }
}
