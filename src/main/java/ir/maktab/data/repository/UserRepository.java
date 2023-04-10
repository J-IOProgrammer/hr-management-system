package ir.maktab.data.repository;

import ir.maktab.data.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Person, Long> {

    Optional<Person> findPersonByUsername(String username);

}
