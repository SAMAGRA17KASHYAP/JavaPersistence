package inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("Return")
public class ReturnTicket extends TicketParent {
    @Getter
    @Setter
    private LocalDate latestReturnDate;
}
