package com.meltingstone.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.*;

@Entity
@Table(name="PASSENGERS")
@NoArgsConstructor
@Access(AccessType.FIELD)
@SecondaryTables(
        {@SecondaryTable(name = "ADDRESSES",pkJoinColumns =
@PrimaryKeyJoinColumn(name = "ADDRESS_PASSENGER_ID",referencedColumnName = "PASSENGER_ID")),
                @SecondaryTable(name = "PHONE_NUMBERS",pkJoinColumns =
        @PrimaryKeyJoinColumn(name = "PHONE_2_PASSENGER_ID",referencedColumnName = "PASSENGER_ID"))}
)

public class Passenger {
    @Id
    @Column(name="PASSENGER_ID")
    private  int id;
    @Column(name = "PASSENGER_NAME",table = "PASSENGERS")
    @Getter
    @Setter
    private String name;

    @ManyToOne
    @JoinColumn(name="AIRPORT_ID")
    @Getter
    @Setter
    private Airport airport;

    @Column(name = "ADDRESS",table = "ADDRESSES",columnDefinition = "varchar(255)")
    @Setter
    @Getter
    private String address;
    @Column(name = "STREET",table = "ADDRESSES",columnDefinition = "varchar(255)")
    @Setter
    @Getter
    private String street;
    @Column(name = "CITY",table = "ADDRESSES",columnDefinition = "varchar(255)")
    @Setter
    @Getter
    private String city;

    @Column(name = "ZIP_CODE",table = "ADDRESSES",columnDefinition = "varchar(255)")
    @Setter
    @Getter
    private String zipCode;

    @Column(name = "COUNTRY_CODE",table = "PHONE_NUMBERS",columnDefinition = "varchar(255)")
    @Setter
    @Getter
    private String countryCode;

    @Column(name = "PHONE_NUMBER",table = "PHONE_NUMBERS",columnDefinition = "varchar(255)")
    @Setter
    @Getter
    private String phoneNumber;
    @OneToMany(mappedBy = "passenger")
    private List<Ticket> tickets = new ArrayList<>();

    @ElementCollection
    @MapKeyColumn(name = "ATTRIBUTE_NAME")
    @Column(name = "ATTRIBUTE_VALUE")
    @CollectionTable(name = "PASSENGER_ATTRIBUTES",joinColumns = @JoinColumn(name = "TO_PASSENGER",referencedColumnName = "PASSENGER_ID"))
    private Map<String,String> attributes = new HashMap<>();


    public void addAttribute(String key,String value)
    {
        attributes.put(key, value);
    }


    public Passenger(int id, String name,String address,String street,String city,String zipCode,String countryCode,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.countryCode=countryCode;
        this.phoneNumber = phoneNumber;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

}
