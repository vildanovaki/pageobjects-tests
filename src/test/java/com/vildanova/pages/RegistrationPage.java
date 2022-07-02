package com.vildanova.pages;

import com.vildanova.tests.TestData;

import com.codeborne.selenide.SelenideElement;
import com.vildanova.pages.components.CalendarComponent;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.vildanova.tests.TestData.*;


public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            userEmail = $("#userEmail"),
            gender =  $("#genterWrapper").$(byText(TestData.gender)),
            userNumber = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            hobbies = $("#hobbiesWrapper"),
            pathUploadPicture = $("#uploadPicture"),
            currentAddressTextBox = $("#currentAddress"),
            stateBlock = $("#state"),
            selectValueInStateBlock = $("#stateCity-wrapper").$(byText(stateName)),
            cityBlock = $("#city"),
            selectValueInCityBlock = $("#stateCity-wrapper").$(byText(cityName)),
            submitButton = $("#submit");

    public CalendarComponent calendar = new CalendarComponent();

    public void openPage() {
        open("https://demoqa.com/automation-practice-form");
        formTitle.shouldHave(text(FORM_TITLE));
    }

    public RegistrationPage typeFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public RegistrationPage chooseGender() {
        gender.click();
        return this;
    }

    public void typeUserNumber(String value) {
        userNumber.setValue(value);
    }

    public RegistrationPage typeSubjectsInput(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }

    public RegistrationPage chooseHobbies(String value) {
        hobbies.$(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadPicture(String value) {
        pathUploadPicture.uploadFromClasspath(value);
        return this;
    }

    public RegistrationPage typeCurrentAddress(String value) {
        currentAddressTextBox.setValue(value);
        return this;
    }

    public RegistrationPage typeState() {
        stateBlock.click();
        selectValueInStateBlock.click();
        return this;
    }

    public RegistrationPage typeCity() {
        cityBlock.click();
        selectValueInCityBlock.click();
        return this;
    }

    public void submit() {
        submitButton.click();
    }
}

