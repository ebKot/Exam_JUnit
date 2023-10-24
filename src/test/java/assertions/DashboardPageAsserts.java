package assertions;

import elements.DashboardPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static elements.TestProjectPageElements.goToProjectMain;

public class DashboardPageAsserts extends DashboardPageElements {
    @Step("Проверка перехода в проект Тест")
    public static void goToProjectAssert() throws InterruptedException {
        Thread.sleep(1000);
        Assertions.assertEquals("Test", goToProjectMain.shouldBe(Condition.exist, Duration.ofSeconds(15)).getText());
    }
}
