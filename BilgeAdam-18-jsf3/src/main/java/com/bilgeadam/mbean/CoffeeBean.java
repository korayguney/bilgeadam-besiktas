package com.bilgeadam.mbean;

import com.bilgeadam.model.Coffee;
import com.bilgeadam.service.CoffeeService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
public class CoffeeBean {

    private Coffee coffee = new Coffee();
    private List<Coffee> coffeeList = new ArrayList<>();

    @PostConstruct
    public void init(){
        coffeeList = coffeeService.getAllOrders();
    }

    @EJB
    CoffeeService coffeeService;

    public void saveCustomerOrder(){
        coffeeService.saveOrder(coffee);
    }

    public void deleteOrder(Coffee coffee){
        coffeeService.deleteOrder(coffee);
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public List<Coffee> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Coffee> coffeeList) {
        this.coffeeList = coffeeList;
    }

    public CoffeeService getCoffeeService() {
        return coffeeService;
    }

    public void setCoffeeService(CoffeeService coffeeService) {
        this.coffeeService = coffeeService;
    }
}
