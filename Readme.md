# Proyecto de Guia SpringBoot

## Software Recomendados

IntelliJ Community : https://www.jetbrains.com/idea/download/?section=windows \
VisualCode: https://code.visualstudio.com/download \
Postman: https://www.postman.com/downloads/ \
Dbeaver: https://dbeaver.io/download/ 

## Crear proyecto Spring Boot
Ir a : https://start.spring.io/

## Crear Base de Datos
MySql Server 8.X \
MySql Workbench 8.X \
Tutorial: https://www.youtube.com/watch?v=5OdVJbNCSso
```sql
CREATE DATABASE alkemy;
USE alkemy;
```
## Configurar la coneccion a la DB
/src/main/resources/application.properties
```
spring.jpa.hibernate.ddl-auto=update  
spring.datasource.url=jdbc:mysql://localhost:3306/alkemy  
spring.datasource.username=root  
spring.datasource.password=root  
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver  
spring.jpa.show-sql: true
```
mas informacion en : https://spring.io/guides/gs/accessing-data-mysql/