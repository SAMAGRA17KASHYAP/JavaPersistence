package com.meltingstone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name="AIRPORTS")
@NoArgsConstructor
@Access(AccessType.FIELD)
public class Airport {

    @Id
    @Column(name="ID")
    @Getter
    private int id;


    @Column(name = "NAME")
    @Getter
    @Setter
    private String name;

    @OneToMany
    private List<Passenger> passengers = new ArrayList<>();

    public Airport(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public List<Passenger> getPassengers() {
        return Collections.unmodifiableList(passengers);
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

}
