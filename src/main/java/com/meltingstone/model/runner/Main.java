package com.meltingstone.model.runner;

import com.meltingstone.model.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m02.ex01");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Airport airport = new Airport(1, "Henri Coanda");
        Passenger john = new Passenger(1, "John Smith","Hayat","Street1","City1","13001","91","7878858");
        john.setAirport(airport);
        Passenger mike = new Passenger(2, "Michael Johnson","Hayat","Street1","City1","13001","91","7878858");
        mike.setAirport(airport);
        airport.addPassenger(john);
        airport.addPassenger(mike);

        Ticket ticket1 = new Ticket(1, "AA1234");
        ticket1.setPassenger(john);

        Ticket ticket2 = new Ticket(2, "BB5678");
        ticket2.setPassenger(john);

        john.addTicket(ticket1);
        john.addTicket(ticket2);

        john.addAttribute("VIP","yes");
        john.addAttribute("FREQUENT_FLYER","TRUE");
        Ticket ticket3 = new Ticket(3, "CC0987");
        ticket3.setPassenger(mike);
        mike.addTicket(ticket3);

        Payment payment = new Payment();payment.setAmount(100.00);

        BillingAddress billingAddress = new BillingAddress();
        billingAddress.setAddressLine1("Address Line 1");
        billingAddress.setAddressLine2("Address Line 2");
        billingAddress.setCity("City");
        billingAddress.setStreet("Street");
        billingAddress.setZipCode("Zip Code");


        payment.setTicket(ticket3);
        payment.setBillingAddress(billingAddress);
        em.persist(airport);
        em.persist(john);
        em.persist(mike);

        em.persist(ticket1);
        em.persist(ticket2);
        em.persist(ticket3);
        em.persist(payment);

        em.getTransaction().commit();
        emf.close();
    }
}
