package zets.tests;

import org.junit.jupiter.api.Test;

import static java.lang.Thread.sleep;


public class Tests extends TestBase {
    @Test
     void RegistrationPageTest() throws InterruptedException {
        registrationPage.openPage()
                .typeFirstName(data.firstName)
                .typeLatsName(data.lastName)
                .typeEmail(data.email)
                .genderSelect(data.gender)
                .typePhone(data.phone)
                .typeSubject(data.subject)
                .hobbySelect(data.hobbyOne)
                .hobbySelect(data.hobbyTwo)
                .uploadPicture(data.picPath)
                .typeAddress(data.address)
                .openListOfStates(data.state)
                .openListOfCities(data.cities);
        registrationPage.calndar.setDate("2000", "April", "22");
        registrationPage.submitTheForm();
        registrationPage.resultForm("Date of Birth", "22 April,2000");
        registrationPage.resultForm("Gender", data.gender);
        registrationPage.resultForm("Subjects","Computer Science");
        registrationPage.resultForm("State and City", "Haryana Karnal");


    }
}
