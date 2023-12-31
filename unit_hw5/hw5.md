### Задание 1. *Представьте, что вы работаете над разработкой простого приложения для записной книжки, которое позволяет пользователям добавлять, редактировать и удалять контакты.
Ваша задача - придумать как можно больше различных тестов (юнит-тесты, интеграционные тесты, сквозные тесты) для этого приложения. 
Напишите название каждого теста, его тип и краткое описание того, что этот тест проверяет. 

>    1. testAddContact(unit test) - проверка, что метод на добавление контакта работает корректно.
>    2. testRemoveContact(unit test) - проверка, что метод на удаление контакта работает корректно.
>    3. testChangeContact(unit test) - проверка, что метод с редактированием контакта работает корректно.
>    4. testGetAllContact(integration test) - проверка, что метод корректно возвращает список всех контактов.
>    5. testSearchContactByName(integration test) - проверка, что метод возвращает необходимый контакт по запросу.
>    6. testAddContactUser(E2E test) - проверка, что метод на добавление контакта c пользовательского интерфейса работает корректно.  
>    7. testRemoveContactUser(E2E test) - проверка, что метод на удаление контакта c пользовательского интерфейса работает корректно.
>    8. testChangeContactUSer(E2E test) - проверка, что метод с редактированием контакта c пользовательского интерфейса работает корректно.


### Задание 2. *Ниже список тестовых сценариев. Ваша задача - определить тип каждого теста (юнит-тест, интеграционный тест, сквозной тест) и объяснить, почему вы так решили. ###

1. Проверка того, что функция addContact корректно добавляет новый контакт в список контактов"".

>   Unit тест, т.к он служит для надежной и быстрой проверки небольших модулей кода, в нашем же случае проверки одного метода.

2. Проверка того, что при добавлении контакта через пользовательский интерфейс, контакт корректно отображается в списке контактов"".

>   Интеграционное тестироввание, т.к. проверяет, как различные части системы взаимодействуют друг с другом, в данном случае, 
    между пользовательским интерфейсом и внутренним функционалом приложения.

3. Проверка полного цикла работы с контактом: создание контакта, его редактирование и последующее удаление"".

>   Сквозное тестирование (End-to-end, E2E, Chain testing) т.к. проверяет все программного обеспечения
    на предмет зависимостей, целостности данных и связи с другими системами, интерфейсами и базами данных 
    для проверки успешного выполнения полного производственного сценария.

