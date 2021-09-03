package com.bilgeadam.mongodb.repository;

import com.bilgeadam.mongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Optional<Employee> findEmployeeBySsid(long ssid);

    @Query("{'firstname' : ?0 , 'lastname' : ?1}")
    Employee findEmployeeByFirstnameAndLastname(String firstName, String lastName);
}
