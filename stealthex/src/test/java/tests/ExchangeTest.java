package tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pages.ExchangePage;
import utils.TestBase;

public class ExchangeTest extends TestBase {
    ExchangePage exchangePage = new ExchangePage();

    @Test
    public void fillForms () {

        String BaseCurrencyAmount  = "0.1";
        String QuoteCurrencyAmount = "0.1"
        String ExchangeAddress = "0xd8a1e1e71992923e2a4af87f0756db07aa25cd82";


        exchangePage.setBaseCurrency();
        exchangePage.setExchangeAddress();
        exchangePage.clickNextButton();
        exchangePage.clickExchangeSubmit();


    }
}