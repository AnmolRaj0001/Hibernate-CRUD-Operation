package org.hibernate;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;

import antlr.CSharpCodeGenerator;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id for delete");
		int id=sc.nextInt();
		student st=s.get(student.class, id);
		if(st!= null)
		{
		System.out.println(st.getId()+" "+st.getNm()+" "+st.getCrse()+" "+st.getFees()+" "+st.getAdrs());
		s.delete(st);
		t.commit();
		System.out.println("deleted");
	}
		else {
			System.out.println("Record Not found");
		}

}
}
