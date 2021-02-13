package com.bilgeadam.jpa3.service;

import com.bilgeadam.jpa3.exception.ExceptionCode;
import com.bilgeadam.jpa3.model.LoginModel;
import com.bilgeadam.jpa3.model.RegisterModel;
import com.bilgeadam.jpa3.model.ResponseModel;
import com.bilgeadam.jpa3.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;

public class RegisterService {

    public ResponseModel saveUserToDB(RegisterModel registerModel) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        try {
            em.getTransaction().begin();
            LoginModel loginModel = new LoginModel(registerModel.getUsername(),registerModel.getPassword());
            em.persist(loginModel);
            em.getTransaction().commit();
            return new ResponseModel(true, null);

        }catch (Exception e) {
            em.getTransaction().rollback();
            return new ResponseModel(false, ExceptionCode.HIBERNATE_TRANSACTION_EXCEPTION_GENERATED);
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }

    public ResponseModel checkUsernameIsExistOrNotOnDB(RegisterModel registerModel) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        List<LoginModel> loginModelList = em.createQuery("from LoginModel l WHERE l.username =:username AND l.password =:password")
                .setParameter("username", registerModel.getUsername()).setParameter("password", registerModel.getPassword())
                .getResultList();

        try {
            if(loginModelList.size() > 0){
                return new ResponseModel(false, ExceptionCode.USERNAME_IS_ALREADY_REGISTERED);
            } else {
                return new ResponseModel(true, null);
            }
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }
}
