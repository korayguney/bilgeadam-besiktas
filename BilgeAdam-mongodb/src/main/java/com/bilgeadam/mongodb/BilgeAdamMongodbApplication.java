package com.bilgeadam.mongodb;

import com.bilgeadam.mongodb.model.Address;
import com.bilgeadam.mongodb.model.Employee;
import com.bilgeadam.mongodb.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@SpringBootApplication
@Slf4j
public class BilgeAdamMongodbApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilgeAdamMongodbApplication.class, args);
    }


    @Bean
    CommandLineRunner runner(EmployeeRepository repository, MongoTemplate mongoTemplate) {
        return args -> {
            Address address1 = new Address("Atatürk cad.", "Istanbul", 34900);
            Employee employee1 = new Employee(
                    "Koray",
                    "Guney",
                    11111111111L,
                    BigDecimal.valueOf(2500.45),
                    Employee.Gender.MALE,
                    address1,
                    Arrays.asList("TSK", "Netaş", "AvivaSA"),
                    LocalDateTime.now());

            if(repository.findEmployeeBySsid(employee1.getSsid()).isPresent()){
                log.info("Employee is already exists and NOT saved : " + employee1.getFirstname() + " " + employee1.getLastname());
            } else {
                log.info("Employee is saved : " + employee1.getFirstname() + " " + employee1.getLastname());
                repository.insert(employee1);
            }

            Employee foundEmployee = repository.findEmployeeByFirstnameAndLastname("Koray", "Guneyy");
            if(foundEmployee != null) log.info("Employee found : " + foundEmployee.getFirstname());

            /*

                Query query = new Query();
                query.addCriteria(Criteria.where("ssid").is(employee1.getSsid()));

                List<Employee> employees = mongoTemplate.find(query, Employee.class);

                if(employees.isEmpty()){
                    log.info("Employee is saved : " + employee1.getFirstname() + " " + employee1.getLastname());
                    repository.insert(employee1);
                } else {
                    log.info("Employee is already exists and NOT saved : " + employee1.getFirstname() + " " + employee1.getLastname());
                }

             */
        };
    }
}
