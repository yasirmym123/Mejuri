package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private static final SelenideElement EMAIL = $(byId("email"));
    private static final SelenideElement PASSWORD = $(byId("password"));
    private static final SelenideElement SIGN_IN_BUTTON= $(byXpath("//button[@type='submit']"));
    private static final SelenideElement RINGS_BUTTON= $(byXpath("//a[@name='Rings (Desktop)']//span[text()='Rings']"));
    private static final SelenideElement SIGNET_RINGS_BUTTON= $(byXpath("//span[@class='styled__Container-sc-aw9czy-0 bUubTs'][.='Signet Rings']"));
    private static final SelenideElement HONEY_MINI_SIGNET_RING_LINK= $(byXpath("//span[contains(text(),'Honey Mini Signet')]"));
    private static final SelenideElement RING_SIZE= $(byXpath("//label[@data-h='size-checkbox']//span[.='3']"));
    private static final SelenideElement FAVOURITES= $(byXpath("//button[@label='Add to wishlist.']"));
    private static final SelenideElement ADD_TO_CART= $(byXpath("//button[@data-testid='add-to-cart-btn']"));
    private static final SelenideElement CHECKOUT= $(byXpath("//button[@data-testid='cart-go-to-checkout-btn']"));







    public HomePage loginToApplication() {
        EMAIL.shouldBe(Condition.visible).setValue("yasirmym1985@gmail.com");
        PASSWORD.shouldBe(Condition.visible).setValue("Maha12()");
        SIGN_IN_BUTTON.shouldBe(Condition.enabled).click();

        return new HomePage();

    }

}




