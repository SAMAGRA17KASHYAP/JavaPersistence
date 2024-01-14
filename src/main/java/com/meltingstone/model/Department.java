package com.meltingstone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "DEPARTMENTS")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Department {

    @Id
    @Column(name = "ID")
    @Getter
    private int id;

    @Column(name="DEPARTMENT_NAME")
    @Getter
    @Setter
    private String name;

}
