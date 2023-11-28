package com.alkemy.alkywallet.entity.oneToOne;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.PERSIST}) // indicamos que la relacion es uno a uno
                                            // cascade hace referencia a que se propaga al momento de hacer operaciones en la DB
                                            // Si el usuario se borra, se borra el addres?. Si el usuario se modifica, se modifica el address?. Etc.
    @JoinColumn(name="address_id", referencedColumnName = "id") // la anotacion @JoinColumn define el campo de clave foranea en la tabla persons,
                                                                // el campo se va a llamar address_id
                                                                 // referenceColumnName indica el nombre de la columna de la tabla adresses
    private Address adrress; // Una persona tiene un domicilio
}
