package com.bilgeadam.jsf1;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "calculator")
public class CalculatorBean {

    private double firstDigit;
    private double secondDigit;
    private double result;

    public void sum(){
        result = firstDigit + secondDigit;
    }

    public void subtract(){
        result = firstDigit - secondDigit;
    }

    public void multiply(){
        result = firstDigit * secondDigit;
    }

    public void devide(){
        result = firstDigit / secondDigit;
    }

    public double getFirstDigit() {
        return firstDigit;
    }

    public void setFirstDigit(double firstDigit) {
        this.firstDigit = firstDigit;
    }

    public double getSecondDigit() {
        return secondDigit;
    }

    public void setSecondDigit(double secondDigit) {
        this.secondDigit = secondDigit;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
