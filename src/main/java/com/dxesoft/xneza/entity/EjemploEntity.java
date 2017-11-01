package com.dxesoft.xneza.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * xneza, com.dxesoft.xneza.entity . EjemploEntity
 * Created by ernesto on 25/10/17.
 */
@Entity(name = "ejemplo")
@Data
public class EjemploEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "ejemplo_name")
    @NotNull
    private String ejemploName;

    @Column(name = "apellido")
    private String apellido;

}
