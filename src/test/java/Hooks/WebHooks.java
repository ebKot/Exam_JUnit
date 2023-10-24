package Hooks;

import Configuration.propertiesSetUp;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;
import org.openqa.selenium.OutputType;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.*;

public class WebHooks {
    @BeforeEach
    @Step("Открытие браузера и начальной страницы сайта")
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        System.setProperty("selenide.browser", "chrome");
        open(propertiesSetUp.getProperty("jiraUrl"));
        getWebDriver().manage().window().maximize();
    }

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().savePageSource(false));
    }

    @AfterEach
    public void tearDown() throws IOException {
        WebDriverRunner.closeWebDriver();
    }

        @Attachment(value = "Screenshot", type = "image/png", fileExtension = ".png")
    public byte[] getScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }
}
