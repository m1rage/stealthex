package tests;

import org.junit.jupiter.api.Test;
import pages.ExchangePage;
import utils.TestBase;

public class ExchangeTest extends TestBase {
    ExchangePage exchangePage = new ExchangePage();

    @Test
    public void fillForms () {

        String BaseCurrencyAmount  = "0.1";
        String ExchangeAddress = "0x60236c4f8708eb8411c6b19e2222b11f96289e05";


        exchangePage.openPage();
        exchangePage.setBaseCurrency(BaseCurrencyAmount);
        exchangePage.clickExchangeAddress();
        exchangePage.setExchangeAddress(ExchangeAddress);
        exchangePage.clickNextButton();
        exchangePage.clickExchangeSubmit();

        exchangePage.checkExchangeAmount(BaseCurrencyAmount);
    }
}