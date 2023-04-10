package ir.maktab.service;

import ir.maktab.data.model.Person;
import ir.maktab.data.repository.UserRepository;
import ir.maktab.exception.InvalidPasswordException;
import ir.maktab.exception.UserNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    UserRepository userRepository;

    public Person login(String username, String password) {
        Person person = userRepository.findPersonByUsername(username).orElseThrow(UserNotFoundException::new);
        if (person.getPassword().equals(password))
            return person;
        throw new InvalidPasswordException();
    }

    public void addNewUser(Person person) {
        userRepository.save(person);
    }
}
