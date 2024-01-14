package com.meltingstone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TICKETS")
@NoArgsConstructor
@Access(AccessType.FIELD)
public class  Ticket {

    @Id
    @Column(name = "ID")
    private  int id;

    @Column(name = "NUMBER")
    @Getter
    @Setter
    private String number;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "PASSENGER_ID")
    private Passenger passenger;
    public Ticket(int id, String number) {
        this.id = id;
        this.number = number;
    }
}
