package com.bilgeadam.jpa1.service;

import com.bilgeadam.jpa1.model.Phone;
import com.bilgeadam.jpa1.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class PhoneService implements CrudRepository<Phone> {
    @Override
    public List<Phone> findAll() {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        List<Phone> phones = em.createQuery("from Phone", Phone.class).getResultList();
        EntityManagerUtils.closeEntityManager(em);
        return phones;
    }

    @Override
    public Phone findById(int id) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        Phone phone = em.find(Phone.class, id);
        EntityManagerUtils.closeEntityManager(em);
        return phone;
    }

    @Override
    public void saveToDatabase() {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();

            Phone phone1 = new Phone("Samsung", "S8+", 563478653486L, 6000);
            Phone phone2 = new Phone("Sony", "Experia", 856654987545L, 4500);
            Phone phone3 = new Phone("IPhone", "SE", 7653465346563L, 5560);

            em.persist(phone1);
            em.persist(phone2);
            em.persist(phone3);

            System.out.println("All phones are persisted to DB...");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void saveToDatabase(Phone phone) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();

            em.persist(phone);

            System.out.println("Phone is persisted to DB...");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(Phone phone) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();
            List<Phone> phoneList = em.createQuery("from Phone p WHERE p.model=:phonemodel").setParameter("phonemodel", phone.getModel()).getResultList();
            em.remove(phoneList.get(0));

            System.out.println("Deleted from DB...");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void deleteFromDatabase(int id) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();
            Phone p = em.find(Phone.class, id);
            em.remove(p);

            System.out.println("Deleted from DB...");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public void updateOnDatabase(int id) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();
            Phone p = em.find(Phone.class, id);
            p.setPrice(100000);
            em.merge(p);

            System.out.println("Deleted from DB...");

            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    @Override
    public boolean isExistsOnDatabase(Phone phone) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        List<Phone> phones = em.createQuery("from Phone p WHERE p.imei=:imei", Phone.class)
                .setParameter("imei",phone.getImei()).getResultList();
        EntityManagerUtils.closeEntityManager(em);
        boolean result = (phones.size()>0)?true:false;
        return result;
    }
}
