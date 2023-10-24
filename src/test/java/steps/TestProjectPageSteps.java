package steps;

import elements.TestProjectPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class TestProjectPageSteps extends TestProjectPageElements {
    @Step("Переход во вкладку Задачи")
    public static void issuesQuantityFunc() {
        goToIssues.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
    }
}