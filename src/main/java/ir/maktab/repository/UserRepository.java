package ir.maktab.repository;

import ir.maktab.model.Person;

public interface UserRepository {

    void creat(Person person);

    Person findByUsernameAndPassword(String username,String password);

    void delete(Person person);

    Person update(Person person);
}
