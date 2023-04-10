package ir.maktab.data.model;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Builder
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private String username;
    private String password;
}
