# Экзаменационная работа. Часть 1

<img src="https://i.imgur.com/mbvWLJI.png" alt="Logos"/>

## Разработать проект автотестов с использованием JUnit, Maven, Selenide, Allure

За основу берётся следующее задание.

### Задача.
По паттерну PageObject реализовать тестирование следующего кейса.

Использовать локаторы X-Path для выбора элементов на странице.

1.	Авторизоваться в edujira.ifellow.ru (логин AT1 и пароль Qwerty123).
2.	Перейти в проект TestProject.
3.	Проверить общее количество заведенных задач в проекте ( например в  строке ‘1 из 30’ ).
4.	Перейти в задачу TestSelenium и проверить статус задачи и привязку в затронутой версии - Version 2.0.
5.	Создать автотестом новый баг с описанием. Перевести задачу по статусам до закрытого.
6.	В каждый тест добавить проверку assert. Нужно проверять этим методом всё, что мы делаем.

## Экзаменационное задание

Применить инструмент Allure для формирования отчёта. Проверить, что код соответствует требованиям:
> - Должен быть использован паттерн PageObject
> - Не должно быть System.out.println
> - Все проверки должны быть проведены через Assertions
> - В импортах не должно быть ничего не используемого
> - Все входные параметры в тесте должны использоваться только из application.properties
> - Тест должен работать из консоли
> - Должен строиться Allure отчет
> - В проекте, в git должны быть только: папка src с наполнением, .gitignore, pom.xml, README.md
> - Проект должен быть отдельным

## Как работать с проектом

Для запуска теста ввести в консоль `mvn clean test`

Для создания и открытия отчёта ввести в консоль `mvn allure:serve`

Для выхода из процесса зажать `Ctr+С` и ввести в консоль `Y`
