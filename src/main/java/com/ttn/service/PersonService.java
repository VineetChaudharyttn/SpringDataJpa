package com.ttn.service;

import com.ttn.Entity.Person;
import com.ttn.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    public void findByPage(){
        Page<Person> people=personRepository.findAll(new PageRequest(0,3,new Sort(Sort.Direction.DESC,"id")));
        List<Person> personList=people.getContent();
        System.out.println(personList);
    }
/*
    public  void findAndSort(Integer age){
        System.out.println(personRepository.findByAgeGreaterThanOrderByIdDesc(age));
    }

    public void findByFirst(String firstname){
        System.out.println(personRepository.findByFirstname(firstname));
    }

    public void findByLast(String lastname){
        System.out.println(personRepository.findByLastname(lastname));
    }

    public void findById(Integer id){
        System.out.println(personRepository.findById(id));
    }*/
/*

    public Person insert() {
    Person person=new Person();
        person.setFirstname("Dhanendra");
        person.setLastname("kumar");
        person.setAge(26);
        person.setSalary(50000);
        return personRepository.save(person);
    }

    public void findAll() {
        System.out.println(personRepository.findAll());
    }

    public void delete(Integer id) {
        personRepository.delete(id);
    }

    public void count() {
        System.out.println(personRepository.count());
    }

    public void exists(Integer id) {
        if (personRepository.exists(id)) {
           System.out.println(id+" is Exists.");
        }
        else System.out.println(id+" is does not Exists.");
    }

    public void find(Integer id) {
        System.out.println(personRepository.findOne(id));
    }




    public void savePerson() {
        Person person = new Person();
        person.setFirstname("Vineet");
        person.setLastname("Chaudhary");
        person.setSalary(40000);
        person.setAge(22);
        personRepository.save(person);
    }

    public String getPerson() {
        return (String) personRepository.vineet().get(0)[1];
    }

    public List<Person> getList() {
        Page<Person> employeePage = personRepository.findAll(new PageRequest(5, 3, new Sort(Sort.Direction.DESC, "id")));
        List<Person> employeeList = employeePage.getContent();
        return employeeList;
    }
*/

}
