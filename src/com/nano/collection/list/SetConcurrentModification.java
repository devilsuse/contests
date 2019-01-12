package com.nano.collection.list;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetConcurrentModification
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// ConcurrentHashMap<K, V>
		Employee a = new Employee(1, "aaa");
		Employee b = new Employee(2, "bbb");
		Employee c = new Employee(3, "ccc");
		Set<Employee> employeeSet = new HashSet<Employee>();
		employeeSet.add(a);
		employeeSet.add(b);
		employeeSet.add(c);

		if (employeeSet.contains(new Employee(1, "aaa")))
			System.out.println("Yes its there.......");
		else
			System.out.println("See U SHOULD override hasCode() METHOD as well When u override EQUALS...........");

		Iterator<Employee> itr = employeeSet.iterator();
		Employee aEmp = null;
		int count = 0;

		while (itr.hasNext())
		{
			System.out.println(++count);

			aEmp = itr.next();
			if (aEmp.getEmpId() == 2)
				aEmp.setEmpId(99);
		}

		System.out.println("\n\nSecond Iteration.....\n");
		itr = employeeSet.iterator();
		while (itr.hasNext())
		{
			// System.out.println(++count);

			aEmp = itr.next();
			employeeSet.add(new Employee(7, "should give error"));
			System.out.println(aEmp.getEmpId());
		}
		System.out.println(b.getEmpId());
	}
}

class Employee
{
	private int		empId	= 0;
	private String	name	= null;

	public Employee(int empId, String name)
	{
		this.empId = empId;
		this.name = name;
	}

	public boolean equals(Object obj)
	{
		if (!(obj instanceof Employee))
			return false;
		Employee emp = (Employee) obj;

		return (this.empId == emp.empId && this.name.equals(emp.name) ? true : false);
	}

	public int hashCode()
	{
		int result = 31;
		result += 17 * empId;
		result += 17 * name.hashCode();
		return result;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId()
	{
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}

}
