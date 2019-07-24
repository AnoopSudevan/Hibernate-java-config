package com.niit.Hibernate;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.niit.Hibernate.model.Department;
import com.niit.Hibernate.model.Employee;

public class HBConfig {
public static SessionFactory createSessionFactory()
{
	Properties properties=new Properties();
	properties.setProperty(Environment.DRIVER,"org.h2.Driver");
	properties.setProperty(Environment.URL,"jdbc:h2:tcp://localhost/~/test");
	properties.setProperty(Environment.USER,"sa");
	properties.setProperty(Environment.PASS,"sa");
	properties.setProperty(Environment.DIALECT,"");
	properties.setProperty(Environment.HBM2DDL_AUTO,"update");
	properties.setProperty(Environment.SHOW_SQL,"true");
	Configuration con=new Configuration();
	con.setProperties(properties);
	con.addAnnotatedClass(Employee.class);
	con.addAnnotatedClass(Department.class);
	SessionFactory sessionfactory= con.buildSessionFactory();
	return sessionfactory;
	
}
}
