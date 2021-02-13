package com.bilgeadam.jpa2.test;

import com.bilgeadam.jpa1.utils.EntityManagerUtils;
import com.bilgeadam.jpa2.models.Check;
import com.bilgeadam.jpa2.models.CreditCard;
import com.bilgeadam.jpa2.models.Payment;

import javax.persistence.EntityManager;
import java.time.LocalDate;
import java.time.Month;

public class TestPayment {
    public static void main(String[] args) {

        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();

            Payment creditCard = new CreditCard(365462534524L, "VISA", LocalDate.of(2023, Month.JANUARY, 2));
            creditCard.setAmount(3424.66);
            Payment check = new Check("Check No-1", "GHG7878NNJ");
            em.persist(creditCard);
            em.persist(check);
            em.getTransaction().commit();
            System.out.println("Persisted to DB...");
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }

    }
}
