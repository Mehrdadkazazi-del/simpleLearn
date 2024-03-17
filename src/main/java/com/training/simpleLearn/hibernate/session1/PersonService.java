package com.training.simpleLearn.hibernate.session1;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void insertPerson() {
        Person person = new Person(10, "mehrdad");

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(person);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }


        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Person> personList = session.createQuery("from Person", Person.class).list();
            personList.forEach(p -> System.out.println(p.getFirstName()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }


}
