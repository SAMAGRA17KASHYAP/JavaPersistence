package inheritance;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
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
