package ir.maktab.service;

import ir.maktab.model.Person;
import ir.maktab.repository.UserRepositoryImpl;

public class UserService {
    UserRepositoryImpl userRepository = new UserRepositoryImpl();
    public Person login(String username , String password){
        return userRepository.findByUsernameAndPassword(username,password);
    }
    public void addNewUser(Person person){
        userRepository.creat(person);
    }
}
