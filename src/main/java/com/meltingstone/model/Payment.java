package com.meltingstone.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PAYMENTS")
@Access(AccessType.FIELD)
@NoArgsConstructor
public class Payment {

    @Id
    @Column(name = "ID")
    @Getter
    private  int id;

    @Column(name = "AMOUNT")
    @Getter
    @Setter
    private  double amount;

    @ManyToOne
    @JoinColumns(value = {
            @JoinColumn(name = "TICKET_ID",referencedColumnName = "ID"),
            @JoinColumn(name = "TICKET_NUMBER",referencedColumnName = "NUMBER")
    })
    @Getter
    @Setter
    private Ticket ticket;

    @Embedded
    @Getter
    @Setter
    private BillingAddress billingAddress;
}
