package assertions;

import elements.TestProjectPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

public class TestProjectPageAsserts extends TestProjectPageElements {
    @Step("Проверка количества заведённых задач")
    public static void issuesQuantityAssert() {
        Assertions.assertTrue(countIssues.shouldBe(Condition.visible, Duration.ofSeconds(15)).getText().startsWith("1 из "));
    }
}