package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.model.Address;
import com.nt.model.Employee;

public class Client 
{
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory sf=cfg.buildSessionFactory();
	Session ses=sf.openSession();
	Employee emp=new Employee();
	Address a1=new Address();
	a1.setHlandmark("near canera bank");
	a1.setHno(101);
	a1.setHname("Swadist Aahar");
	emp.setEno(123);
	emp.setPname("Sandeep");
	emp.setAddr(a1);
	Transaction tx=ses.beginTransaction();
	ses.save(emp);
	tx.commit();
	ses.close();
	
	
	
}
}
