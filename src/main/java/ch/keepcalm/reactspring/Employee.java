package ch.keepcalm.reactspring;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private int age;
    private int years;

}