package stepdef;

import io.cucumber.java.en.And;
import pages.LanguagePreferences;

public class LanguagePreferencesStepDefs {

    LanguagePreferences languagePreferences = new LanguagePreferences();

    @And("user tap 'Switch to English' button")
    public void switchToEnglish(){
        languagePreferences.switchToEnglishTap();
    }
}
