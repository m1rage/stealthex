package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ExchangePage {

    private SelenideElement baseCurrency = $("#exchange-from-input");
    private SelenideElement quoteCurrency = $("#exchange-to-input");
    private SelenideElement exchangeAddress = $(".ecCwCw");
    private SelenideElement nextButton = $(".sc-cd8d1e42-4 .sc-46938166-0");
    private SelenideElement exchangeSubmit = $(".jokreu > .sc-46938166-0");
    private SelenideElement sendAmount = $(".sc-675156a6-3");

    public void openPage () {
        open("/exchange");
    }

    public void setBaseCurrency (String value) {
        baseCurrency.setValue(value);
    }

    public void setQuoteCurrency (String value) {
        quoteCurrency.setValue(value);
    }

    public void clickExchangeAddress () {
        exchangeAddress.click();
    }

    public void setExchangeAddress (String value) {
        exchangeAddress.val(value);
    }

    public void clickNextButton () {
        nextButton.click();
    }

    public void clickExchangeSubmit () {
        exchangeSubmit.click();
    }

    public void checkExchangeAmount (String value) {
        sendAmount.shouldHave(text(value));
    }
}
