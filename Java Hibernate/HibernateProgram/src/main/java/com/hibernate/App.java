package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
      // User u1 = new User(4, "Vignesh", 745321423, "Jamnagar", "vignesh@gmail.com", "v@123");
        
        //session.save(u1);
        
        //session.update(u1);
        
        User u = session.get(User.class,4);
        //System.out.println(u1);
        
        System.out.println(u);
        
        tx.commit();
        session.close();
        sf.close();
        
    }
}
