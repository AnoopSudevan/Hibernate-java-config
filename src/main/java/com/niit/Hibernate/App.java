package com.niit.Hibernate;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.Hibernate.model.Department;
import com.niit.Hibernate.model.Employee;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SecurityException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException
    {
    	SessionFactory sessionFactory = HBConfig.createSessionFactory();
		Employee e = new Employee();
		e.setEmpname("Ef");
		e.setDesignation("PA");
		e.setDept("HR");
		Session s=sessionFactory.openSession();
		org.hibernate.Transaction txt=s.beginTransaction();
		s.save(e);
		txt.commit();
		s.close();
		SessionFactory sessionFactory1 = HBConfig.createSessionFactory();
		Department d = new Department();
		d.setDept("HR");
		Session s1=sessionFactory1.openSession();
		org.hibernate.Transaction txt1=s1.beginTransaction();
		s1.save(d);
		txt1.commit();
		s1.close();
		
 
    }
}
