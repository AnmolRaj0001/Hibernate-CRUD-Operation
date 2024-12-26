package org.hibernate;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;

public class SearchByID {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		student st=s.get(student.class, id);
		if(id==0)
		{
			System.out.println("Data not found");
		}
		else {
			System.out.println("ID        Name        Course        Fees        Address");
			System.out.println(st.getId()+"         "+st.getNm()+"       "+st.getCrse()+"        "+st.getFees()+"       "+st.getAdrs());
		}
	}

}
