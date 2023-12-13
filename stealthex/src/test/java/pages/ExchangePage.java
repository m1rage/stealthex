package pages;

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ExchangePage {

    private SelenideElement baseCurrency = $("#exchange-from-input");
    private SelenideElement quoteCurrency = $("#exchange-to-input");
    private SelenideElement exchangeAddress = $("exchange-address");
    private SelenideElement nextButton = $("#exchange-submit");
    private SelenideElement exchangeSubmit = $("#exchange-submit");

    public void openPage () {
        open("/exchange");
    }

    public void setBaseCurrency (String value) {
        baseCurrency.setValue(value);
    }

    public void setQuoteCurrency (String value) {
        quoteCurrency.setValue(value);
    }

    public void setExchangeAddress (String value) {
        exchangeAddress.setValue(value);
    }

    public void clickNextButton () {
        nextButton.click();
    }

    public void clickExchangeSubmit () {
        exchangeSubmit.click();
    }

}
