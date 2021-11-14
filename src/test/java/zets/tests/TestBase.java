package zets.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import zets.pages.RegistrationPage;
import zets.data.DataGen;

public class TestBase {

        public DataGen data = new DataGen();
        public RegistrationPage registrationPage = new RegistrationPage();

        @BeforeAll
        static void beforeAll() { Configuration.startMaximized = true; }
    }


