package com.bilgeadam.jpa4.listeners;

import javax.persistence.*;

public class LoadDataListener<T> {

    @PrePersist
    public void prePersistMethod(T entity){
        System.out.println("Inside prePersistMethod");
    }

    @PreUpdate
    public void preUpdateMethod(T entity){
        System.out.println("Inside preUpdateMethod");
    }

    @PreRemove
    public void preRemoveMethod(T entity){
        System.out.println("Inside preRemoveMethod");
    }

    @PostLoad
    public void postLoadMethod(T entity){
        System.out.println("Inside postLoadMethod");
    }

    @PostPersist
    public void postPersistMethod(T entity){
        System.out.println("Inside postPersistMethod");
    }

    @PostUpdate
    public void postUpdateMethod(T entity){
        System.out.println("Inside postUpdateMethod");
    }

    @PostRemove
    public void postRemoveMethod(T entity){
        System.out.println("Inside postRemoveMethod");
    }
}
