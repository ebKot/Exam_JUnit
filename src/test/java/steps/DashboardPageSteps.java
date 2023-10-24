package steps;

import elements.DashboardPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class DashboardPageSteps extends DashboardPageElements {
    @Step("Переход в проект Тест")
    public static void goToProjectFunc() {
        listOfProjects.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        goToTestProject.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
    }
}
