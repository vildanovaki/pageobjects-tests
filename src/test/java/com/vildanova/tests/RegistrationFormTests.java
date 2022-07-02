package com.vildanova.tests;

import com.vildanova.pages.CheckPage;
import com.vildanova.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static com.vildanova.tests.TestData.*;

public class RegistrationFormTests extends TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    CheckPage checkPage = new CheckPage();


    @Test
    void fillFormTest() {
        registrationPage.openPage();

        registrationPage.typeFirstName(firstName)
                .typeLastName(lastName)
                .typeUserEmail(userEmail)
                .chooseGender()
                .typeUserNumber(userNumber);

        registrationPage.calendar.setDate(dayBirth, monthBirth, yearBirth);
        registrationPage.typeSubjectsInput(subjectsInput)
                .chooseHobbies(typeOfHobbies)
                .uploadPicture(pathToPicture)
                .typeCurrentAddress(currentAddress)
                .typeState()
                .typeCity()
                .submit();

        checkPage.checkTitleOfTable(titleOfEndTable)
                .checkResultsValue(firstName, lastName, userEmail, gender, userNumber, dayBirth, monthBirth,
                        yearBirth, subjectsInput, typeOfHobbies, checkPathToPicture, currentAddress, stateName, cityName);
    }
}
