package org.hibernate;

import java.util.*;

import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class GetAll {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		String s1="from student where id>0";
		Query q=s.createQuery(s1);
		java.util.List<student> st=q.list();
		System.out.println("ID        Name        Course        Fees        Address");
		for(student ss:st)
		{
			
			System.out.println(ss.getId()+"         "+ss.getNm()+"       "+ss.getCrse()+"        "+ss.getFees()+"       "+ss.getAdrs());
		}
	}
}

