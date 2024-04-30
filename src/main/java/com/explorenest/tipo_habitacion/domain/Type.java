package com.explorenest.tipo_habitacion.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Type {
    @Id
    private Integer id;
    private String description;
}
