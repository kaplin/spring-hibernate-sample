package com.teamdev.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

/**
 * @author Pavel Kaplin
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
@Transactional
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void testSavedPersonHasId() {
        Person person = personService.createPerson("Johnnie B. Goode");
        assertNotNull(person.getId());
    }
}
