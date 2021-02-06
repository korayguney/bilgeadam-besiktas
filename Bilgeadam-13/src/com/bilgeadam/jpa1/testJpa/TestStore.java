package com.bilgeadam.jpa1.testJpa;

import com.bilgeadam.jpa1.model.Store;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestStore {
    public static void main(String[] args) {

        Store store1 = new Store("Nike", 1456.45, "Viaport AVM");
        Store store2 = new Store("Adidas", 565.76, "Hilltown AVM");
        Store store3 = new Store("Mavi Jeans", 9583, "Akasya AVM");
        Store store4 = new Store("Zara", 4342, "Hilltown AVM");
        Store store5 = new Store("H&M", 633.89, "Ankamall");
        Store store6 = new Store("Kardeşler Kundura", 4756.43, "Ninova AVM");

        List<Store> storeList = new ArrayList<>();
        storeList.add(store1);
        storeList.add(store2);
        storeList.add(store3);
        storeList.add(store4);
        storeList.add(store5);
        storeList.add(store6);

        persistStore(storeList);
        //findStore(5);
        //updateStore( 3, "Zorlu AVM");
        //updateStore("Akasya AVM", "Zorlu AVM");
        //deleteStore(2);
        //deleteStore(store6);
        //findAllStore();
    }

    private static void findAllStore() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager em = emf.createEntityManager();

        List<Store> stores = em.createQuery("FROM Store", Store.class).getResultList();

        stores.stream().forEach(store -> System.out.println(store));


        em.clear();
        em.close();
        emf.close();
    }

    // DELETE DATA
    private static void deleteStore(int storeId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Store s = em.find(Store.class, storeId);
        em.remove(s);

        System.out.println("Data deleted...");
        em.getTransaction().commit();

        em.clear();
        em.close();
        emf.close();
    }

    // DELETE DATA
    private static void deleteStore(Store store) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        store = em.createQuery("SELECT s FROM Store s WHERE s.storeName=:storeNameAttr", Store.class)
                .setParameter("storeNameAttr",store.getStoreName()).getSingleResult();
        em.remove(store);

        System.out.println("Store deleted...");
        em.getTransaction().commit();

        em.clear();
        em.close();
        emf.close();
    }

    // UPDATE DATA
    private static void updateStore(int storeId, String updated_name) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Store s = findStore(storeId);
        s.setStoreAddress(updated_name);
        em.merge(s);

        System.out.println("Data updated...");
        em.getTransaction().commit();

        em.clear();
        em.close();
        emf.close();
    }

    // SELECT DATA
    private static Store findStore(int storeId) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager em = emf.createEntityManager();

        Store s = em.find(Store.class, storeId);
        System.out.println(s);

        em.clear();
        em.close();
        emf.close();

        return s;
    }

    // INSERT DATA
    private static void persistStore(List<Store> storeList) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqlPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        for (Store store : storeList) {
            em.persist(store);
        }

        System.out.println("Data persisted...");
        em.getTransaction().commit();

        em.clear();
        em.close();
        emf.close();
    }
}
