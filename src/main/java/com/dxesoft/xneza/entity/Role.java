package com.dxesoft.xneza.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.io.Serializable;

/**
 * xneza, com.dxesoft.xneza.entity . Role
 * Created by ernesto on 29/10/17.
 */
@Entity(name = "roles")
@Data
public class Role implements Serializable{

    @Id
    @SequenceGenerator(name = "sequenceGenerator")
    public Long id;

    @Column(name = "role_name")
    public String roleName;

    @Column(name = "creation_date")
    public String creationDate;
}
