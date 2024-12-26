package org.hibernate;

import java.util.Scanner;

import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id=sc.nextInt();
		student st=s.get(student.class, id);
		if(id==0)
		{
			System.out.println("Data not found");
		}
		else {
			System.out.println("ID        Name        Course        Fees        Address");
			System.out.println(st.getId()+"         "+st.getNm()+"       "+st.getCrse()+"        "+st.getFees()+"       "+st.getAdrs());
			System.out.println();
			System.out.println("\n What do you want to update");
			System.out.println("press 1 for Name Update");
			System.out.println("press 2 for Course Update");
			System.out.println("press 3 for Fees Update");
			System.out.println("press 4 for Address Update");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println("please enter new Name : ");
				String nm=sc.next();
				st.setNm(nm);
				s.saveOrUpdate(st);
				t.commit();
				System.out.println("update success");
				s.close();
			}
			else if(n==2) {
				System.out.println("please enter new Course : ");
				String crse=sc.next();
				st.setCrse(crse);
				s.saveOrUpdate(st);
				t.commit();
				System.out.println("update success");
				s.close();
			}
			else if(n==3) {
				System.out.println("please enter Updated Fees : ");
				int fees=sc.nextInt();
				st.setFees(fees);
				s.saveOrUpdate(st);
				t.commit();
				System.out.println("update success");
				s.close();
			}
			else if(n==4) {
				System.out.println("please enter new Address : ");
				String adrs=sc.next();
				st.setAdrs(adrs);
				s.saveOrUpdate(st);
				t.commit();
				System.out.println("update success");
				s.close();
			}
			else {
				System.out.println("invalid id");
			}
		}
				
		
	}
}
