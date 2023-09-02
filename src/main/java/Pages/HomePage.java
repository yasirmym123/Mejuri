package Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static final SelenideElement RINGS_BUTTON= $(byXpath("//a[@name='Rings (Desktop)']//span[text()='Rings']"));
    private static final SelenideElement SIGNET_RINGS_BUTTON= $(byXpath("//span[@class='styled__Container-sc-aw9czy-0 bUubTs'][.='Signet Rings']"));
    private static final SelenideElement HONEY_MINI_SIGNET_RING_LINK= $(byXpath("//span[text()='Honey Mini Signet']"));
    private static final SelenideElement RING_SIZE= $(byXpath("//label[@data-h='size-checkbox']//span[.='3']"));
    private static final SelenideElement FAVOURITES= $(byXpath("//button[@label='Add to wishlist.']"));
    private static final SelenideElement ADD_TO_CART= $(byXpath("//button[@data-testid='add-to-cart-btn']"));
    private static final SelenideElement CHECKOUT= $(byXpath("//button[@data-testid='cart-go-to-checkout-btn']"));

  public void SelcetRingFromRingsCatalogue() {
      RINGS_BUTTON.shouldBe(Condition.enabled).click();
      SIGNET_RINGS_BUTTON.shouldBe(Condition.enabled).click();
      HONEY_MINI_SIGNET_RING_LINK.shouldBe(Condition.enabled).click();
      RING_SIZE.shouldBe(Condition.enabled).click();
      FAVOURITES.shouldBe(Condition.enabled).click();

  }
  public void AddToBag() {

      RING_SIZE.shouldBe(Condition.interactable).click();
      ADD_TO_CART.shouldBe(Condition.enabled).click();
      CHECKOUT.shouldBe(Condition.enabled).click();

  }
}
