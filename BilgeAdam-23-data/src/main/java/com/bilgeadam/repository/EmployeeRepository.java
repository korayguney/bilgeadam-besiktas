package com.bilgeadam.repository;

import com.bilgeadam.model.Employee;
import com.bilgeadam.model.EmployeeAgeStatistics;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository  extends CrudRepository<Employee,Integer> {

    // select * from employee where first_name like '%as%';
    List<Employee> findByFirstNameLike(String s);

    // sort employees in ascending order
    //List<Employee> users = userRepository.findByNameContaining("john", Sort.by("name").descending());
    List<Employee> findByFirstNameContaining(String s, Sort sort);

    List<Employee> findByAgeLessThan(Integer age);
    List<Employee> findFirst2ByAgeGreaterThan(Integer age);
    List<Employee> findFirst3ByAgeLessThanOrderByAgeAsc(Integer age);
    List<Employee> findFirst3ByAgeLessThanOrderByLastNameAsc(Integer age);
    void deleteByEmail(String email);

    @Query("select count(e) from Employee e")
    Integer getTotalNumberOfEmployees();

    @Query("select e.age, count(e.age) from Employee e group by  e.age")
    List<?> getAgesWithGrouping();

    @Query(nativeQuery = true, value = "SELECT age AS age, count(age) AS count FROM employee GROUP BY age")
    List<EmployeeAgeStatistics> getAgesWithGroupingNativeQuery();
}


