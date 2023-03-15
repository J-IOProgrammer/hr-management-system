package ir.maktab.data.repository;

import ir.maktab.data.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Person, Long> {

    Optional<Person> findPersonByUsername(String username);

}
