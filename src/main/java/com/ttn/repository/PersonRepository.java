package com.ttn.repository;

import com.ttn.Entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    Page<Person> findAll(Pageable pageable);
/*
    List<Person> findByAgeGreaterThanOrderByIdDesc(Integer age);

    List<Person> findByFirstnameIgnoreCase(String firstname);

    @Query("SELECT count(p) from Person p where firstname=:firstname")
    Integer findByName(@Param("firstname") String firstname);


    @Query("SELECT firstname,lastname from Person where age=:age")
    List<Object[]> customFindByAge(@Param("age") Integer age);*/

/*
    List<Person> findByFirstname(String name);

    List<Person> findByLastname(String name);

    Person findById(Integer id);*/

/*


    @Query("SELECT id,firstname from Employee where id=:id")
    List<Object[]> cusFindById(@Param("id") Integer id);

    @Query("SELECT e from Employee e where id=:id")
    Person cusfindById(@Param("id") Integer id);

    @Query("SELECT Count(*) from Employee e where name=:name")
    Integer countByName(@Param("name") String name);

    int countById(Integer id);

    List<Person> findFirstByName(String name);

    List<Person> findFirst3ByName(String name);

    Person findDistinctByName(String name);

    List<Person> findByNameOrAge(String name, Integer age);

    List<Person> findByNameIs(@Param("name") String name);

//    List<Person> findAll(Sort sort);
    Page<Person> findAll(Pageable pageable);*/

}
