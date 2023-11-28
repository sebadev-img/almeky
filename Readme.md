# Proyecto de Guia SpringBoot

## Software Recomendados

IntelliJ Community : https://www.jetbrains.com/idea/download/?section=windows \
VisualCode: https://code.visualstudio.com/download \
Postman: https://www.postman.com/downloads/ \
Dbeaver: https://dbeaver.io/download/ 

## Crear proyecto Spring Boot
Ir a : https://start.spring.io/

![](./imagenes/springboot%20Inicializador.bmp)

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

## Como modelar las tablas en SpringBoot
En base de datos las entidades estan representadas por tablas mientras en java se trabaja con objetos. Springboot permite mapear las tablas a objetos usando un JPA que es una implementacion de Hibernate(un ORM).
En la estructura del proyecto vamos a tener una carpeta llamada Entity donde vamos a colocar las clases java que repesenta cada entidad.

```java
@NoArgsConstructor // crea el constructor sin argumentos  
@AllArgsConstructor // crea el constructor con todos los argumentos  
@Getter // crea todos los getter  
@Setter // crea todos los setter  
@ToString //metodo para imprimir el objeto  
  
  
@Entity // con la anotacion @Entity le decimos a Spring que es una tabla en la DB  
@Table(name = "users") // le damos un nombre a la tabla  
public class User {  
  
    @Id // le decimos que el campo va a ser el ID  
  @GeneratedValue(strategy = GenerationType.IDENTITY) //el id se genera automaticamente  
  private Long id; // el id por convencion es de tipo Long  
  
  @Column(name="first_name",nullable = false) // para configurar atributos de la columna como el nombre y si es null  
  private String firstName;  
  
    @Column(name="last_name",nullable = false)  
    private String lastName;  
}
```

## Como crear el Repositorio para cada modelo

Cada Entidad(modelo) va a tener un repositorio, el repositorio nos brinda metodos para hacer operaciones en la BD.
Los repositorios van en la carpeta "repository".

/src/main/java/alkywallet/repository/UserRepository

```java
@Repository // anotacion para que Spring sepa que es un repositorio
public interface UserRepository extends JpaRepository<User,Long> {
}
```

## Mapeo de relaciones entre entidades

Las entidades(tablas) pueden tener relaciones entre ellas: Uno a Uno, Uno a Muchos, Mucho a Muchos. \
Las relaciones tambien tienen una direccion: unidireccional o bidireccional. \
El siguiente link muestra como mapear las relaciones entre entidades: \
https://stackabuse.com/a-guide-to-jpa-with-hibernate-relationship-mapping/
