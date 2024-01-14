package com.meltingstone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

@Embeddable
public class BillingAddress {

    @Column(name="ADDRESS_LINE_1")
    @Getter
    @Setter
    private  String addressLine1;

    @Column(name="ADDRESS_LINE_2")
    @Getter
    @Setter
    private  String addressLine2;

    @Column(name="STREET")
    @Getter
    @Setter
    private  String street;

    @Column(name="CITY")
    @Getter
    @Setter
    private  String city;

    @Column(name="ZIP_CODE")
    @Getter
    @Setter
    private  String zipCode;


}
