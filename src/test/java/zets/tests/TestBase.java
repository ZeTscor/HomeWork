package zets.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import zets.pages.RegistrationPage;
import zets.data.TestData;

public class TestBase {

        public TestData data = new TestData();
        public RegistrationPage registrationPage = new RegistrationPage();

        @BeforeAll
        static void beforeAll() { Configuration.startMaximized = true; }
    }


