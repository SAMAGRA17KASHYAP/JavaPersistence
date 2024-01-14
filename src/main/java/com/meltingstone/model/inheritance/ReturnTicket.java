package com.meltingstone.model.inheritance;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
public class ReturnTicket extends TicketParent {
    @Getter
    @Setter
    private LocalDate latestReturnDate;
}
