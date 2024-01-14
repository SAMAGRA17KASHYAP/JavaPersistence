package inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "RETURN_TICKET")
public class ReturnTicket extends TicketParent {
    @Getter
    @Setter
    private LocalDate latestReturnDate;
}
