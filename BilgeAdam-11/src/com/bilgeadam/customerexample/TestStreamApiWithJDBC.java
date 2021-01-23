package com.bilgeadam.customerexample;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestStreamApiWithJDBC {

    public static void main(String[] args) {

        List<Customer> customerList = JDBCUtil.getCustomerList();

        customerList.stream().sorted(Comparator.comparingInt(Customer::getAge)).filter(c -> c.getSalary() > 7500).forEach(c -> System.out.println(c));

    }
}
