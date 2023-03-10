package com.sparta.week02_hw.controller;

import com.sparta.week02_hw.domain.Person;
import com.sparta.week02_hw.domain.PersonRepository;
import com.sparta.week02_hw.domain.PersonRequestDto;
import com.sparta.week02_hw.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PersonController {
    private final PersonRepository personRepository;
    private final PersonService personService;

    @PostMapping("/api/persons")
    public Person createPerson(@RequestBody PersonRequestDto requestDto){
        Person person = new Person(requestDto);
        return personRepository.save(person);
    }
    @GetMapping("/api/persons")
    public List<Person> getCourses(){
        return personRepository.findAll();
    }

    @PutMapping("/api/persons/{id}")
    public Long updatePerson(@PathVariable Long id, @RequestBody PersonRequestDto requestDto){
        return personService.update(id,requestDto);
    }
    @DeleteMapping("/api/persons/{id}")
    public void deletePerson(@PathVariable Long id){
        personRepository.deleteById(id);
    }
}
