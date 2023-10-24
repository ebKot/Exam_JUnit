package assertions;

import elements.CreateIssueDialogElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

public class CreateIssueDialogAsserts extends CreateIssueDialogElements {
    @Step("Проверка успешности создания бага")
    public static void createIssueAssert() {
        Assertions.assertTrue(textLinkNewIssue.getText().endsWith(" успешно создан."));
    }
}
