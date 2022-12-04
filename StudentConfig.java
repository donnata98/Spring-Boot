package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {

        return args -> {
            //PRVI STUDENT
             Student mariam = new Student (
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );


            //DRUGI STUDENT
             Student alex = new Student(
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.JANUARY, 5)
            );


            //TRECI STUDENT
            Student bilal = new Student(
                    "Bilal",
                    "ahmed@gmail.com",
                    LocalDate.of(1995, Month.DECEMBER, 17)
            );

            //CETVRTI STUDENT
            Student melissa = new Student(
                    "Melissa",
                    "melissa@gmail.com",
                    LocalDate.of(1998, Month.APRIL, 20)
            );

            //PETI STUDENT
            Student samuel = new Student(
                    "Samuel",
                    "samuel@gmail.com",
                    LocalDate.of(2010, Month.AUGUST, 04)
            );

             //SPREMANJE

            repository.saveAll(

                    List.of(mariam, alex, bilal, melissa, samuel)
            );


        };
    }
}
