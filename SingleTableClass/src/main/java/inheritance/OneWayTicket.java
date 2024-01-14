package inheritance;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("OneWay")

public class OneWayTicket extends TicketParent {
    @Getter
    @Setter
    private LocalDate latestDepartureDate;
}
