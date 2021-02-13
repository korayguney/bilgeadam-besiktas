package bilgeadam.jpa2;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class HibernateUtils {
    private static final SessionFactory SESSION_FACTORY;

    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Session getSession() {
        return SESSION_FACTORY.openSession();
    }

    public static void main(String[] args) {
        Session session = getSession();
        session.beginTransaction();

        City city1 = new City("Ankara","TR");
        City city2 = new City("Diyarbakır","TR");
        City city3 = new City("Istanbul","TR");

        Set<City> cities = new HashSet<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);

        Country country = new Country("Turkiye", cities);
        session.saveOrUpdate(country);

        session.getTransaction().commit();
        session.close();


        // start new session to fetch type
        session = getSession();
        session.beginTransaction();

        Country country1 = session.get(Country.class, 1);
        System.out.println(country1.getCities().size());

        session.clear();
        session.close();


    }
}
