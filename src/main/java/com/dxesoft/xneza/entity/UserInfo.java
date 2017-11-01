package com.dxesoft.xneza.entity;

import lombok.Data;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * xneza, com.dxesoft.xneza.entity . UserInfo
 * Created by ernesto on 28/10/17.
 */
@Entity(name = "users")
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 6558983686134745930L;

    @Id
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "user_name")
    @NotNull
    private String UserName;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column
    private Boolean enabled;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    @Column(name = "disabled_date")
    private LocalDateTime disabledDate;

    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(
            name = "user_roles",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id", referencedColumnName = "id")}
    )
    private Set<Role> roles = new HashSet<>();
}
