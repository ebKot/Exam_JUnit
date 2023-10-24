package Steps;

import Elements.MyIssuePageElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import java.time.Duration;

import static Elements.CreateIssueDialogElements.linkNewIssue;

public class MyIssuePageSteps extends MyIssuePageElements {
    @Step("Перевод созданного бага по статусам до Подтверждено")
    public static void runThroughStatusesFunc() throws InterruptedException {
        // Открыть задачу
        linkNewIssue.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();

        // Перевести задачу в статус "Взят в работу"
        workflowTransitionTaken.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        Thread.sleep(1000);

        // Перевести задачу в статус "Исполнено"
        moreTransitions.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        workflowTransitionFulfilled.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        workflowTransitionFulfilledButton.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        Thread.sleep(1000);

        // Перевести задачу в статус "Подтверждено"
        moreTransitions.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        workflowTransitionConfirmed.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        workflowTransitionConfirmedButton.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();
        Thread.sleep(1000);
    }
}
