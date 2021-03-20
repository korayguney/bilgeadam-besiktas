package com.bilgeadam.service;

import com.bilgeadam.model.User;
import com.bilgeadam.util.HashAlgorithm;
import com.bilgeadam.util.SecurityUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class LoginService {
    @PersistenceContext
    EntityManager entityManager;


    public boolean checkUserOnDB(String email, String password) {
        TypedQuery<User> query = entityManager.createQuery("select u from User u WHERE email=:useremail AND password=:userpassword", User.class);
        query.setParameter("useremail",email);
        query.setParameter("userpassword", SecurityUtils.hassPassword(password, HashAlgorithm.SHA256).toString());
        List<User> result = query.getResultList();

        boolean isExists = result.size()>0?true:false;
        return isExists;
    }


    public User getUser(String email, String password) {

        TypedQuery<User> query = entityManager.createQuery("select u from User u WHERE email=:useremail AND password=:userpassword", User.class);
        query.setParameter("useremail",email);
        query.setParameter("userpassword", SecurityUtils.hassPassword(password, HashAlgorithm.SHA256).toString());
        List<User> result = query.getResultList();

        return result.get(0);
    }
}
