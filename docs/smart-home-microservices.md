# Подзадание 1.2 Архитектура микросервисов

## [«Декомпозиция на микросервисы»](smart-home-microservices-architecture-subtask-1-2.drawio)
Декомпозиция на микросервисы основываясь на выделенных доменах и границах контекстов,
представлена на [диаграмме](smart-home-microservices-architecture-subtask-1-2.drawio) [pdf](smart-home-microservices-architecture-subtask-1-2.drawio.pdf).

## [«Определение взаимодействия»](smart-home-microservices-architecture-subtask-1-2.drawio)
1. Взаимодействие микросервиса «Телеметрии» с датчиками происходит через событийную модель посредством обмена сообщениями через топики kafka. Данный микросервис сохраняет состояние в свою БД.  
2. Взаимодействие пользователя с микросервисами «Управления устройствами» и «Телеметрии» осуществляется через API Gateway.
3. Микросервис «Управления устройствами» посылает команды для устройств через топики kafka. Данный микросервис сохраняет состояние в свою БД.
4. Микросервис «Авторизации и аутентификации» позволяет производить авторизированный вход пользователя в систему, выдачи ролей и токена.

## [«C4 — Уровень контейнеров (Containers)»](smart-home-microservices-Container.puml)
«C4 — Уровень контейнеров (Containers)»: [диаграмма](smart-home-microservices-Container.puml) [svg](smart-home-microservices-Container-Smart_Home_Container_Diagram.svg).
## [«C4 — Уровень компонентов (Components)»](smart-home-microservices-Component.puml)
«C4 — Уровень компонентов (Components)»: [диаграмма](smart-home-microservices-Component.puml) [svg](smart-home-microservices-Component-Smart_Home_System_Component_Diagram.svg). 
## «C4 — Уровень кода (Code)»
* [«C4 — Уровень кода Management microservice»](smart-home-microservices-Code-Management.puml)
* [«C4 — Уровень кода Telemetry microservice»](smart-home-microservices-Code-Telemetry.puml)
