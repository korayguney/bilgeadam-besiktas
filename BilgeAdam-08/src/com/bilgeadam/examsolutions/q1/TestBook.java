package com.bilgeadam.examsolutions.q1;

public class TestBook {
    public static void main(String[] args) {


        Page page1 = new Page(1, "aaa");
        Page page2 = new Page(2, "bbb");
        Page page3 = new Page(3, "ccc");
        Page page4 = new Page(4, "ddd");
        Page page5 = new Page(5, "eee");

        Page[] pages = {page1, page2, page3, page4, page5};

        Chapter chapter1 = new Chapter(1, "Chapter 1", pages);
        Chapter chapter2 = new Chapter(2, "Chapter 2", pages);

        Chapter[] chapters = {chapter1, chapter2};

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", chapters);
        Book book2 = new Book("The Lord of the Rings: The Fellowship of the Ring", chapters);

        Book[] books = {book1,book2};

        BookShelf bookShelf = new BookShelf(books);
        System.out.println(bookShelf.getInfo());

        System.out.println("-----------------------");
        Book bookRes = bookShelf.pickUpBook(1);
        System.out.println(bookRes.getTitle());

    }


}
