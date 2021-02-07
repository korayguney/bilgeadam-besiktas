package com.bilgeadam.jpa4.services;

import com.bilgeadam.jpa4.utils.EntityManagerUtils;
import com.bilgeadam.jpa4.models.Book;
import com.bilgeadam.jpa4.repository.CrudRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class BookService implements CrudRepository<Book> {
    EntityManager em = null;

    @Override
    public List<Book> findAll() {
        em = EntityManagerUtils.getEntityManager("mysqlPU");

        List<Book> books;
        try {
            books = em.createQuery("FROM Book", Book.class).getResultList();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
        return books;
    }

    @Override
    public Book findById(int id) {
        em = EntityManagerUtils.getEntityManager("mysqlPU");

        Book book;
        try {
            book = em.find(Book.class, id);
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

        return book;
    }

    @Override
    public void saveToDatabase(Book object) {

    }

    @Override
    public void deleteFromDatabase(Book object) {

    }

    @Override
    public void deleteFromDatabase(int id) {

    }

    @Override
    public void updateOnDatabase(Book object) {

    }

    @Override
    public boolean isExistsOnDatabase(Book object) {
        return false;
    }
}
