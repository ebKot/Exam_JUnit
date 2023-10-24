package Assertions;

import Elements.MyIssuePageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static Elements.TestSeleniumPageElements.statusValue;

public class MyIssuePageAsserts extends MyIssuePageElements {
    @Step("Проверка того, что баг перешёл в статус Готово")
    public static void runThroughStatusesAssert() {
        Assertions.assertEquals("ГОТОВО", statusValue.getText());
    }
}
