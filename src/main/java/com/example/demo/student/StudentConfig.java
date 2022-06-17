package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student daniela = new Student(
                    "Daniela",
                    "daefp11@gmail.com",
                    LocalDate.of(1983, FEBRUARY, 15),
                    39
            );

            Student afonso = new Student(
                    "Afonso",
                    "afonsinho2022@gmail.com",
                    LocalDate.of(2022, MAY, 4),
                    0
            );

            repository.saveAll(
                    List.of(daniela, afonso)
            );
        };
    }
}
