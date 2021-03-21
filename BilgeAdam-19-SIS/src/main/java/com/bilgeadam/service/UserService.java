package com.bilgeadam.service;

import com.bilgeadam.model.User;
import com.bilgeadam.util.HashAlgorithm;
import com.bilgeadam.util.SecurityUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class UserService {
    @PersistenceContext
    EntityManager entityManager;

    public void registerUserToDatabase(User user){
        user.setPassword(SecurityUtils.hassPassword(user.getPassword(), HashAlgorithm.SHA256).toString());
        entityManager.persist(user);
    }


}
