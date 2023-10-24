package steps;

import elements.CreateIssueDialogElements;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.switchTo;

public class CreateIssueDialogSteps extends CreateIssueDialogElements {
    @Step("Создание нового бага")
    public static void createIssueFunc() {
        // Кнопка Создать
        createButton.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();

        // Поле Тема
        subjectField.shouldBe(Condition.visible, Duration.ofSeconds(15)).setValue("Ошибка создания бага");

        // Поле Описание
        switchTo().frame(descriptionFrame);
        descriptionField.shouldBe(Condition.exist, Duration.ofSeconds(15)).setValue("1. Заполнить поля \n Нажать Создать");
        switchTo().defaultContent();

        // Исправить в версиях
        fixVersion2_0.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();

        // Поле Приоритет
        priorityField.shouldBe(Condition.exist, Duration.ofSeconds(15)).click();
        priorityField.sendKeys("Highest" + Keys.ENTER);

        // Поле Метки
        tagsField.shouldBe(Condition.visible, Duration.ofSeconds(15)).sendKeys("Xpath");

        // Поле Окружение
        switchTo().frame(environmentFrame);
        environmentField.shouldBe(Condition.exist, Duration.ofSeconds(15)).setValue("Windows 10, Google Chrome 117.0.5938.92");
        switchTo().defaultContent();

        // Затронуты версии
        affectedVersion2_0.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();

        // Назначить меня
        assignButton.shouldBe(Condition.visible, Duration.ofSeconds(15)).click();

        // Кнопка Создать
        confirmCreateButton.shouldBe(Condition.visible, Duration.ofSeconds(1)).click();
    }
}
