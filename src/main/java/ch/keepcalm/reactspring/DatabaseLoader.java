package ch.keepcalm.reactspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(Employee.builder().name("Jone Doe").age(45).years(5).build());
        this.repository.save(Employee.builder().name("Joe Biden").age(45).years(7).build());
        this.repository.save(Employee.builder().name("President Obama").age(54).years(12).build());
        this.repository.save(Employee.builder().name("Crystal Mac").age(34).years(2).build());
        this.repository.save(Employee.builder().name("James Henry").age(42).years(1).build());
    }
}
