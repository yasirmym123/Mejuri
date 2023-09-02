package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class GoodToSeeYou {
    private static final SelenideElement GOOD_TO_SEE_EMAIL= $(byXpath("//input[@id='input-email']"));
    private static final SelenideElement GOOD_TO_SEE_PASSWORD= $(byXpath("//input[@id='input-password']"));
    private static final SelenideElement CONTINUE_BUTTON= $(byXpath("//button[.='Continue']"));

    public void ContinueShopping() {

        GOOD_TO_SEE_EMAIL.shouldBe(Condition.visible).setValue("yasirmym1985@gmail.com");
        GOOD_TO_SEE_PASSWORD.shouldBe(Condition.visible).setValue("Maha12()");
        CONTINUE_BUTTON.shouldBe(Condition.enabled).click();
    }


}
