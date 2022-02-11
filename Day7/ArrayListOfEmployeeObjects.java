package com.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOfEmployeeObjects {
	public static void main(String[] args) {
		ArrayList<Employee1> list = new ArrayList<Employee1>();
		Employee1 e=new Employee1(101, "Bob", "123 street, India", 20000.0);
		list.add(e);
		Employee1 e1=new Employee1(102, "Alice", "234 street, India", 30000.0);
		list.add(e1);
		Employee1 e2=new Employee1(103, "John", "345 street, India", 25000.0);
		list.add(e2);
		Employee1 e3=new Employee1(104, "Stuart", "456 street, India", 40000.0);
		list.add(e3);
		
		Iterator<Employee1> it = list.iterator();
		int searchId = 102;
		while (it.hasNext()) {
			Employee1 emp = it.next();
			if (emp.getId() == searchId)
				System.out.println(emp);
		}
	}

}

class Employee1 {
	private int id;
	private String name;
	private String address;
	private Double salary;
public Employee1(){}
	
	public Employee1(int id, String name, String address, Double salary) {
	    super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}	
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}
