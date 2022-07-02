package com.vildanova.tests;

import com.github.javafaker.Faker;

public class TestData {

    public static Faker faker = new Faker();

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            gender = "Male",
            userNumber = "9655976283",
            dayBirth = "17",
            monthBirth = "November",
            yearBirth = "1999",
            subjectsInput = "Maths",
            typeOfHobbies = "Music",
            pathToPicture = "img/photo.png",
            checkPathToPicture = "photo.png",
            currentAddress = faker.address().fullAddress(),
            stateName = "NCR",
            cityName = "Delhi",
            titleOfEndTable = "Thanks for submitting the form";
}
