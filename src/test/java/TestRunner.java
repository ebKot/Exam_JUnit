import hooks.WebHooks;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.*;

import static assertions.CreateIssueDialogAsserts.createIssueAssert;
import static assertions.DashboardPageAsserts.goToProjectAssert;
import static assertions.LoginPageAsserts.loginAssert;
import static assertions.MyIssuePageAsserts.runThroughStatusesAssert;
import static assertions.TestProjectPageAsserts.issuesQuantityAssert;
import static assertions.TestSeleniumPageAsserts.testSeleniumStatusAssert;
import static assertions.TestSeleniumPageAsserts.testSeleniumVersionAssert;
import static steps.CreateIssueDialogSteps.createIssueFunc;
import static steps.DashboardPageSteps.goToProjectFunc;
import static steps.LoginPageSteps.loginFunc;
import static steps.MyIssuePageSteps.runThroughStatusesFunc;
import static steps.TestProjectPageSteps.issuesQuantityFunc;
import static steps.TestSeleniumPageSteps.testSeleniumFunc;

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
