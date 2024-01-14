package com.meltingstone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "MANAGERS")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Manager {

    @Id
    @Getter
    @Column(name = "ID")
    private  int id;

    @Column(name="MANAGER_NAME")
    @Getter
    @Setter
    private String name;


    @OneToOne
    @JoinTable(name = "MANAGET_DEPARTMENT",joinColumns = {
            @JoinColumn(name = "TO_MANAGER",referencedColumnName = "ID")
    },inverseJoinColumns = {
            @JoinColumn(name = "TO_DEPARTMENT",referencedColumnName = "ID")
    })
    @Getter
    @Setter
    private Department department;
}
