package inheritance.runner;

import inheritance.OneWayTicket;
import inheritance.ReturnTicket;
import inheritance.OneWayTicket;
import inheritance.ReturnTicket;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m02.ex01");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        OneWayTicket oneWayTicket = new OneWayTicket();
        oneWayTicket.setNumber("123");
        oneWayTicket.setLatestDepartureDate(LocalDate.now());

        ReturnTicket returnTicket = new ReturnTicket();
        returnTicket.setNumber("123");
        returnTicket.setLatestReturnDate(LocalDate.now());

        em.persist(oneWayTicket);
        em.persist(returnTicket);
        em.getTransaction().commit();
        emf.close();
    }
}
