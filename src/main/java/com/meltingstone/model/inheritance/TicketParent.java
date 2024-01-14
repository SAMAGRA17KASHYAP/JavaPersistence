package com.meltingstone.model.inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "TICKETS1")
public  class TicketParent {

    @Id
    @GeneratedValue
    @Getter
    private int id;

    @Getter
    @Setter
    private  String number;

    public TicketParent(String number)
    {
        this.number = number;
    }
}
