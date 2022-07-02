package com.vildanova.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckPage {

    private SelenideElement
            titleOfTable = $(".modal-title"),
            resultValue = $(".table-responsive");

    public CheckPage checkTitleOfTable(String value) {
        titleOfTable.shouldHave(text(value));
        return this;
    }

    public void checkResultsValue(String firstName, String secondName, String userEmail, String gender,
                                  String userNumber, String dayBirth, String monthBirth, String yearBirth,
                                  String subject, String hobby, String picture, String address, String state,
                                  String city) {
        resultValue.shouldHave(text(firstName + " " + secondName), text(userEmail),
                text(gender), text(userNumber), text(dayBirth + " " + monthBirth + "," + yearBirth), text(subject), text(hobby),
                text(picture), text(address), text(state + " " + city));
    }
}
