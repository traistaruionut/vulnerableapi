package controllers;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class QueryTry {

    @Autowired
    EntityManagerFactory entityManagerFactory;

    public void tryQuery(String a, String b){
        EntityManager session = entityManagerFactory.createEntityManager();
        session.createNativeQuery("select * from users where username="+a);
        if(session.isOpen()) session.close();
    }

}
