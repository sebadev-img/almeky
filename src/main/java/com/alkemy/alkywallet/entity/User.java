package com.alkemy.alkywallet.entity;

import jakarta.persistence.*;
import lombok.*;


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
