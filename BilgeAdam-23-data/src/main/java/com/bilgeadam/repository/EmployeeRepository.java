package com.bilgeadam.repository;

import com.bilgeadam.model.Employee;
import com.bilgeadam.model.EmployeeAgeStatistics;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository  extends CrudRepository<Employee,Integer> {

    // select * from employee where first_name like '%as%';
    List<Employee> findByFirstNameLike(String s);

    List<Employee> findByAgeLessThan(Integer age);
    List<Employee> findFirst2ByAgeGreaterThan(Integer age);
    List<Employee> findFirst3ByAgeLessThanOrderByAgeAsc(Integer age);
    List<Employee> findFirst3ByAgeLessThanOrderByLastNameAsc(Integer age);

    @Query("select count(e) from Employee e")
    Integer getTotalNumberOfEmployees();

    @Query("select e.age, count(e.age) from Employee e group by  e.age")
    List<?> getAgesWithGrouping();

    @Query(nativeQuery = true, value = "SELECT age AS age, count(age) AS count FROM employee GROUP BY age")
    List<EmployeeAgeStatistics> getAgesWithGroupingNativeQuery();
}


