package Assertions;

import Elements.LoginPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import java.time.Duration;

import static Elements.DashboardPageElements.listOfProjects;

public class LoginPageAsserts extends LoginPageElements {
    @Step("Проверка успешности авторизации")
    public static void loginAssert() {
        Assertions.assertEquals("Проекты", listOfProjects.shouldBe(Condition.visible, Duration.ofSeconds(15)).getText());
    }
}