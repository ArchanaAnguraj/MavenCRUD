package COM.TAP;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="id")
   private int id;
	@Column(name="name")
   private String name;
	@Column(name="dept")
   private String dept;
	@Column(name="salary")
   private int salary;

   
public Employee(int id, String name, String dept, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}

public Employee() {
	super();
}

public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the dept
 */
public String getDept() {
	return dept;
}
/**
 * @param dept the dept to set
 */
public void setDept(String dept) {
	this.dept = dept;
}
/**
 * @return the salary
 */
public int getSalary() {
	return salary;
}
/**
 * @param salary the salary to set
 */
public void setSalary(int salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
}
   
}
