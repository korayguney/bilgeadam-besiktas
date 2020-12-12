package com.bilgeadam.exceptionchallenge2;

public class TestEmployee {

    public static void main(String[] args) throws InvalidOperationException {
        Employee employee1 = new Employee(0,"Faik Mert", "Özen", 15000.56f);
        Employee employee2 = new Employee(1,"Veli", "Bostan", 16000.56f);
        Employee employee3 = new Employee(2,"Kaan", "Keskin", 18000.33f);

        EmployeeImpl empImpl = new EmployeeImpl();
        empImpl.add(employee1);
        empImpl.add(employee2);
        empImpl.add(employee3);

        //empImpl.add(employee1);
        System.out.println("-------------------------------------");
        System.out.println(empImpl.findById(1));

        System.out.println("-------------------------------------");
        empImpl.delete(88);

        System.out.println("-------------------------------------");
        for (Employee e: empImpl.getAllEmployees()) {
            System.out.println(e);
        }





    }
}
