import Hooks.WebHooks;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

import static Assertions.CreateIssueDialogAsserts.createIssueAssert;
import static Assertions.DashboardPageAsserts.goToProjectAssert;
import static Assertions.LoginPageAsserts.loginAssert;
import static Assertions.MyIssuePageAsserts.runThroughStatusesAssert;
import static Assertions.TestProjectPageAsserts.issuesQuantityAssert;
import static Assertions.TestSeleniumPageAsserts.testSeleniumStatusAssert;
import static Assertions.TestSeleniumPageAsserts.testSeleniumVersionAssert;
import static Steps.CreateIssueDialogSteps.createIssueFunc;
import static Steps.DashboardPageSteps.goToProjectFunc;
import static Steps.LoginPageSteps.loginFunc;
import static Steps.MyIssuePageSteps.runThroughStatusesFunc;
import static Steps.TestProjectPageSteps.issuesQuantityFunc;
import static Steps.TestSeleniumPageSteps.testSeleniumFunc;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@Epic("Экзаменационное задание")
@Feature("Часть 1")
@DisplayName("Разработка проекта автотестов с использованием JUnit, Maven, Selenide, Allure")
@Owner("Котлинская Екатерина")
public class TestRunner extends WebHooks {
    @Test
    @Order(1)
    @DisplayName("Авторизоваться в edujira.ifellow.ru")
    public void loginTest() {
        loginFunc();
        loginAssert();
        getScreenshot();
    }

    @Test
    @Order(2)
    @DisplayName("Перейти в проект TestProject")
    public void goToProjectTest() throws InterruptedException {
        loginFunc();
        goToProjectFunc();
        goToProjectAssert();
        getScreenshot();
    }

    @Test
    @Order(3)
    @DisplayName("Проверить общее количество заведенных задач в проекте ( например в  строке ‘1 из 30’ )")
    public void issuesQuantityTest() {
        loginFunc();
        goToProjectFunc();
        issuesQuantityFunc();
        issuesQuantityAssert();
        getScreenshot();
    }

    @Test
    @Order(4)
    @DisplayName("Перейти в задачу TestSelenium и проверить статус задачи и привязку в затронутой версии - Version 2.0")
    public void testSeleniumTest() {
        loginFunc();
        testSeleniumFunc();
        testSeleniumStatusAssert();
        testSeleniumVersionAssert();
        getScreenshot();
    }

    @Test
    @Order(5)
    @DisplayName("Создать автотестом новый баг с описанием. Перевести задачу по статусам до закрытого.")
    public void createIssueTest() throws InterruptedException {
        loginFunc();
        createIssueFunc();
        createIssueAssert();
        runThroughStatusesFunc();
        runThroughStatusesAssert();
        getScreenshot();
    }
}
