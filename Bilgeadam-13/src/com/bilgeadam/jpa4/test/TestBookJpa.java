package com.bilgeadam.jpa4.test;

import com.bilgeadam.jpa2.utils.EntityManagerUtils;
import com.bilgeadam.jpa4.models.Author;
import com.bilgeadam.jpa4.models.Book;
import com.bilgeadam.jpa4.models.Category;
import com.bilgeadam.jpa4.models.Library;
import com.bilgeadam.jpa4.services.BookService;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.persistence.EntityManager;
import java.util.List;

public class TestBookJpa {
    private static final Logger logger = Logger.getLogger(TestBookJpa.class);
    private static BookService service = null;

    public static void main(String[] args) {

        BasicConfigurator.configure();
        Logger.getRootLogger().setLevel(Level.INFO);

        service = new BookService();
        //persistTestData();
        //findAllBooks();
        //findBookById(4);
        //findBookByISBN(4364265424L);
        saveBookToDb();
    }

    private static void saveBookToDb() {
        Book book = new Book("Hobbit", 463756347L, 36.50);
        Author author = service.findAuthorById(2);
        book.setAuthor(author);
        book.setCategory(Category.FANTASTIC);
        Library library = service.findLibraryById(1);
        book.getLibraries().add(library);

        service.saveToDatabase(book);
        logger.info("BOOK SAVED: " + book.getBookname());
    }

    private static void findBookByISBN(long isbn) {
        Book b = service.findBookByISBN(isbn);
        logger.info(b);
    }

    private static void findBookById(int id) {
        Book b = service.findById(id);
        logger.info(b);
    }

    private static void findAllBooks() {

        List<Book> books = service.findAll();
        for (Book book : books) {
            logger.info(book);
        }
    }

    private static void persistTestData() {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        em.getTransaction().begin();

        Author author1 = new Author("Dan Brown", "Italy");
        Author author2 = new Author("JRR Tokien", "Latin America");
        Author author3 = new Author("Orhan Pamuk", "Istanbul");

        Library library1 = new Library("Merkez Kütüphane", "Ankara");
        Library library2 = new Library("Central Library", "New York");

        Book book1 = new Book("Melekler ve Şeytanlar", 4364265424L, 45.0);
        Book book2 = new Book("Yüzüklerin Efendisi ve Yüzük Kardeşliği", 534654764567L, 65.0);
        Book book3 = new Book("Kâr", 8576847648L, 25.0);
        Book book4 = new Book("Yüzüklerin Efendisi ve Kralın Dönüşü", 5764643565L, 72.0);

        book1.setCategory(Category.HORROR);
        book2.setCategory(Category.FANTASTIC);
        book3.setCategory(Category.DRAMA);
        book4.setCategory(Category.FANTASTIC);

        book1.setAuthor(author1);
        book2.setAuthor(author2);
        book3.setAuthor(author3);
        book4.setAuthor(author2);

        book1.getLibraries().add(library1);
        book2.getLibraries().add(library1);
        book3.getLibraries().add(library2);
        book4.getLibraries().add(library2);

        em.persist(author1);
        em.persist(author2);
        em.persist(author3);

        em.persist(book1);
        em.persist(book2);
        em.persist(book3);
        em.persist(book4);

        em.persist(library1);
        em.persist(library2);

        em.getTransaction().commit();

        System.out.println("All data persisted...");

        EntityManagerUtils.closeEntityManager(em);


    }
}
