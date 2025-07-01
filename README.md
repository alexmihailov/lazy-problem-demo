
1) Запускаем БД в контейнере через [docker-compose.yaml](docker-compose.yaml)
2) Запускаем приложение и смотрим логи:
```
Hibernate: select se1_0.id,se1_0.main_name,se1_0.name from slave_entity se1_0
Hibernate: select me1_0.id,me1_0.name from main_entity me1_0 where me1_0.name=?
```
Выполняется два запроса вместо одного, хотя mainEntit
y помечен, как LAZY.