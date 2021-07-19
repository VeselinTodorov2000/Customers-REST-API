Задача: Да се направи REST API, чрез което да могат да се извършват следните операции
GET /api/customer - при извикване на този URL чрез GET заявка да връща списък в JSON формат с всички Customer-и. Нека един customer да има следните данни:
ID: long
Name: string
CreationDate: Date
purchasedItems: integer

Данните за Customer-ите трябва да идват от база данни

GET /api/customer/<ID> - полето <ID> e параметър, когато се подаде конкретно ИД този end point трябва да връща данни за конкретен Customer.
POST /api/customer - Тази ПОСТ заявка трябва да създава нов Customer и да го съхранява в базата данни, когато се подаде като body на заявката в JSON формат
PUT  /api/customer - трябва да прави update на customer-a
DELETE  /api/customer/<ID> - тук трябва да изтрива customer

За целта на задачката трябва да използваш:
Maven за да се билдва проекта
Spring Boot - за имплементацията на REST API-то и бизнес логиката
Hibernate - за комуникация с базата данни
PostgreSQL за база данни
Ето линк към официалната Spring Boot документация:
https://spring.io/projects/spring-boot#overview

За другите неща се опитай да намериш само инфо. Опитай се да структурираш проекта като го разделиш на слоеве. Трябва да имаш слой controller, който да държи имплементацията на RestController-ите, които се грижат за HTTP комуникацията. След това трябва да имаш Service слой, който да съдържа бизнес логиката. И последно трябва да имаш Repository слой, който се грижи за комуникацията с базата данни. 

Прочети и като цяло какво е object relational mapping и REST API.