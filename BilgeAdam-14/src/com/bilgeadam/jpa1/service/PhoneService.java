package com.bilgeadam.jpa1.service;

import com.bilgeadam.jpa1.model.Phone;
import com.bilgeadam.jpa1.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class PhoneService implements CrudRepository<Phone>{
    @Override
    public List<Phone> findAll() {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");
        List<Phone> phones = em.createQuery("from Phone", Phone.class).getResultList();
        EntityManagerUtils.closeEntityManager(em);
        return phones;
    }

    @Override
    public Phone findById(int id) {
        return null;
    }

    @Override
    public void saveToDatabase() {
        EntityManager em =EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();

            Phone phone1 = new Phone("Samsung","S8+",563478653486L,6000);
            Phone phone2 = new Phone("Sony","Experia",856654987545L,4500);
            Phone phone3 = new Phone("IPhone","SE",7653465346563L,5560);

            em.persist(phone1);
            em.persist(phone2);
            em.persist(phone3);

            System.out.println("All phones are persisted to DB...");

            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Phone object) {

    }

    @Override
    public void deleteFromDatabase(int id) {

    }

    @Override
    public void updateOnDatabase(Phone object) {

    }

    @Override
    public boolean isExistsOnDatabase(Phone object) {
        return false;
    }
}
