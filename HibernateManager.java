package COM.TAP.manager;

import java.lang.module.Configuration;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import COM.TAP.Employee;

import jakarta.transaction.Transaction;

public class HibernateManager {
		Session session=null;
		public void connect()
		{
			 session = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory().openSession();
		}
		public void add(Employee e)
		{
			session.beginTransaction();
			session.save(e);
			session.beginTransaction().commit();
		}
		public Employee getUserbyId(int id)
		{
			Employee e=session.get(Employee.class,id);
			return e;
		}
		public void updateEmployee(Employee e)
		{
			session.beginTransaction();
			session.update(e);
			session.beginTransaction().commit();
		}
		public void delete(int id) {
			session.beginTransaction();
			Employee e1=session.get(Employee.class, id);
			if(e1!=null)
			{
				session.delete(e1);
			}
			else
			{
				System.out.println("no data here for delete");
			}
			session.beginTransaction().commit();
			
		}
		public void getAll() {
			String q="select*from Employee";
			Query q1=session.createQuery(q);
			List<Employee> list=q1.list();
			
			for(Employee e:list)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getDept()+" "+e.getSalary());
			}
		   session.beginTransaction().commit();
			
		}
	}
  

