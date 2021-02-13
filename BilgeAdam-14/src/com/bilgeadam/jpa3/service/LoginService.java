package com.bilgeadam.jpa3.service;

import com.bilgeadam.jpa3.exception.ExceptionCode;
import com.bilgeadam.jpa3.model.LoginModel;
import com.bilgeadam.jpa3.model.RegisterModel;
import com.bilgeadam.jpa3.model.ResponseModel;
import com.bilgeadam.jpa3.utils.EntityManagerUtils;

import javax.persistence.EntityManager;
import java.util.List;


public class LoginService {
    public ResponseModel check_login_credentials_on_db(LoginModel login) {
        EntityManager em = EntityManagerUtils.getEntityManager("mysqlPU");
        List<LoginModel> loginModelList = em.createQuery("from LoginModel l WHERE l.username =:username AND l.password =:password")
                .setParameter("username", login.getUsername()).setParameter("password", login.getPassword())
                .getResultList();

        try {
            if(loginModelList.size() > 0){
                return new ResponseModel(true, null);
            } else {
                return new ResponseModel(false, ExceptionCode.USER_IS_NOT_FOUND_ON_DB);
            }
        } finally {
            EntityManagerUtils.closeEntityManager(em);
        }
    }
}
