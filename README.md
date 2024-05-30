# javalab-2023
_______
## [TASK 1](https://github.com/beatztw/javalab-2023/tree/main/Microservices)
#### Реализовать:
* Сервис, предоставляющий информацию об отелях и кинотеатрах в каком-либо городе - [SERVICE](https://github.com/beatztw/javalab-2023/tree/main/Microservices/HotelAndCinemaService)
#### Реализовать 3 приложения:
* Сервис, предоставляющий информацию об отелях в каком-либо городе - [HOTEL-SERVICE](https://github.com/beatztw/javalab-2023/tree/main/Microservices/HotelService)
* Сервис, предоставляющий информацию об кинотеатрах в каком-либо городе - [CINEMA-SERVICE](https://github.com/beatztw/javalab-2023/tree/main/Microservices/CinemaService)
* Сервис-клиент, у которого можно запросить полную информацию о городе (с отелями и кинотеатрами) - [SERVICE-CLIENT](https://github.com/beatztw/javalab-2023/tree/main/Microservices/HotelAndCinemaServiceClient)
* Сервисы должны предоставлять информацию клиенту только через валидный api-ключ
-------

## [TASK 2](https://github.com/beatztw/javalab-2023/tree/main/Context)
* Посмотреть и изучить context.Timeout
#### Реализовать:
* В примере 4 заменить реализацию **goToRemoteServer** на нашу версию с **user** из **requests**
* Сделать так, чтобы сервер отвечал с ошибкой, или отвечал с timeout-ом
* Посмотреть, будут ли отменены действия с базой и диском
#### Реализовать 2 приложения:
* Простое Web-приложения имитирующее удаленный сервер - [SimpleWebProject](https://github.com/beatztw/javalab-2023/tree/main/Context/SimpleWebProject)
* Timeout Context - [TimeoutContext](https://github.com/beatztw/javalab-2023/tree/main/Context/TimeoutContext)
-------

# javalab-2024
_______
## [TASK 1](https://github.com/beatztw/javalab-2023/tree/main/WebFlux2024)
#### Реализовать:
* Реализовать сервисы с использованием WebFlux.
-------

## [TASK 2](https://github.com/beatztw/javalab-2023/tree/main/gRPC%20Project)
#### Реализовать:
* Простой gRPC проект на Go, используя MongoDB
* -------

## [TASK 4](https://github.com/beatztw/javalab-2023/tree/main/gRPCServices)
#### Необходимо реализовать три сервиса:

1. cv-service - взаимодействует с базой данных cv-db, которая хранит резюме пользователей (предусмотреть не менее 5 резюме с различными данными) - [cv-service](https://github.com/beatztw/javalab-2023/tree/main/CgRPCServices/CVService).

2. job-service - предоставляет информацию о какой-либо вакансии. Вакансии следует вытаскивать из другой базы данных Mongo, можно назвать ее job-db - [job-service](https://github.com/beatztw/javalab-2023/tree/main/gRPCServices/JobService).

3. hr-service - по HTTP-запросу на GET /api/candidates возвращает пары резюме-вакансия, если требования резюме и вакансии совпадают - [hr-service](https://github.com/beatztw/javalab-2023/tree/main/gRPCServices/HRService).

#### Все упаковать в докер, настроить через Docker Compose
