import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class HomeWork {

    static String FIRST_NAME = "Artem";
    static String LAST_NAME = "Kulakov";
    static String USER_EMAIL = "test@gmail.com";
    static String PHONE_NUMBER = "7888999777";
    static String ADDRESS = "Russia, Moscow";
    static String STATE = "harya";
    static String CITY = "Karnal";

    @BeforeAll
    static void ConfigAllTest() {
        Configuration.startMaximized = true;
    }

    @BeforeEach
    void Option() {
        open("https://demoqa.com/automation-practice-form");
    }

    @Test
    public void StudentRegForm() {

        //personal information
        $("#firstName").setValue(FIRST_NAME);
        $("#lastName").setValue(LAST_NAME);
        $("#userEmail").setValue(USER_EMAIL);
        $(byText("Male")).click();
        $("#userNumber").setValue(PHONE_NUMBER);

        //date birthday
        $("#dateOfBirthInput").click();
        $(byClassName("react-datepicker__year-select")).click();
        $(byClassName("react-datepicker__year-select")).selectOptionByValue("2000");
        $(byClassName("react-datepicker__month-select")).click();
        $(byClassName("react-datepicker__month-select")).selectOptionContainingText("April");
        $(byText("4")).click();

        //subjects field
        $x("//*[@id=\"subjectsContainer\"]/div").click();
        $("#subjectsInput").setValue("Com").pressEnter();

        //Hobbies check box
        $(byText("Reading")).click();
        $(byText("Music")).click();

        //upload picture
        $("#uploadPicture").uploadFile(new File("uploadFiles/1.png"));

        //address
        $("#currentAddress").setValue(ADDRESS);

        //input state title
        $("#state").scrollIntoView(true).click();
        $("#react-select-3-input").setValue(STATE).pressEnter();

        //input city title
        $("#city").click();
        $("#react-select-4-input").setValue(CITY).pressEnter();

        //click submit button
        $("#submit").click();

        //check for form opening
        $(byText("Thanks for submitting the form")).shouldHave(Condition.visible);


    }
}
