package tests;


import Pages.GoodToSeeYou;
import Pages.HomePage;
import Pages.LoginPage;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

class HoneyMiniSignet {


@Test
    void AddRingToWishList() throws InterruptedException {
    Selenide.open("https://mejuri.com/world/en/m-plus/sign-in");
    new LoginPage()
            .loginToApplication();
    new HomePage()
            .SelcetRingFromRingsCatalogue();
    new GoodToSeeYou()
            .ContinueShopping();
    new HomePage()
            .AddToBag();


}

}
