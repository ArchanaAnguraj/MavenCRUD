package COM.TAP;

import org.hibernate.mapping.List;

import COM.TAP.manager.HibernateManager;

public class EmployeeApp {
  public static void main(String[]args) {
	  Employee e=new Employee(1,"anu","ece",70000);
	  HibernateManager hm=new HibernateManager();
	  hm.connect();
	  
	  hm.add(e); //this for insert
	  System.out.println("inserted");
	  
	  
	  Employee e1=hm.getUserbyId(1); //this is for fetching
	  System.out.println("fetched");
	  
	  hm.updateEmployee(e);//this for update
	  System.out.println("updated");
	  
	  
	  hm.delete(5); //this fot delete
	  System.out.println("deleted");
	  
	  List list=(List) hm.getAll();
	  for(Employee l:list)
	  {
		  System.out.println(l);
	  }
	
}
}
