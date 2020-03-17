package com.teal.library.springsecurityjwt;
import com.teal.library.springsecurityjwt.viewmodels.UserForm;
import org.hibernate.Session;
import org.hibernate.query.*;
import com.teal.library.springsecurityjwt.models.*;

public class DataAccess {

    public int addUser(User user, int readerid){
        try{
            Session session = HibernateORM.getSessionFactory().openSession();
            session.beginTransaction();
            user.setReaderID(readerid);
            session.save(user);
            session.getTransaction().commit();
            return 1;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
    public int addReader(UserForm user){
        try{
            Reader newReader = new Reader();
            newReader.setFirstname(user.getFirstname());
            newReader.setLastname(user.getLastname());
            newReader.setAddress(user.getAddress());
            newReader.setEmail(user.getEmail());
            newReader.setRtype(user.getType());
            newReader.setZipcode(user.getZipcode());
            Session session = HibernateORM.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(newReader);
            session.getTransaction().commit();
            return newReader.getReaderid();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
