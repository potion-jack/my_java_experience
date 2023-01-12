package com.sparta.week01_hw.Controller;

import com.sparta.week01_hw.person.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getPerson(){
        Person person = new Person();
        person.setName("김정우");
        person.setAge(26);
        person.setAddress("서울특별시");
        person.setJob("개발자");
        return person;
    }
}
