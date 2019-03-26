package com.ttn.service;

import com.ttn.configuration.PersistenceConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PersistenceConfig.class);
        PersonService personService = applicationContext.getBean(PersonService.class);
        personService.findByPage();
//        personService.findAndSort(25);
//        personService.findByFirst("Dhanendra");
//        personService.findByLast("Chaudhary");
//        personService.findById(5);
        /*personService.delete(5);
        personService.find(4);
        personService.count();
        personService.exists(10);
        personService.findAll();
        personService.insert();*/
//        personService.savePerson();
        /*System.out.println(personService.getPerson());
        System.out.println(personService.personRepository.findByNameIs("Vineet"));

//        System.out.println(personService.personRepository.findAll(new Sort(Sort.Direction.DESC,"age").and(new Sort(Sort.Direction.DESC,"id"))));

        System.out.println(personService.getList());*/
    }
}
