package com.nano.core.inheritanceTest;

public class InheritenceTest
{
    public static void main(String[] args)
    {
	Employee e = new Manager();
	System.out.println(e.salary);
	System.out.println(e.getSalary());

	// 2. ERROR- As getBonus() is not in Employee
	// class.....System.out.println(e.getBonus());
	InheritenceTest obj = new InheritenceTest();
	obj.getEmployeeData(e);
    }

    public void getEmployeeData(Employee e)
    {
	System.out.println(e.getSalary());
    }

    public void getEmployeeData(Manager m)
    {
	System.out.println(m.getSalary());
    }
}

class Employee
{
    public int salary = 5;

    public Employee()
    {

    }

    public int getSalary()
    {
	return 1;
    }
}

class Manager extends Employee
{
    public int salary = 7;

    // 1. getSalary() cannot be declared protected
    public int getSalary()
    {
	return 2;
    }

    public int getBonus()
    {
	return 3;
    }
}