package bilgeadam.jpa1.test;

import bilgeadam.jpa1.model.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestPhone {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session =  sf.openSession();

        Transaction transaction = session.beginTransaction();

        Phone phone = new Phone("Samsung", "A7", 643786427643L, 4353.44);
        session.save(phone);

        transaction.commit();

        session.close();
        sf.close();

    }
}
