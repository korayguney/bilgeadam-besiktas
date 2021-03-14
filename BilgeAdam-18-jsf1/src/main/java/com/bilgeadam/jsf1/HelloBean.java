package com.bilgeadam.jsf1;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "hello")
public class HelloBean {

    private String text = " first JSF ManagedBean class";
    private String name;

    public String sayHello(){
       return this.name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
