package assertions;

import elements.TestSeleniumPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

public class TestSeleniumPageAsserts extends TestSeleniumPageElements {
    @Step("Проверка статуса задачи")
    public static void testSeleniumStatusAssert() {
        Assertions.assertTrue(statusValue.shouldBe(Condition.visible, Duration.ofSeconds(15)).exists());
    }

    @Step("Проверка затронутой версии")
    public static void testSeleniumVersionAssert() {
        Assertions.assertEquals("Version 2.0", fixVersions.shouldBe(Condition.visible, Duration.ofSeconds(15)).getText());
    }
}