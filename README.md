# Дипломный проект профессии «Тестировщик»

[План автоматизации](docs/Plan.md)

[Отчет по итогам тестирования](docs/Report.md)

[Отчет по итогам автоматизации](docs/Summary.md)
## Перед запуском
На пк должны быть установлены:
- IntelliJ IDEA
- Git
- Docker Desktop
- Google Chrome (или другой браузер)

## Инструкция по запуску
1. Склонировать репозиторий и открыть его в приложении IntelliJ IDEA.

2. Открыть Docker;

3. В терминале развернуть контейнер с помощью команды

   docker-compose up

4. В новом терминале запустить целевое приложение:

     для mySQL - java -jar artifacts/aqa-shop.jar --spring.profiles.active=mysql 

     для postgresgl - java -jar artifacts/aqa-shop.jar --spring.profiles.active=postgresql;

5. Открыть браузер и пройти по [ссылке](http://localhost:8080/) 

6. В новом терминале запустить тесты

    для mySQL - ./gradlew test -Durl=jdbc:mysql://localhost:3306/app -Duser=app -Dpassword=pass ;

    для postgresgl - ./gradlew test -Durl=jdbc:postgresql://localhost:5432/app -Duser=app -Dpassword=pass ;

7. В новом терминале сформировать отчет командой

    ./gradlew allureServe .