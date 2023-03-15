package ir.maktab.repository;

import ir.maktab.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class UserRepositoryImpl implements UserRepository {

    @Override
    public void creat(Person person) {
        EntityManager entityManager = EntityManagerFactoryProducer.emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(person);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Person findByUsernameAndPassword(String username, String password) {
        EntityManager entityManager = EntityManagerFactoryProducer.emf.createEntityManager();
        entityManager.getTransaction().begin();
        String query = "from Person where username=:username and lastName=:password";
        Query resultQuery = entityManager.createQuery(query, Person.class);
        resultQuery.setParameter("username", username);
        resultQuery.setParameter("password", password);
        Person person = (Person) resultQuery.getSingleResult();
        entityManager.getTransaction().commit();
        entityManager.close();
        return person;
    }

    @Override
    public void delete(Person person) {
        EntityManager entityManager = EntityManagerFactoryProducer.emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(person);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Person update(Person person) {
        EntityManager entityManager = EntityManagerFactoryProducer.emf.createEntityManager();
        entityManager.getTransaction().begin();
        Person editedPerson = entityManager.merge(person);
        entityManager.getTransaction().commit();
        entityManager.close();
        return editedPerson;
    }
}
