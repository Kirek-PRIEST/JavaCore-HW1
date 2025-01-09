Домашнее задание Java Core. Урок 1

Dockerfile
````
FROM bellsoft/liberica-openjdk-alpine:11.0.16.1-1

COPY ./src ./src

RUN mkdir ./out

RUN javac -sourcepath ./src -d out ./src/task/Main.java

RUN javadoc -d docs -sourcepath src -cp out -subpackages task -encoding utf-8
````
Создание контейнера:
>docker buildx build -t java-core:HW1 .