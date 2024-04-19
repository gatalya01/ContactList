# Список контактов!

Это простое веб-приложение для управления контактным списком. Позволяет просматривать, добавлять, редактировать и удалять контакты.

## Технологии

- Java
- Spring Boot
- Thymeleaf
- PostgreSQL

## Установка и запуск

1. Убедитесь, что у вас установлены Java и PostgreSQL.
2. Создайте базу данных PostgreSQL с именем "contacts".
3. Измените настройки подключения к базе данных в файле `application.properties`.
4. Клонируйте репозиторий: `git clone <URL репозитория>`
5. Перейдите в каталог проекта: `cd contact-list`
6. Соберите проект: `./gradlew build`
7. Запустите приложение: `java -jar build/libs/contact-list-0.0.1-SNAPSHOT.jar`
8. Откройте браузер и перейдите по адресу `http://localhost:8080/`.

## Использование

- После запуска приложения вы можете просматривать контакты, добавлять новые, редактировать существующие и удалять.
- Для редактирования или удаления контакта, нажмите соответствующую ссылку рядом с контактом в списке.
- Для добавления нового контакта, перейдите по ссылке "Add contact".