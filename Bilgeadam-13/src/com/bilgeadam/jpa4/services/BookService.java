package com.bilgeadam.jpa4.services;

import com.bilgeadam.jpa4.models.Author;
import com.bilgeadam.jpa4.models.Library;
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
            //books = em.createQuery("FROM Book", Book.class).getResultList();
            books = em.createNamedQuery("findAllBooks").getResultList();
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
            //book = em.find(Book.class, id);
            book = em.createNamedQuery("findBookById", Book.class).setParameter(0,id).getSingleResult();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

        return book;
    }

    public Book findBookByISBN(long isbn) {
        em = EntityManagerUtils.getEntityManager("mysqlPU");

        Book book;
        try {
            book = em.createNamedQuery("findByISBNNo", Book.class).setParameter(1,isbn).getSingleResult();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

        return book;
    }

    @Override
    public void saveToDatabase(Book book) {
        em = EntityManagerUtils.getEntityManager("mysqlPU");

        try {
            em.getTransaction().begin();
            em.persist(book);
        } finally {
            em.getTransaction().commit();
            EntityManagerUtils.closeEntityManager(em);
        }
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


    public Author findAuthorById(int id) {
        em = EntityManagerUtils.getEntityManager("mysqlPU");

        Author author;
        try {
            author = em.find(Author.class, id);
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

        return author;
    }

    public Library findLibraryById(int id) {
        em = EntityManagerUtils.getEntityManager("mysqlPU");

        Library library;
        try {
            library = em.find(Library.class, id);
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

        return library;
    }
}
