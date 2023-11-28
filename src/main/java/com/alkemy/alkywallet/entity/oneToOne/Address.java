package com.alkemy.alkywallet.entity.oneToOne;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "direction")
    private String direction;

    @OneToOne(mappedBy = "address") // mappedBy indica que atributo del objeto Person mapea con Address
                                    // La Relacion es unidireccional de Persona a Address, desde adress no puedo ir a persona
    private Person person;
}
