package org.example.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name ="students")
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_gen")
    @SequenceGenerator(name = "student_generator",
    sequenceName = "student_seq",
    allocationSize = 1)        ///     IDINI GENERASIA KYLAT ;

    private  Long id;

    @Column(name = "first_name",length = 10, nullable = false)
    private String firstName;
    private  String lastName;
    @Column(unique = true)     ///   UNICALNY BOLSUN DEGENDI BILDIRET;
    private  String email;
    private  int age;



    public Student(String firstName, String lastName, String email, int age) {
    }
}
