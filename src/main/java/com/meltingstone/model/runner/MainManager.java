package com.meltingstone.model.runner;

import com.meltingstone.model.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainManager {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencejakartaee.m02.ex01");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Manager manager = new Manager();
        manager.setName("Aditya");

        Department department = new Department();
        department.setName("Platform");
        manager.setDepartment(department);

        em.persist(department);
        em.persist(manager);
        em.getTransaction().commit();
        emf.close();
    }
}
