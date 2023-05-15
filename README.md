# Приложение "Магазин цифровой техники"


## Описание
В данном репозитории находится приложение магазина цифровой техники. Данное приложение разработано как часть курсовой работы в 6-ом семестре обучения в РТУ МИРЭА по дисциплине **«Разработка клиент-серверных приложений»**

## Содержание
1. [Описание функциональности](#task0)
2. [Руководство по пользованию](#task1)
3. [Требования к системе](#task2)

## <a name="task0"></a> 1. Описание функциональности

Приложение использует разделение ролей пользователей:
- клиент
- администратор

И обладает следующей функциональностью:

**Клиент**
- авторизация и аутентификация
- просмотр основной информации о магазине
- добавление электронной почты к созданному аккаунту
- просмотр информации о товаре
- добавление товара в корзину
- оформление заказа
- сортировка по ценам
- фильтрация по категориям

**Администратор**
- добавление данных
- редактирование данных
- удаление данных
- возможность редактировать пользователей (добавлять, удалять)
- возможность перехода в режим, в котором сайт видит клиент

## <a name="task1"></a> 2. Руководство по пользованию

Каждый из пользователей осуществляет вход с помощью формы – вводит логин и пароль. После этого система определяет роль пользователя и загружает доступные ему страницы.

![image](https://raw.githubusercontent.com/NIKKELK/RKSP_Course-Project-2023/main/1.jpg)


## Руководство для пользователя с ролью «Клиент» или «Гость»

Вход осуществляется с помощью формы входа. После чего система распознает его и дает доступ к страницам. Посетитель может просматривать каталог товаров.


![image](https://raw.githubusercontent.com/NIKKELK/RKSP_Course-Project-2023/main/2.jpg)
![image](https://raw.githubusercontent.com/NIKKELK/RKSP_Course-Project-2023/main/3.jpg)
![image](https://raw.githubusercontent.com/NIKKELK/RKSP_Course-Project-2023/main/4.jpg)
![image](https://raw.githubusercontent.com/NIKKELK/RKSP_Course-Project-2023/main/5.jpg)

## <a name="task2"></a> 3. Требования к системе

Для сборки и запуска проекта должны выполняться следующие системные требования:
-	Операционная система Windows \ Linux
-	Установленная JRE (Java Runtime Environment)
-	Версия Java, начиная с 11
-	СУБД PostgreSQL
-	Созданная база данных для подключения приложения. Конфигурация БД
  - url: `jdbc:postgresql://localhost:8080/`
  - password: *** (по запросу)
  - username: *** (по запросу)
  - все таблицы создаются автоматически
