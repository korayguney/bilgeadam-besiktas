package com.bilgeadam.service;

import com.bilgeadam.model.User;
import com.bilgeadam.util.HashAlgorithm;
import com.bilgeadam.util.SecurityUtils;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserService {
    @PersistenceContext
    EntityManager entityManager;

    public void registerUserToDatabase(User user){
        user.setPassword(SecurityUtils.hassPassword(user.getPassword(), HashAlgorithm.SHA256).toString());
        entityManager.persist(user);
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    public void deleteUser(User user) {
        User foundUser = entityManager.find(User.class, user.getId());
        entityManager.remove(foundUser);
    }

    public User findUser(int userId) {
        return entityManager.find(User.class, userId);
    }

    public void updateUser(User user) {
        entityManager.merge(user);
    }
}
