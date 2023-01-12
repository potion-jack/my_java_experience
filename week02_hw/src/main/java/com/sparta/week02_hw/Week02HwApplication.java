package com.sparta.week02_hw;

import com.sparta.week02_hw.domain.Person;
import com.sparta.week02_hw.domain.PersonRepository;
import com.sparta.week02_hw.domain.PersonRequestDto;
import com.sparta.week02_hw.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week02HwApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week02HwApplication.class, args);
    }
    @Bean
    public CommandLineRunner demo(PersonRepository personRepository, PersonService personService){
        return (args) -> {
            personRepository.save(new Person("김정우", 25, "주소1", "파이썬개발자"));
            personRepository.save(new Person("박민수", 23, "주소3", "코틀린개발자"));
        };
    }

}
