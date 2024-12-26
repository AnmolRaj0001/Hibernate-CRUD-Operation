package org.hibernate;
import java.util.Scanner;
import org.hibernate.cfg.Configuration;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        
        student stu=new student();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Name");
		String nm=sc.next();
        stu.setNm(nm);
        
        System.out.println("Enter Course");
		String crse=sc.next();
        stu.setCrse(crse);
        
        System.out.println("Enter Fees");
		int fees=sc.nextInt();
		stu.setFees(fees);
		
		System.out.println("Enter Address");
		String adrs =sc.next();
        stu.setAdrs(adrs);
        
        s.save(stu);
        t.commit();
        System.out.println("data store");
        s.close();
    }
}
