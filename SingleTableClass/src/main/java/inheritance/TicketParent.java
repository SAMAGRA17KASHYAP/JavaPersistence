package inheritance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name = "TICKETS1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DISCRIMINATOR_COLUMN")
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
