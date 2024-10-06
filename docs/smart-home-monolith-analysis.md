# Подзадание 1.1 Анализ и планирование

## [«Функциональность монолитного приложения»](Heating-System-monolith-Swagger-UI.pdf)
Функциональность монолитного приложения Heating System есть синхронное REST API.
* Язык программирования: Java фреймворк Spring Boot плюс работа с БД Spring Data JPA 
* База данных: PostgreSQL
* Архитектура: Монолитная, все компоненты системы (обработка запросов, бизнес-логика, работа с данными) находятся в рамках одного приложения.
* Взаимодействие: Синхронное, запросы обрабатываются последовательно.
* Масштабируемость: Ограничена, так как монолит сложно масштабировать по частям.
* Развертывание: Требует остановки всего приложения.

Описанное функциональности в [OpenAPI формате](Heating-System-monolith-open-api.yaml) [pdf](Heating-System-monolith-Swagger-UI.pdf),
состоит из следующих эндпойнтов:
* метод GET, путь: /api/heating/{id}, возвращает подробную информацию о конкретном устройстве по его ID.
* метод PUT, путь: /api/heating/{id}, обновляет информацию о конкретном устройстве по его ID.
* метод POST, путь: /api/heating/{id}/turn-on, изменить состояние «Включить» устройство.
* метод POST, путь: /api/heating/{id}/turn-off, изменить состояние «Выключить» устройство.
* метод POST, путь: /api/heating/{id}/set-temperature, устанавливает температуру.
* метод GET, путь: /api/heating/{id}/current-temperature, возвращает информацию о температуре устройства.

Модель данных представлена двумя таблицами:
1. heating_systems - системы отопления.
2. temperature_sensors - температурные датчики.

## [«Архитектура монолитного приложения»](smart-home-monolith-architecture-subtask-1-1.drawio)
Архитектура монолитное приложения состоит из самого приложения на Java, базы данных на СУБД PostgreSQL,
модулей управления отоплением и веб-клиентов приложения [схема](smart-home-monolith-architecture-subtask-1-1.drawio) [pdf](smart-home-monolith-architecture-subtask-1-1.drawio.pdf).

## [«Домены и границы контекстов»](smart-home-monolith-Component.puml)
Можно определить два домена на основе [диаграммы компонентов](smart-home-monolith-Component-Heating_System_Application_Component_Diagram.png)
1. Домен управления устройствами.
2. Домен Телеметрии.

## [«Контекст системы C4»](smart-home-monolith-Context.puml)
[Визуализация контекста системы, взаимодействие монолитного приложения с пользователями и датчиками](smart-home-monolith-Context-Heating_System_Context_Diagram.png).