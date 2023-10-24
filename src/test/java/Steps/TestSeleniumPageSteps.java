package Steps;

import Elements.TestSeleniumPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static Elements.DashboardPageElements.goToTestSeleniumIssue;
import static Elements.DashboardPageElements.searchString;

public class TestSeleniumPageSteps extends TestSeleniumPageElements {
    @Step("Переход в тест с названием TestSelenium")
    public static void testSeleniumFunc() {
        searchString.shouldBe(Condition.visible, Duration.ofSeconds(15)).setValue("TestSelenium");
        goToTestSeleniumIssue.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
    }
}