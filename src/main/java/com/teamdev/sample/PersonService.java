package com.teamdev.sample;

import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author Pavel Kaplin
 */
@Service
public class PersonService {

    @PersistenceContext
    private EntityManager em;

    public Person createPerson(String name) {
        Person person = new Person();
        person.setName(name);
        em.persist(person);
        return person;
    }

    public Person findByName(String name) {
        return em.createQuery("from Person where name = ?", Person.class).
                setParameter(1, name).getSingleResult();
    }
}
