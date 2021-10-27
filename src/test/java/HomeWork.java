import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Keys;


import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;



public class HomeWork {
    @BeforeEach
     void Option(){
        Configuration.startMaximized = true;
        open("https://demoqa.com/automation-practice-form");
        Configuration.holdBrowserOpen = true;

    }
    static String PHONE_NUMBER = "7888999777";
    @Test
    public void StudentRegForm(){

        $("#firstName").setValue("Artem");
        $("#lastName").setValue("Kulakov");
        $("#userEmail").setValue("test@gmail.com");
        $(byText("Male")).click();
        $("#dateOfBirthInput").click();
        $("#userNumber").setValue(PHONE_NUMBER);
        $(byClassName("react-datepicker__year-select")).click();
        $(byClassName("react-datepicker__year-select")).selectOptionByValue("2000");
        $(byClassName("react-datepicker__month-select")).click();
        $(byClassName("react-datepicker__month-select")).selectOptionContainingText("April");
        $(byText("4")).click();
        $x("//*[@id=\"subjectsContainer\"]/div").click();
        $("#subjectsInput").setValue("Com").pressEnter();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("#uploadPicture").uploadFile(new File("uploadFiles/1.png"));
        $("#currentAddress").setValue("Russia, Moscow");
        $("#state").scrollIntoView(true).click();
        $("#react-select-3-input").setValue("harya").pressEnter();
        $("#city").click();
        $("#react-select-4-input").setValue("Karnal").pressEnter();
        $("#submit").click();
        $(byText("Thanks for submitting the form")).shouldHave(Condition.visible);




    }
}
