package com.bilgeadam.jpa1.service;

import java.util.List;

public interface CrudRepository<T> {
    List<T> findAll();
    T findById(int id);
    void saveToDatabase();
    void saveToDatabase(T object);
    void deleteFromDatabase(T object);
    void deleteFromDatabase(int id);
    void updateOnDatabase(int id);
    boolean isExistsOnDatabase(T object);

}
