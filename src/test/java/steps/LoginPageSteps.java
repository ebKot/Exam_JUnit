package steps;

import configuration.propertiesSetUp;
import elements.LoginPageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

public class LoginPageSteps extends LoginPageElements {
    @Step("Авторизация в системе Jira")
    public static void loginFunc() {
        loginFormUsername.shouldBe(Condition.visible, Duration.ofSeconds(15)).setValue(propertiesSetUp.getProperty("login"));
        loginFormPassword.shouldBe(Condition.visible, Duration.ofSeconds(15)).setValue(propertiesSetUp.getProperty("password"));
        loginButton.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
    }
}