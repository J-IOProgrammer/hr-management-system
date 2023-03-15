package ir.maktab.data.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String username;
    private String password;

    public Person(String firstName, String lastName, int age, String country, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
        this.username = username;
    }
}
